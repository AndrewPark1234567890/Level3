import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pagez implements KeyListener {
	String s = "";
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Stack<Character> chars = new Stack<Character>();
	Character deleted = null;
	public static void main(String[] args) {
		Pagez p = new Pagez();
		p.createUI();
	}

	public void createUI() {
		frame.addKeyListener(this);
		panel.add(label);
		frame.add(panel);
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE && s.length() != 0) {
			chars.push(s.charAt(s.length()-1));			
			s = s.substring(0, s.length() - 1);
			
		} else if (e.getKeyCode() == KeyEvent.VK_UP && chars.size() != 0 ) {
			s += chars.pop();
		} else if(e.getKeyCode() != KeyEvent.VK_UP){
			s += e.getKeyChar();
			chars.push(e.getKeyChar());
		}
		label.setText(s);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
