package amd.caveofprogramming.section27.l340to349;

import java.util.Random;
import java.util.Set;

public class Person {

    private String name;
    private Set<String> skills;

    public Person(String name, Set<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public void addSkills(String skill) {
        skills.add(skill);
    }

    public Set<String> getSkills() {
        return skills;
    }

    public String getName() {
        return name;
    }

    public boolean isInHoliday() {
        
        Random random = new Random();
        // 1 in 10 days is holiday
        int holiday = random.nextInt(51);

        return holiday % 10 == 0;
    }

    @Override
    public String toString() {
        return "Person - name: " + name + ", skills: " + skills;
    }
    
}
