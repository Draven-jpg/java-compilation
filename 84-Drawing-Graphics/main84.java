import javax.swing.*;

public class main84 {
	public static void main (String[] args) {
		
		JFrame f = new JFrame("Drawing Graphics");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Peach p = new Peach();
		f.add(p);
		f.setSize(420,250);
		f.setVisible(true);
 	}
}
