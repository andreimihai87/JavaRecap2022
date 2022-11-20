package amd.caveofprogramming.section29.l370;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args) {

//        var service = Executors.newScheduledThreadPool(1);
//        service.scheduleAtFixedRate(() -> System.out.println("Hello"), 0, 1000, TimeUnit.MILLISECONDS);

        var service2 = Executors.newScheduledThreadPool(1);
        service2.scheduleAtFixedRate(App::greet, 0, 1000, TimeUnit.MILLISECONDS);
        
        System.out.println("stop");

    }

    public static void greet() {
        System.out.println("Greetings!");
    }

}
