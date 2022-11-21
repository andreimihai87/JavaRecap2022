package amd.caveofprogramming.section29.l374;

class Person {

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
}

@FunctionalInterface
interface NameGetter {
    String get(Person p);
}

@FunctionalInterface
interface SetName {
    void set(Person p, String name);
}

public class App {

    public static void main(String[] args) {

        Person person1 = new Person("Joe");

        NameGetter getter = p -> p.getName();
        System.out.println(getter.get(person1));

        NameGetter getter1 = Person::getName;
        System.out.println(getter1.get(person1));
        
        
        SetName setter = (p, s) -> p.setName(s);
        setter.set(person1, "Alex");
        System.out.println(person1);
        
        SetName setter1 = Person::setName;
        setter1.set(person1, "Ion");
        System.out.println(person1);

    }

}
