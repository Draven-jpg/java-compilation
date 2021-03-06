/*
 * This program is all about graphical user interface to print option bar
 50 bucky totorial
import javax.swing.JOptionPane;//importing GUI bar

public class Ironman {
	public static void main (String[] args) {
		//showing input dialog where you can input your number
		String fn = JOptionPane.showInputDialog("Input First Number","number pls ");
		String sn = JOptionPane.showInputDialog("Input Second Number","number pls");
		//converting String to int
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null,"The sum is "+sum,"This is the Answer",JOptionPane.PLAIN_MESSAGE);
	}
}
*/

/*
 * 51 bucky tutorial
 */

import javax.swing.JFrame;

public class Ironman{
	public static void main(String[] args) {
		Hulk hulkObj = new Hulk();
		
		hulkObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//whenever we hit the x botton it will close the program , if we don't have it the program will gonna mess up
		hulkObj.setSize(1080, 770);//SET THE SIZE OF THE WINDOWS
		hulkObj.setVisible(true);
		
	}
}


