package amd.caveofprogramming.section14.l166;

public interface IDefaultRunnable extends Runnable {
	public default void displayDetails() {
		System.out.println("No details to display!");
	}
}
