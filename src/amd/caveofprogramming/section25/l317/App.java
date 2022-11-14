package amd.caveofprogramming.section25.l317;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        HashSet<String> fruits1 = new HashSet<String>(Set.of("apple", "banana", "cherry", "kiwi"));
        HashSet<String> fruits2 = new HashSet<String>(Set.of("orange", "apple", "mango", "cherry"));
        
        HashSet<String> onlyInFruitsOne = new HashSet<>(fruits1);
        onlyInFruitsOne.removeAll(fruits2);
        
        onlyInFruitsOne.forEach(System.out::println);
        
        System.out.println();
        
        
    }

}
