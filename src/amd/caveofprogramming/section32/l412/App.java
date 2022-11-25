package amd.caveofprogramming.section32.l412;

public class App {

    public static void main(String[] args) {

        int color = 0x00123456;
        
        System.out.printf("%08x \n", color);
        System.out.println();

        int green = (color & 0xFF00);
        int red = (color & 0xFF0000);
        int blue = (color & 0xFF);
        
        System.out.printf("%08x \n", green);
        System.out.printf("%08x \n", red);
        System.out.printf("%08x \n", blue);
        System.out.println();
        
        int newColor = 0x00000000 | green | red | blue;
        
        System.out.printf("%08x \n", newColor);

    }

}
