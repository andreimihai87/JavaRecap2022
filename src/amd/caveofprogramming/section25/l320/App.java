package amd.caveofprogramming.section25.l320;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(3);
        set1.add(1);
        set1.add(2);
        
        Set<Integer> set2 = new LinkedHashSet<Integer>();
        set2.add(3);
        set2.add(1);
        set2.add(2);
        
        Set<Integer> set3 = new TreeSet<Integer>();
        set3.add(3);
        set3.add(1);
        set3.add(2);
        
        SortedSet<Integer> sortedSet1 = new TreeSet<Integer>();
        sortedSet1.add(3);
        sortedSet1.add(1);
        sortedSet1.add(2);
        
        System.out.println(set1);
        System.out.println();
        System.out.println(set2);
        System.out.println();
        System.out.println(set3);
        System.out.println();
        System.out.println(sortedSet1);
        
    }

}
