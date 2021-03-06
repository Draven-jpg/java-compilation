import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Layout extends JFrame {
	
	private JButton leftbutton;
	private JButton centerbutton;
	private JButton rightbutton;
	private FlowLayout layout;
	private Container container;
	
	public Layout() {
		//This is much pretty creating a window
		super("Flow Layout");
		layout  = new FlowLayout();	
		container = getContentPane();
		setLayout(layout);
		
		//contento of the windows
		//left stuff in here
		leftbutton  = new JButton("left");
		add(leftbutton);
		leftbutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {//what will happen when we click the button
						layout.setAlignment(FlowLayout.LEFT); 
						layout.layoutContainer(container);
					}
				}
		);
		
		//center stuff in here
		centerbutton = new JButton("Center");
		add(centerbutton);
		centerbutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container);
					}
				}
		);
		
		//right stuff in here
		rightbutton = new JButton("Right");
		add(rightbutton);
		rightbutton.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					layout.setAlignment(FlowLayout.RIGHT);
					layout.layoutContainer(container);
				}
			}
		);
		
		
	}
}
