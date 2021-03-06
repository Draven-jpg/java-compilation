/*
 * 51 bucky tutorial
 */
import java.awt.FlowLayout;
import javax.swing.JFrame;//importing bar like minimize,maximize and X button
import javax.swing.JLabel;

public class Hulk extends JFrame {//inherit JFrame buttons

		private JLabel item1; //variable
		
		//create a method same name with the class
		public Hulk() {
			super ("The Title Bar");//This is how you create a title bar
			setLayout(new FlowLayout());
			
			item1 = new JLabel("This is the sentence");
			item1.setToolTipText("This is gonna show up on hover");//default layout
			add(item1);//item scroll bar
		}
}
