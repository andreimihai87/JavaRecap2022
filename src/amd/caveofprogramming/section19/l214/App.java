package amd.caveofprogramming.section19.l214;

public class App {

	public static void main(String[] args) {

		try {
			Database db = new Database("abc");
			db.getData();
			db.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
