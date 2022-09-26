package amd.caveofprogramming.section14.l171;

import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Alert extends TimerTask {

	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "Egg cooked!");
	}

}
