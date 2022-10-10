package amd.caveofprogramming.section19.l213;

public class App {
	
	public static void main(String[] args) {
		
		Database db = new Database("localhost:8880");
		db.getData();
		
		db.close();
	}

}
