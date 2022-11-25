package amd.caveofprogramming.section36.l426and427;

public class App {

    public static void main(String[] args) {

        System.out.println(5 + "! = " + factorial(5));

    }

    private static int factorial(int number) {
        int factorial = 1;
        if (number <= 1) {
            return factorial;
        }
        else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

}
