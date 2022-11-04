package amd.caveofprogramming.section25.l296;

public class App {

	public static void main(String[] args) {

		new App().run("a", "b");

	}

	public void run(String... texts) {
		for (String text : texts) {
			System.out.println(text);
		}
	}

}
