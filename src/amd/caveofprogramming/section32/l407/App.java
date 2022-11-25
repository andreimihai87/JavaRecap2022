package amd.caveofprogramming.section32.l407;

public class App {

    public static void main(String[] args) {

        int value = 0b100100;
        
        System.out.println(toBinary(value));

    }

    private static String toBinary(int value) {
        return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
    }

}
