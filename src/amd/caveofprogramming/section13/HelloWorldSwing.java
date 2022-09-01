package amd.caveofprogramming.section13;

import javax.swing.JFrame;

public class HelloWorldSwing {

	public static void main(String[] args) {

		JFrame frame = new JFrame();

		frame.setTitle("Hello World");
		frame.setSize(600, 400);
		frame.setLocation(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
