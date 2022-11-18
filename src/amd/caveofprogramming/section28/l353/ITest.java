package amd.caveofprogramming.section28.l353;

@FunctionalInterface
public interface ITest {

    public void run();

    public default void run2() {
    };

}
