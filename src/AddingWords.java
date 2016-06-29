import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AddingWords implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton("ADD");
	JButton b2 = new JButton("VIEW");
	ArrayList<String> veiwable = new ArrayList<String>();
	String toPrint = "";
	public static void main(String[] args) {
		AddingWords begin = new AddingWords();
		begin.createUI();
	}

	public void createUI() {
		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(b1);
		panel.add(b2);
		frame.add(panel);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b3 = (JButton) e.getSource();
		if (b1 == b3) {
			String toAdd = JOptionPane.showInputDialog("Type a word to add");
			veiwable.add(toAdd);
		}
		if (b2 == b3) {
			for(String cycle : veiwable){
				toPrint+=cycle + " ";
			}
			JOptionPane.showMessageDialog(null, toPrint);
		}
	}
}
