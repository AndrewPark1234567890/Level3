import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SantaList implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	ArrayList<JLabel> labels = new ArrayList<JLabel>();

	public static void main(String[] args) {
		SantaList list = new SantaList();
		list.loadList(list);
		list.createUI();

	}

	private ArrayList<JLabel> loadList(SantaList list) {

		labels.add(list.loadImageFromTheInternet("http://www.fascinationtrading.com/wp-content/uploads/2015/05/source_coal.jpg"));
		labels.add(list.loadImageFromTheInternet("http://i.imgur.com/6OeAJWf.png"));
		labels.add(list.loadImageFromTheInternet("https://cdn6.bigcommerce.com/s-5p6k1/products/2255/images/8709/chess_sets_black_ash_burl_burnt_parker_burnt_zoom_1400x720__56958.1446222239.1280.1280.jpg"));
		labels.add(list.loadImageFromTheInternet("https://i.s-jcrew.com/is/image/jcrew/19614_ED9986?$pdp_fs418$"));
		labels.add(list.loadImageFromTheInternet("http://nickgrantham.com/wp-content/uploads/2014/12/russian-dolls2.jpg"));
		return labels;
	}

	private void createUI() {

		getR(labels, panel);
		panel.addMouseListener(this);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	}

	private void getR(ArrayList<JLabel> labels, JPanel panel) {
		
		int r = new Random().nextInt(labels.size());
		panel.add(labels.get(r));
		frame.pack();
	}

	private JLabel loadImageFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private JLabel loadImageFromJavaProject(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		panel.removeAll();
		System.out.println("Changing");
		getR(labels, panel);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
// Teachers note: Discuss the data structure that would be used for this photo
// album. Have students create ArrayList of JLabels on the whiteboard.
//
// Show an image on the screen using a JFrame.

// Add pictures of things that you want for Christmas to the List.
// Create and initialize an ArrayList of JLabels.
// Use the methods above to load images from the Internet or from your default
// package.
// Add the JLabels to the List.
//
// When the mouse is clicked, show a random image from the List.
