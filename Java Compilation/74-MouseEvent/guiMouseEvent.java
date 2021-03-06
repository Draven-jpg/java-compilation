import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class guiMouseEvent extends JFrame {
	 private JPanel mousepanel;
	 private JLabel statusbar;		//java 50 tutorial
	 
	 public guiMouseEvent() {
		 super("Mouse Event");
		 //no setlayout because we will custom later
		 
		 mousepanel = new JPanel();
		 mousepanel.setBackground(Color.WHITE); //set color background
		 add(mousepanel, BorderLayout.CENTER);	//add to the window
		 
		 statusbar = new JLabel("Default");		//we add status bar
		 add(statusbar, BorderLayout.SOUTH);	// add to windows
		 
		 RightClass handler = new RightClass();
		 mousepanel.addMouseListener(handler);//built in method that wait for mouse events
		 mousepanel.addMouseMotionListener(handler);
	 
	}
	 
	private class RightClass implements MouseListener, MouseMotionListener{//detect mouse events
		//mousemotion listener is used when you drag and move the mouse 
		//mouse listener are the five method below
		/*these method are the mouse events*/
		public void mouseClicked(MouseEvent event) {
			statusbar.setText(String.format("Clicked at %d , %d", event.getX(),event.getY()));
		}
		public void mousePressed(MouseEvent event) {
			statusbar.setText("You Pressed down the mouse");
		}
		public void mouseReleased(MouseEvent event) {
			statusbar.setText("You Released the button");
		}
		public void mouseEntered(MouseEvent event) {
			statusbar.setText("You entered the area");
			mousepanel.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent event) {
			statusbar.setText("The mouse has left the windows");
			mousepanel.setBackground(Color.BLUE);
		}
		//these are mouse motion events

		public void mouseDragged(MouseEvent event) {
			statusbar.setText("You are dragging the mouse");
		}
		
		public void mouseMoved(MouseEvent event) {
			statusbar.setText("You moved the mouse");
		}
		
	}

}
