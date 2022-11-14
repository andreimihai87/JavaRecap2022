package amd.caveofprogramming.section25.l316;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        HashSet<String> fruits1 = new HashSet<String>(Set.of("apple", "banana", "cherry", "kiwi"));
        HashSet<String> fruits2 = new HashSet<String>(Set.of("orange", "apple", "mango", "cherry"));
        
        HashSet<String> union = new HashSet<>(fruits1);
        union.addAll(fruits2);
        
        union.forEach(System.out::println);
        
        System.out.println();
        
        HashSet<String> intersection = new HashSet<String>(fruits1);
        intersection.retainAll(fruits2);
        
        intersection.forEach(System.out::println);
        
    }

}
