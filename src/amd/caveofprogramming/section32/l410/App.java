package amd.caveofprogramming.section32.l410;

public class App {

    public static void main(String[] args) {

        int value1 = 0b00010001;
        
        int value2 = value1 << 3;
        
        System.out.println(toBinary(value1));
        System.out.println(toBinary(value2));
        
        int value3 = value2 >> 2;
        
        System.out.println(toBinary(value3));
        
        System.out.println();
        System.out.println(100 << 1);
        System.out.println(100 << 2);
        System.out.println(100 << 3);
        System.out.println();
        System.out.println(1000 >> 1);
        System.out.println(1000 >> 2);
        
    }

    private static String toBinary(int value) {
        return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
    }

}
