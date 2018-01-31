import javax.swing.JFrame;

public class mouseMain {
	public static void main (String args []) {
		mouseEvents event = new mouseEvents();
		event.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		event.setSize(500, 300);
		event.setVisible(true);
	}
}
