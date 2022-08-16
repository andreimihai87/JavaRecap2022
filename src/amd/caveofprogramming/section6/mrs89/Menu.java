package amd.caveofprogramming.section6.mrs89;

public class Menu {

	private String[] menuOptions;

	String menu = "Options:\n";

	/** Get the menu based on the options provided */
	String getMenu() {
		for (int i = 0; i < menuOptions.length; i++) {
			menu += (i + 1) + ". " + menuOptions[i] + "\n";
		}
		return menu;
	}

	/** Set the options */
	public void setOptions(String[] options) {
		menuOptions = options;
	}

}
