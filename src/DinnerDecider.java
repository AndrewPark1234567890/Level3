import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class DinnerDecider {
	public static void main(String[] args) {
		ArrayList<String> eaterz = new ArrayList<String>();
		eaterz.add("Jack");
		eaterz.add("Pizza");
		eaterz.add("Dan");
		eaterz.add("Tacos");
		eaterz.add("Eggs");
		eaterz.add("Nothing");
		eaterz.add("Everything");
		int r = new Random().nextInt(7);
		String toEat = eaterz.get(r);
		JOptionPane.showMessageDialog(null, "You should eat " + toEat + " tonight.");
	}
}
