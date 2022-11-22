package amd.caveofprogramming.section30.l380;

import java.util.ArrayList;
import java.util.List;

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

}

public class App {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(List.of("Mike", "Alex", "John", "Anna", "Zion", "Bob"));

        list.sort((s1, s2) -> s1.compareTo(s2));

        list.stream().map(s -> new Person(s)).forEach(System.out::println);
//        list.stream().map(Person::new).forEach(System.out::println);

    }

}
