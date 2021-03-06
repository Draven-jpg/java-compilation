import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Choose extends JFrame{
	
	private JButton b;
	private Color color = (Color.WHITE);
	private JPanel panel;
	
	public Choose() {
		super("JColorChooser");
		
		panel = new JPanel();
		panel.setBackground(color); // we will take the constant color that we declare in color
		
		b = new JButton("Choose a Color");
		b.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					color = JColorChooser.showDialog(null, "Pick your Color", color);
										//1  null it appear in the center of screen | 2 what you want to pop up in screen | 3 is initial color
				
					if(color == null)
						color = (Color.WHITE);
					
					panel.setBackground(color);
				}
			}
		);
		
		add(panel, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		setSize(425,150);
		setVisible(true);
	}
}
