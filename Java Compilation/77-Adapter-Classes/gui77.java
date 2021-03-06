import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui77 extends JFrame{
	
	private String details;
	private JLabel statusbar;
	
	public gui77() {
		super("Mouse Adapter");
		
		statusbar = new JLabel ("This is default");
		add(statusbar,BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
	}
	private class Mouseclass extends MouseAdapter{
		public void mouseClicked(MouseEvent event) {
			details = String.format("You cliecked %d %s with", event.getClickCount(),(event.getClickCount()!=1 ? "times" : "time"));
			
			if(event.isMetaDown())
				details += " right mouse button";
			else if(event.isAltDown())
				details += " center mouse button";
			else
				details += " left mouse button";
				
			statusbar.setText(details);
		}
	}
}
