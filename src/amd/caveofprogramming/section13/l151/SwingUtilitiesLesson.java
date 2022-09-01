package amd.caveofprogramming.section13.l151;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingUtilitiesLesson {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
			
			JFrame frame = new JFrame();
			frame.setSize(600, 400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
		});
		
	}

}
