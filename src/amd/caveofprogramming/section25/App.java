package amd.caveofprogramming.section25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class SkillSet extends HashSet<String> {

    private static final long serialVersionUID = 1L;

    public boolean isSkilled() {
        return this.contains("programming") && this.contains("teaching");
    }

}

public class App {

    public static void main(String[] args) {

        Map<Integer, SkillSet> map = new HashMap<>();

        SkillSet skillSet1 = new SkillSet();
        skillSet1.add("programming");
        skillSet1.add("teaching");

        map.put(1, skillSet1);

        for (String skill : skillSet1) {
            System.out.println(skill);
        }

        System.out.println();
        System.out.println("Is skilled: " + skillSet1.isSkilled());

    }

}
