import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouseEvents extends JFrame {
	private JPanel panel;
	private JLabel messageBar;
	
	public mouseEvents() {
		super("Mouse Events Demo");
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		add(panel, BorderLayout.CENTER);
		
		messageBar = new JLabel("Status");
		add(messageBar, BorderLayout.SOUTH);
		
		handlerClass mouseEvent = new handlerClass();
		panel.addMouseListener(mouseEvent);
		panel.addMouseMotionListener(mouseEvent);
	}
	
	private class handlerClass implements MouseListener, MouseMotionListener {
		public void mouseClicked(MouseEvent event) {
			messageBar.setText("Mouse button have been clicked");
		}
		public void mousePressed(MouseEvent event) {
			messageBar.setText("Mouse button have been pressed");
		}
		public void mouseReleased(MouseEvent event) {
			messageBar.setText("Mouse Button has been released");
		}
		public void mouseEntered(MouseEvent event) {
			panel.setBackground(Color.YELLOW);
			messageBar.setText("Mouse cursor has entered the panel.");
		}
		public void mouseExited(MouseEvent event) {
			panel.setBackground(Color.BLACK);
			messageBar.setText("Mouse cursor have exited the panel");
		}
		public void mouseDragged(MouseEvent event) {
			messageBar.setText("Mouse is being dragged");
		}
		public void mouseMoved(MouseEvent event) {
			messageBar.setText("Mouse is being moved");
		}
	}
}
