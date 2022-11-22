package amd.caveofprogramming.section30.l381;

public class App {

    public static void main(String[] args) {

        String line = "This is a line. It contains some words, with capital letter, and some punctuation";

        String[] words = line.split("[^a-zA-Z]+");
        
        for (String word : words) {
            System.out.println(word);
        }

    }

}
