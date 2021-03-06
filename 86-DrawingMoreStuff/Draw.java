import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Draw extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		//line
		g.setColor(Color.BLUE);
		g.drawLine(10, 25, 200, 45);
		//rectangle
		g.setColor(Color.RED);
		g.drawRect(10, 55, 200, 30);
		//oval
		g.setColor(Color.CYAN);
		g.fillOval(10, 95, 200, 30);
		//3D rectangle
		g.setColor(Color.GREEN);
		g.fill3DRect(10, 160, 200, 60, true);
		
	}
}