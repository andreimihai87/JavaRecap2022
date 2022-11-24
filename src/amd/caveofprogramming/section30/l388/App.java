package amd.caveofprogramming.section30.l388;

import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {

        // factorial
        factorial(0);
        factorial(1);
        factorial(4);
        factorial(5);
        factorial(6);

    }

    private static void factorial(int number) {
        int factorial = 1;
        if (number > 0) {
            factorial = IntStream.range(1, number + 1).reduce(1, (fact, n) -> fact * n);
        }
        System.out.println(number + "! = " + factorial);
    }

}
