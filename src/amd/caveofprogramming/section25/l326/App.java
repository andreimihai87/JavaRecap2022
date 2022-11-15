package amd.caveofprogramming.section25.l326;

import java.util.HashMap;

public class App {

    public static void main(String[] args) {

        HashMap<Integer, String> people = new HashMap<>();

        people.put(0, "Andrei");
        people.put(2, "Alex");
        people.put(2, "Tiby");
        people.put(4, "Anna");
        people.put(10, "Mihai");
        people.put(14, "Anna");

        System.out.println(people.get(10));
        
        String person = people.get(2);
        System.out.println(person);

        people.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });

    }

}
