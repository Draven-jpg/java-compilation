import java.awt.*; 
import javax.swing.*;


public class Main86 {
	public static void main(String[] args) {
		 
		JFrame f = new JFrame("Draw More Stuff");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw d = new Draw();
		d.setBackground(Color.BLACK);
		f.add(d);
		f.setSize(500,270);
		f.setVisible(true);
	}
}


