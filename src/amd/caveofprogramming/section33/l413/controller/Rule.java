package amd.caveofprogramming.section33.l413.controller;

public class Rule {

    private int rule;

    public Rule(int rule) {
        this.rule = rule;
    }

    public int get(int i) {
        return (rule >> i) & 1;
    }

    @Override
    public String toString() {
        return String.format("%8s", Integer.toBinaryString(rule)).replace(" ", "0");
    }

}
