package amd.caveofprogramming.section29.l376;

class Person implements Comparable<Person> {

    private String name;

    public Person() {
        this.name = "[no name]";
    }
    
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

@FunctionalInterface
interface PersonCreator {
    Person create();
}

@FunctionalInterface
interface PersonNameCreator {
    Person create(String name);
}

public class App {

    public static void main(String[] args) {

//        PersonCreator pc1 = () -> new Person();
        PersonCreator pc1 = Person::new; 
        
        Person person1 = pc1.create();
        System.out.println(person1);
        
//        PersonNameCreator pnc = s -> new Person(s);
        PersonNameCreator pnc = Person::new;
        Person person2 = pnc.create("Alex");
        System.out.println(person2);
        
        
    }

}
