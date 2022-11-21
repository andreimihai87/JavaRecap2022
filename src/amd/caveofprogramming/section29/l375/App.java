package amd.caveofprogramming.section29.l375;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person other) {
        return name.compareTo(other.name);
    }

    public void display() {
        System.out.println(toString());
    }
}

public class App {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(List.of(new Person("Joe"), new Person("Alex"), new Person("Simon")));
//        people.sort((p1, p2) -> p1.compareTo(p2));
        people.sort(Person::compareTo);
//        people.forEach(p -> System.out.println(p));
        people.forEach(Person::display);

        System.out.println();

        // unicode, capital letters are first
        List<String> fruits = new ArrayList<String>(List.of("Kiwi", "banana", "apple"));
        fruits.sort(String::compareTo);
        fruits.forEach(System.out::println);
        
        System.out.println();
        
        fruits.sort(String::compareToIgnoreCase);
        fruits.forEach(System.out::println);

    }

}
