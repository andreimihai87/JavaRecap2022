package amd.caveofprogramming.section29.l372;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(List.of(1, 3, 4, 5, 5, 3, 4, 7, 6, 8));

        list.removeIf(App::removeSmallerThanSix);
        list.replaceAll(App::replaceAllWithTimesTwo);

        list.forEach(System.out::println);

    }

    private static boolean removeSmallerThanSix(int number) {
        return number < 6;
    }

    private static int replaceAllWithTimesTwo(int number) {
        return number * 2;
    }

}
