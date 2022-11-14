package amd.caveofprogramming.section25.l313;

import java.util.HashSet;

public class App {

    public static void main(String[] args) {

        HashSet<String> animals = new HashSet<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("mouse");
        animals.add("pig");
        animals.add("mouse");

        System.out.println(animals.contains("mouse"));
        System.out.println();

        for (String animal : animals) {
            System.out.println(animal);
        }

    }

}
