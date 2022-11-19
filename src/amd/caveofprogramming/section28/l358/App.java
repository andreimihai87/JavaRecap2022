package amd.caveofprogramming.section28.l358;

public class App {

    private int value;
    
    public static void main(String[] args) {

        new App().runner();
        
    }
    
    private void runner() {
        
        int v1 = 10;
        
        // if we make a change: v1 = 5;
        // the lambda expression can't access it anymore
        // because the lambda expression can only access a final variable, or an effectively final like v1
        
        Runnable r1 = () -> {
            System.out.println("v1:" + v1);
            System.out.println("value:" + value++);
        };
        
        r1.run();
        r1.run();
        
    }

}
