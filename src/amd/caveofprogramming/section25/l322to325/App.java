package amd.caveofprogramming.section25.l322to325;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

/*
 * Pick two large texts. Example: George Orwell, 1984 and Animal Farm.
 * 
 * How many *unique* words are in each of these texts?
 * 
 * What words are only found in 1984?
 * What words are only found in Animal Farm?
 * Print these out.
 * 
 * Print a list of all words that are found in both texts, 
 * sorted in alphabetical order.
 */

public class App {

    public static void main(String[] args) throws IOException {

        File file1 = new File("1984.txt");
        File file2 = new File("ferma.txt");

        TreeSet<String> book1984 = getSetWithWords(file1);
        displaySet(book1984, file1.getName());
        System.out.println();

        TreeSet<String> bookAnimal = getSetWithWords(file2);
        displaySet(bookAnimal, file2.getName());
        System.out.println();
        
        System.out.println();

        displayExtra(book1984, bookAnimal, file1.getName());
        System.out.println();
        displayExtra(bookAnimal, book1984, file2.getName());
        System.out.println();
        displayUnion(book1984, bookAnimal);
        System.out.println();
        displayIntersection(book1984, bookAnimal);

    }

    /**
     * Display what is extra in a set
     * 
     * @param set1
     * @param set2
     */
    private static void displayExtra(TreeSet<String> set1, TreeSet<String> set2, String name) {
        TreeSet<String> extraSet = new TreeSet<String>();
        extraSet.addAll(set1);
        extraSet.removeAll(set2);
        System.out.printf("There are %d unique words in file %s.\n", extraSet.size(), name);
        displaySet(extraSet, name);
    }

    /**
     * Display the union of two sets
     * 
     * @param set1
     * @param set2
     */
    private static void displayUnion(TreeSet<String> set1, TreeSet<String> set2) {
        TreeSet<String> unionSet = new TreeSet<String>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);
        System.out.printf("There are %d unique words in the two files.\n", unionSet.size());
        displaySet(unionSet, "Union");
    }

    /**
     * Display the intersections of two sets
     * 
     * @param set1
     * @param set2
     */
    private static void displayIntersection(TreeSet<String> set1, TreeSet<String> set2) {
        TreeSet<String> intersectionSet = new TreeSet<String>();
        intersectionSet.addAll(set1);
        intersectionSet.retainAll(set2);
        System.out.printf("There are %d common words in the two files.\n", intersectionSet.size());
        displaySet(intersectionSet, "Intersection");
    }

    /**
     * Get the words from a file, returns a set with the words
     * 
     * @param file
     * @return
     * @throws IOException
     */
    private static TreeSet<String> getSetWithWords(File file) throws IOException {
        TreeSet<String> set = new TreeSet<String>();
        BufferedReader buff = new BufferedReader(new FileReader(file));
        String line = null;
        while ((line = buff.readLine()) != null) {
            String[] words = line.split("[^a-zA-Z]+");
            for (String word : words) {
                word = word.toLowerCase();
                if (word.length() == 0) {
                    continue;
                }
                set.add(word);
            }
        }
        buff.close();
        return set;
    }

    /**
     * Display a set
     * 
     * @param set
     * @param name
     */
    private static void displaySet(TreeSet<String> set, String name) {
        System.out.println("Words in " + name + ":");
        int index = 0;
        for (String s : set) {
            System.out.printf("%-15s ", s);
            if (++index % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

}
