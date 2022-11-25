package amd.caveofprogramming.section36.l429;

public class App {

    public static void main(String[] args) {

        System.out.println(5 + "! = " + factorial(5));

        recursive(1);

        System.out.println(sum(3));

    }

    private static int sum(int value) {

        if (value == 0) {
            return value;
        }

        return value + sum(value - 1);
    }

    private static void recursive(int value) {

        System.out.println("hello");

        if (value == 0) {
            return;
        }

        recursive(value - 1);

    }

    private static int factorial(int number) {
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

}
