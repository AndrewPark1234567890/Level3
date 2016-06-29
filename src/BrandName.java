import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class BrandName {
public static void main(String[] args) {
	ArrayList<String> brand = new ArrayList<String>();
	ArrayList<String> name = new ArrayList<String>();
	brand.add("happy");
	brand.add("mlg");
	brand.add("inimitable");
	brand.add("Non-Stop");
	brand.add("Interlocking");
	name.add("SOUTHERN DEMOCRATIC REPUBLICIANS");
	name.add("secretaries");
	name.add("Roaches");
	name.add("trees");
	name.add("counter-terrorists");
	int r = new Random().nextInt(5);
	int r2 = new Random().nextInt(5);
	String p1 = brand.get(r);
	String p2 = name.get(r2);
	JOptionPane.showMessageDialog(null, "Your brand name is " + p1 +"-" + p2 + ".");
}
}
