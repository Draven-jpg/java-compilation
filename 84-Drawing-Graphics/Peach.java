import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Peach extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(new Color(21,18,131));
		g.fillRect(25, 25, 200, 70);//draw solid rectangle | 100 and 30 are pixels
		
		g.setColor(new Color(255,161,161));// this is  a custom color rgb if you dont want constant color
		g.fillRect(25, 65, 100, 30);
		
		g.setColor(new Color(28,103,16));
		g.drawString("This is a text",25,120);
	}
		
}
