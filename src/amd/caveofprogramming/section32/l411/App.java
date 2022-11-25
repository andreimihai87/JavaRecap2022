package amd.caveofprogramming.section32.l411;

public class App {

    public static void main(String[] args) {

        int value1 = 0xFF;

        int value2 = value1 << 4;
        int value3 = value1 << 8;

        System.out.printf("%08x \n", value1);
        System.out.printf("%08x \n", value2);
        System.out.printf("%08x \n", value3);

        int color = 0x00123456;

        System.out.printf("%08x \n", color & 0x00FF00);
        
        int green = (color & 0x00FF00) >> 8;
        
        System.out.printf("%08x \n", green);

    }

}
