package amd.caveofprogramming.section27.l350and351;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
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

        // HashSet, LinkedHashSet, TreeSet
        // Add 'Person' in the set
        // method that accepts a set, add items to the set, prints the set:
        // addItemAndPrint

        HashSet<Person> pJobsHashSet = new HashSet<Person>();
        LinkedHashSet<Person> pJobsLinkedHashSet = new LinkedHashSet<Person>();
        TreeSet<Person> pJobsTreeSet = new TreeSet<Person>();

        addItemAndPrint(pJobsHashSet);
        addItemAndPrint(pJobsLinkedHashSet);
        addItemAndPrint(pJobsTreeSet);

    }

    private static void addItemAndPrint(Set<Person> personsJobs) {

        personsJobs.add(new Person("Mihai"));
        personsJobs.add(new Person("Alex"));
        personsJobs.add(new Person("Aana"));

        personsJobs.forEach((person) -> System.out.println(person));

        System.out.println();

    }

}
