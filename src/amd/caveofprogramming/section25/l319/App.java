package amd.caveofprogramming.section25.l319;

import java.util.TreeSet;

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

}

public class App {

    public static void main(String[] args) {

        TreeSet<Person> people = new TreeSet<>();

        people.add(new Person("Andrei"));
        people.add(new Person("Alex"));
        people.add(new Person("Mihai"));
        people.add(new Person("Anna"));

        for (Person p : people) {
            System.out.println(p);
        }

    }

}
