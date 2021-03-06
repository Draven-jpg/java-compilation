 /*
  * 52 to 54 java tutorial bucky 
  */

/*search this all import*/
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class EventHandle extends JFrame {//build a window using JFrame
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	public EventHandle() {
		super("The Title");//title
		setLayout(new FlowLayout());
		
		item1 = new JTextField("First Name",20);
		add(item1);// add to  the window
		
		item2 = new JTextField("Last Name",20);
		add(item2);//add to the window
		
		item3 = new JTextField("Middle name",20);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("mypass",10);
		add(passwordField);
		
		/*we give each item functionality if you press enter them they actually do something*/
		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		passwordField.addActionListener(handler);
	}
	private class thehandler implements ActionListener{//wait events to happen
		
		public void actionPerformed(ActionEvent event) {//built-in method that has to do  with the actionlistener classs
			
			String string = "";//after you implement it will display nothing 
			
			if(event.getSource()== item1)
				string=String.format("field1: %s", event.getActionCommand());
			else if(event.getSource()==item2)
				string=String.format("field2: %s", event.getActionCommand());
			else if(event.getSource()==item3)
				string=String.format("field3: %s", event.getActionCommand());
			else if (event.getSource()==passwordField)
				string=String.format("Password Field: %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);
		}
	}
	
}
