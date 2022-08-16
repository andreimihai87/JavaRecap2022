package amd.caveofprogramming.section6.mrs89;


public class MenuReturningString {

	public static void main(String[] args) {

		Menu menu1 = new Menu();
		menu1.setOptions(new String[] { "View database", "Add new item", "Delete item", "Quit program" });

		String menu = menu1.getMenu();
		System.out.println(menu);
		
	}

}
