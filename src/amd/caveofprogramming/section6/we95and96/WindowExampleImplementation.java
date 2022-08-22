package amd.caveofprogramming.section6.we95and96;

public class WindowExampleImplementation {

	public static void main(String[] args) {

		Window window1 = new Window();
		
		window1.setHeight(400);
		window1.setWidth(600);
		window1.setTop(100);
		window1.setLeft(200);
		window1.setVisibility(true);
		
		System.out.println("Window1 size: " + window1.getHeight() + "x" + window1.getWidth());

		window1.resizeWindow(500, 700);
		System.out.println("After resize:");
		System.out.println("Window1 size: " + window1.getHeight() + "x" + window1.getWidth());

	}

}
