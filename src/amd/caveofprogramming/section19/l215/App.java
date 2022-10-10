package amd.caveofprogramming.section19.l215;

public class App {

	public static void main(String[] args) {

		Database db = null;
		try {
			db = new Database(null);
			db.getData();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				db.close();
			} catch (NullPointerException npe) {
				System.out.println("The db cannot be null!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
