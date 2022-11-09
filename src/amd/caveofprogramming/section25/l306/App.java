package amd.caveofprogramming.section25.l306;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5));

        for (ListIterator<Integer> iterator = intList.listIterator(); iterator.hasNext();) {

            int number = iterator.next();

            if (number == 2) {
                iterator.remove();
            }
            else if (number == 3) {
                iterator.add(10);
            }
            else if (number == 5) {
                iterator.set(100);
            }
            
            System.out.println(number);

        }

        System.out.println();
        intList.forEach(System.out::println);

    }

}
