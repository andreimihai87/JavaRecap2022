package amd.caveofprogramming.section28.l357;

@FunctionalInterface
interface Joiner {
    String join(String text1, String text2);
}

public class App {

    public static void main(String[] args) {

        Joiner joiner1 = (s1, s2) -> {
            String text = s1 + " " + s2;
            return text;
        };

        run(joiner1);

        Joiner joiner2 = (s1, s2) -> s1 + " " + s2;

        run(joiner2);

    }

    private static void run(Joiner joiner) {

        System.out.println(joiner.join("Alex", "Pavelescu"));

    }

}
