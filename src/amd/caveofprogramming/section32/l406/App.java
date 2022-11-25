package amd.caveofprogramming.section32.l406;

public class App {

    public static void main(String[] args) {

        int number = 123;

        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toHexString(number));

        int value255 = 0xFF;

        System.out.println(value255);

        for (int i = 0; i < 256; i++) {
            if (i % 16 == 0) {
                System.out.println();
            }
            System.out.printf("%-3s", Integer.toHexString(i));
        }

        System.out.println();
        System.out.println();
        System.out.println("255 in decimal is " + Integer.toBinaryString(255) + " in binary or "
                + Integer.toHexString(255) + " in hexadecimal");

    }

}
