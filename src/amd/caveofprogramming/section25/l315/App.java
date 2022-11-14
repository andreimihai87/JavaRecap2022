package amd.caveofprogramming.section25.l315;

import java.util.HashSet;

class Creature {

    private int id;
    private String name;

    public Creature(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
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
        Creature other = (Creature) obj;
        if (id != other.id)
            return false;
        return true;
    }

}

public class App {

    public static void main(String[] args) {

        HashSet<Creature> creatureSet = new HashSet<Creature>();

        creatureSet.add(new Creature(0, "mouse"));
        creatureSet.add(new Creature(1, "cat"));
        creatureSet.add(new Creature(0, "mongoose"));
        creatureSet.add(new Creature(3, "dog"));

        for (Creature c : creatureSet) {
            System.out.println(c);
        }

    }

}
