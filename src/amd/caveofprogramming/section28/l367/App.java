package amd.caveofprogramming.section28.l367;

public class App {

    private int value;

    public void run() throws InterruptedException {

        Runnable runner = () -> {
            for (int i = 0; i < 10000; i++) {
                value++;
            }
        };

        Thread t1 = new Thread(runner);
        Thread t2 = new Thread(runner);

        t1.start();
        t2.start();

        // make sure that the main thread waits for the t1 and t2 to finish
        t1.join();
        t2.join();

        System.out.println("Value of value: " + value);

    }

    public static void main(String[] args) throws InterruptedException {

        new App().run();

    }

}
