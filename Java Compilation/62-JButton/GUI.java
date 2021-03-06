import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class GUI extends JFrame{

	private JButton reg;//store regular botton
	private JButton custom;//store custom botton
	
	public GUI() {
		super("GUI");//this function is inherit from extends JFrame constructor
		setLayout(new FlowLayout());
		
		reg =new JButton("reg Button");
		add(reg);
		
		Icon a = new ImageIcon(getClass().getResource("ang.png"));// we made image ang.png to store in a
		Icon b = new ImageIcon(getClass().getResource("eng.png"));// we maide image eng.png to store in b
		
		custom = new JButton("Custom", a);
		custom.setRolloverIcon(b);//roll over is when you move your mouse in the custom image it will change the b icon
		add(custom);
		
		HandlerClass handler = new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
	
	}
	
	private class HandlerClass implements ActionListener{
	public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, String.format("%s",event.getActionCommand()));
	}
		
	}
}
