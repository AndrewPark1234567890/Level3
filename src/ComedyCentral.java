import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class ComedyCentral {
public static void main(String[] args) {
	ArrayList<String> Serve = new ArrayList<String>();
	ArrayList<String> SMASH = new ArrayList<String>();
	Serve.add("Wanna hear a joke?");
	SMASH.add("YOUR LIFE");
	Serve.add("Two scientists walk into a bar. One says Ill have H20. The other says I'll have H2O to.");
	SMASH.add("The second one dies");	
	Serve.add("Whats the difference between a red ferarri and a bucket of dead babies");
	SMASH.add("I don't have a red ferrari in my garage");
	Serve.add("A man pulls home from work with his car covered in sticks, leaves, and blood. His wife asks, 'What happened to the car??'. The man responds 'I hit my lawyer on the way home'. His wife says, 'well that explains the blood, but what about the sticks and leaves?'");
	SMASH.add("The man says 'Well, I had to chase him all through the park to get him'.");
	Serve.add("A horse walks into a bar. The bartender says 'Why the long face?");
	SMASH.add("The horse replies, 'my wife died this morning'");
	int r = new Random().nextInt(5);
JOptionPane.showMessageDialog(null, Serve.get(r));
JOptionPane.showMessageDialog(null, SMASH.get(r));
}
}
