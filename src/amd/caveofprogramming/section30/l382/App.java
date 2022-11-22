package amd.caveofprogramming.section30.l382;

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
        stringNames.sort((s1, s2) -> s1.compareTo(s2));
//        stringNames.stream().map(s -> new Person(s)).forEach(System.out::println);
        stringNames.stream().map(s -> s).forEach(System.out::println);
        System.out.println();

        // @formatter:off
        List<Person> people = stringNames
            .stream()
            .map(Person::new)
            .collect(Collectors.toList());
        // @formatter:on
        
//        people.forEach(System.out::println);
        System.out.println(people);

    }

}
