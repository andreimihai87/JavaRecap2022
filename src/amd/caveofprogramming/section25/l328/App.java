package amd.caveofprogramming.section25.l328;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class App {

    public static void main(String[] args) {

        // @formatter:off
        HashMap<Integer, String> months1 = new HashMap<Integer, String>(Map.of(
                3, "Mar",
                4, "Apr"
        ));
        
        HashMap<Integer, String> months2 = new HashMap<Integer, String>(Map.ofEntries(
                entry(6, "Iun"), 
                entry(7, "Jul"),
                entry(8, "Aug")
        ));
        // @formatter:on

        months1.put(1, "Jan");
        months1.put(2, "Feb");

        months1.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });

        System.out.println();
        
        months2.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });
    }

}
