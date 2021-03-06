import javax.swing.JFrame;


public class mainMouseEvents {
	public static void main (String[] args) {
		guiMouseEvent gme = new guiMouseEvent();
		gme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gme.setSize(300,200);
		gme.setVisible(true);
	}
}

