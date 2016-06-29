import java.util.ArrayList;

public class OVERFLOW {
public static void main(String[] args) {
	ArrayList<String> helpMe = new ArrayList<String>();
	for (int i = 0; i < 999999999; i++) {
		helpMe.add("DIE ARRAY");
	}
}
}
