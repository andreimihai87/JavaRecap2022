package amd.caveofprogramming.section36.l430;

public class App {

    public static void main(String[] args) {
        
        int number = 5;

        System.out.println(number + "! = " + factorial(number));
        System.out.println();
        
        System.out.println("new version: ");

        System.out.println(number + "! = " + fact(number));

    }

    /**
     * Old version of factorial without recursion
     */
    private static int factorial(int number) {
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
    
    /**
     * New version of factorial with recursion
     */
    private static int fact(int number) {
        if (number == 0) {
            return 1;
        }
        return number * fact(number - 1);
    }

}
