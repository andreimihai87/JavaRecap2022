package amd.caveofprogramming.section29.l373;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        App app1 = new App();

        List<Integer> list = new ArrayList<Integer>(List.of(1, 3, 4, 5, 5, 3, 4, 7, 6, 8));

        list.removeIf(app1::removeSmallerThanSix);
        list.replaceAll(app1::replaceAllWithTimesTwo);

        list.forEach(app1::printOneByOne);

    }

    private boolean removeSmallerThanSix(int number) {
        return number < 6;
    }

    private int replaceAllWithTimesTwo(int number) {
        return number * 2;
    }

    private void printOneByOne(int number) {
        System.out.println("Number in list: " + number);
    }

}
