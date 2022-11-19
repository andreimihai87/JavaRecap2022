package amd.caveofprogramming.section28.l363;

import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {
        new App().run();
    }

    private void run() {

        calculateAndPrint(7, n -> n * n);
        calculateAndPrint(7, n -> -n);
        calculateAndPrint(7, n -> 0);

    }

    private void calculateAndPrint(int value, UnaryOperator<Integer> procedure) {

        System.out.println(procedure.apply(value));

    }

}
