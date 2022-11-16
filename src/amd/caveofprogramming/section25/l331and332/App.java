package amd.caveofprogramming.section25.l331and332;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Person implements Comparable<Person> {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person other) {
        return name.compareTo(other.name);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        return true;
    }

}

public class App {

    public static void main(String[] args) {

        // HashMap, LinkedHashMap, TreeMap
        // 'Person' is the key of each map
        // Make a method that accepts a map, adds item to the map and prints the map
        
        HashMap<Person, String> map1 = new HashMap<Person, String>();
        LinkedHashMap<Person, String> map2 = new LinkedHashMap<Person, String>();
        TreeMap<Person, String> map3 = new TreeMap<Person, String>();
        
        addItemsAndPrint(map1);
        System.out.println();
        addItemsAndPrint(map2);
        System.out.println();
        addItemsAndPrint(map3);
    }

    private static void addItemsAndPrint(Map<Person, String> map) {

        Person person1 = new Person("Andrei");
        Person person2 = new Person("Alex");
        Person person3 = new Person("Ana");

        map.put(person1, "Inginer");
        map.put(person2, "Stomatolog");
        map.put(person3, "Magazioner");

        map.forEach((k, v) -> System.out.printf("%-6s : %s\n", k, v));

    }

}
