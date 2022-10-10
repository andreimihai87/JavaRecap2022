package amd.caveofprogramming.section19.l216;

public class App {

	public static void main(String[] args) {

		try (Database db = new Database("abcdefghijkabcdefghijk")) {
			db.getData();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
