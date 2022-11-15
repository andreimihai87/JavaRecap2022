package amd.caveofprogramming.section25.l329;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import static java.util.Map.entry;

public class App {

    public static void main(String[] args) {

        // @formatter:off
        HashMap<String, String> months = new HashMap<String, String>(Map.ofEntries(
                entry("JAN", "January"),
                entry("FEB", "February"),
                entry("MAR", "March"),
                entry("APR", "April"),
                entry("MAY", "May"),
                entry("JUN", "June"),
                entry("JUL", "July")
        ));
        // @formatter:on

        System.out.println("V1:");
        months.forEach((monthCode, monthName) -> System.out.println(monthCode + ": " + monthName));
        System.out.println();

        System.out.println("V2:");
        for (Entry<String, String> entry : months.entrySet()) {
            String monthCode = entry.getKey();
            String monthName = entry.getValue();
            System.out.println(monthCode + ": " + monthName);
        }
        System.out.println();

        System.out.println("V3:");
        for (String monthCode : months.keySet()) {
            String monthName = months.get(monthCode);
            System.out.println(monthCode + ": " + monthName);
        }
        System.out.println();

        System.out.println("V4:");
        Iterator<Entry<String, String>> iterator = months.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, String> entry = iterator.next();
            String monthCode = entry.getKey();
            String monthName = entry.getValue();
            System.out.println(monthCode + ": " + monthName);
        }
    }

}
