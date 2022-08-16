package amd.caveofprogramming.section6.me86and87;

public class Menu {

	private String[] menuOptions;

	/** Display a menu based on the options provided */
	public void display() {
		System.out.println("Options:");
		for (int i = 0; i < menuOptions.length; i++) {
			System.out.printf("%d. %s\n", (i + 1), menuOptions[i]);
		}
	}

	/** Set the options */
	public void setOptions(String[] options) {
		menuOptions = options;
	}

}
