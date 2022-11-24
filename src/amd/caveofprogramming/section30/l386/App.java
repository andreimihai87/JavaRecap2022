package amd.caveofprogramming.section30.l386;

import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {

        System.out.println(IntStream.range(0, 5).sum());
        System.out.println();

        int value = IntStream.range(0, 5).reduce(20, (subTotal, item) -> {
            System.out.println(subTotal + " - " + item);
            return subTotal + item;
        });
        System.out.println(value);
        
        System.out.println();

        var value2 = IntStream.range(0, 5).reduce((subTotal, item) -> {
            System.out.println(subTotal + " - " + item);
            return subTotal + item;
        });
        
        System.out.println(value2.getAsInt());
        
    }

}
