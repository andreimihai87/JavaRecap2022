package amd.caveofprogramming.section29.l371;

@FunctionalInterface
interface Greeter {
    void greet();
}

public class App {

    public static void main(String[] args) {

        Greeter g = App::sayHello;
        g.greet();

    }

    private static void sayHello() {
        System.out.println("Hello!");
    }

}
