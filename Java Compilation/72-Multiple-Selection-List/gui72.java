import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class gui72 extends JFrame {
	
	private JList leftlist;
	private JList rightlist;
	private JButton movebutton;		//JButton
	private static String[] foods = {"Borger", "Prays", "Melkti", "Protas", "toyo"};
	
	public gui72() {
		super("Multiple Selection List");
		setLayout(new FlowLayout());
		
		leftlist = new JList(foods);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//you can select by shift or ctrl buton in keyboard
		add(new JScrollPane(leftlist));
		
		movebutton = new JButton("Move-->");
		movebutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						rightlist.setListData(leftlist.getSelectedValues());

					}
				}
		);
		add(movebutton);
		
		rightlist = new JList();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellWidth(100);
		rightlist.setFixedCellHeight(15);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
		
	}
}
