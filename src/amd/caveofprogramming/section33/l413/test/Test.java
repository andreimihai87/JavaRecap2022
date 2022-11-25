package amd.caveofprogramming.section33.l413.test;

import amd.caveofprogramming.section33.l413.controller.Rule;

public class Test {

    public static void main(String[] args) {

        Rule rule1 = new Rule(90);

        System.out.println(rule1);

        for (int i = 7; i >= 0; i--) {
            System.out.print(rule1.get(i));
        }
    }

}
