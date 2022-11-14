package amd.caveofprogramming.section25.l318;

import java.util.LinkedHashSet;

public class App {

    public static void main(String[] args) {

        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        
        fruits.forEach(System.out::println);
        
    }

}
