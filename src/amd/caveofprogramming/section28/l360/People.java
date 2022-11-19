package amd.caveofprogramming.section28.l360;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class People {

    List<String> people = new ArrayList<String>();

    public People() {
        people.add("Bob");
        people.add("Sue");
        people.add("Mike");
        people.add("John");
    }

    public List<String> get() {
        return Collections.unmodifiableList(people);
    }

}
