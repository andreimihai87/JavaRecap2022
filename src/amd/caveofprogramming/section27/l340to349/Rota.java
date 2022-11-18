package amd.caveofprogramming.section27.l340to349;

import java.util.LinkedHashMap;
import java.util.Map;

public class Rota {

    private Map<Integer, Person> rotaMap;
    private int people = 0;
    private int nextPersonToWork = 1;
    private String[] skills = {"management", "reception", "programming"};
    private boolean[] skillsFlags = { false, false, false };

    public Rota() {
        rotaMap = new LinkedHashMap<Integer, Person>();
    }

    public void add(Person person) {
        rotaMap.put(++people, person);
    }

    public int getNrOfPeople() {
        return people;
    }

    public void nextWeek() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            sb.append("Day ");
            sb.append(i);
            sb.append(" : ");
            while (!skillsFound()) {
                int skillFound = 0;
                if (nextPersonToWork == rotaMap.size()) {
                    nextPersonToWork = 1;
                }
                int beforeSearch = skillFound;
                Person person = rotaMap.get(nextPersonToWork++);
                if (!person.isInHoliday()) {
                    for (int j = 0; j < skills.length; j++) {
                        if (person.getSkills().contains(skills[j]) && !skillsFlags[j]) {
                            skillsFlags[j] = true;
                            skillFound++;
                        }
                    }
                    if (beforeSearch != skillFound) {
                        sb.append(person.getName());
                        sb.append(" ");
                    }
                }
                else {
                    sb.append("(H - " + person.getName() + ")");
                    sb.append(" ");
                }
            }
            sb.append("\n");
            markSkillsNotFound();
        }

        return sb.toString();
    }

    private boolean skillsFound() {
        boolean found = true;
        for (int j = 0; j < skillsFlags.length; j++) {
            if (!skillsFlags[j]) {
                found = false;
            }
        }
        return found;
    }

    private void markSkillsNotFound() {
        for (int j = 0; j < skillsFlags.length; j++) {
            skillsFlags[j] = false;
        }
    }

}
