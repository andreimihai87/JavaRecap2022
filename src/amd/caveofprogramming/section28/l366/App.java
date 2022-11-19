package amd.caveofprogramming.section28.l366;

public class App {

    public static void main(String[] args) throws InterruptedException {

        Runnable runner = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Value of i: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        
        Thread t1 = new Thread(runner);
        Thread t2 = new Thread(runner);
        
        t1.start();
        t2.start();
        
        System.out.println("Hello!");
        
        t1.join();
        t2.join();

    }

}
