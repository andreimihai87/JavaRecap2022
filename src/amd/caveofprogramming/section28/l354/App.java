package amd.caveofprogramming.section28.l354;

@FunctionalInterface
interface Runner {
    public void execute();
}

public class App {

    public static void main(String[] args) {

        Runner run = () -> {
            System.out.println("Hello!");
        };
        
        run.execute();
        
        System.out.println(run.getClass());
    }

}
