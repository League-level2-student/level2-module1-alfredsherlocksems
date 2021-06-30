package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _01_array_list_visualizer.data.ArrayList;

public class GuestBookCode implements ActionListener {
	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	JButton addNameButton = new JButton();
	JButton showNamesButton = new JButton();
	ArrayList<String> nameArrayList = new ArrayList<String>();
	String namesDisplay;
	
	public void start() {
		window.setSize(100, 100);
		window.setVisible(true);
		window.add(panel);
		
		addNameButton.setText("Add Name");
		showNamesButton.setText("Show Names");
		addNameButton.addActionListener(this);
		showNamesButton.addActionListener(this);
		
		panel.add(addNameButton);
		panel.add(showNamesButton);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == addNameButton) {
			String name = JOptionPane.showInputDialog("Please ener a name.");
			nameArrayList.add("Guest #" + nameArrayList.size() + ": " + name + "\n");
		}
		if (arg0.getSource() == showNamesButton) {
			for (int i = 0; i < nameArrayList.size(); i++) {
				if (namesDisplay == null) {
				namesDisplay = nameArrayList.get(i);
				}
				else {
				namesDisplay += nameArrayList.get(i);
				}
			}
			JOptionPane.showMessageDialog(null, namesDisplay);
			namesDisplay = null;
		}
	}
}
