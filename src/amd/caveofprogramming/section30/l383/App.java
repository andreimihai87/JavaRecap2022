package amd.caveofprogramming.section30.l383;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        List<String> stringNames = new ArrayList<String>(List.of("Mike", "Alex", "John", "Anna", "Zion", "Bob"));

        // @formatter:off
        List<Person> people = stringNames
            .stream()
//            .peek(s -> System.out.println(s + ": " + s.getClass()))
            .map(Person::new)
            .peek(s -> System.out.println(s + ": " + s.getClass()))
            .collect(Collectors.toList());
        // @formatter:on

    }

}
