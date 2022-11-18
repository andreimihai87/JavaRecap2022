package amd.caveofprogramming.section28.l355;

@FunctionalInterface
interface Runner {
    public void execute(String text);
}

public class App {

    public static void main(String[] args) {

        Runner run1 = (String text) -> {
            System.out.println(text);
        };
        run1.execute("some text");

        Runner run2 = (t) -> {
            System.out.println(t);
        };
        run2.execute("some text");

        Runner run3 = t -> {
            System.out.println(t);
        };
        run3.execute("some text");

        Runner run4 = t -> System.out.println(t);
        run4.execute("some text");

    }

}
