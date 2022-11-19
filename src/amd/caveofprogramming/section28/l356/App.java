package amd.caveofprogramming.section28.l356;

@FunctionalInterface
interface Runner {
    public void execute(String greeting, String name);
}

public class App {

    public static void main(String[] args) {

        Runner run = (g, n) -> System.out.println(g + " " + n);
        run.execute("Hello", "Mike");

        greet(run);

    }

    private static void greet(Runner runner) {
        runner.execute("Hello", "Alex");
    }

}
