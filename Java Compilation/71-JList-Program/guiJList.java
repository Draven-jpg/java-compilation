import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class guiJList extends JFrame {
	
	private JList list;
	private String[] colornames = {"Black","Blue","Red","White"};
	private Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};
	
	public guiJList() {
		super("JList");
		setLayout(new FlowLayout());
		
		list = new JList(colornames);
		list.setVisibleRowCount(4);//4option default
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent event) {
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
					}
		}
		);
	}
}
