import java.sql.Array;
import java.util.ArrayList;

public class Warmup2Test {

	public int[] maxFill(int[] expected2) {
		int l = expected2.length;
		int x = expected2[0];
		int y = 0;
		for (int i : expected2) {
			if (i > y) {
				y = i;
			}
		}
		for (int j = 0; j < expected2.length; j++) {
			expected2[j] = y;
		}
		return expected2;
	}

	public String mixString(String string, String string2) {
		String elFin = "";
		ArrayList<Character> c = new ArrayList<Character>();
		int l1 = string.length();
		int l2 = string2.length();
		if (l1 > l2) {
			for (int i = 0; i < l2; i++) {
				c.add(string.charAt(i));
				c.add(string2.charAt(i));
			}
			for (int i = 0; i < l2 - l1; i++) {
				c.add(string2.charAt(i + l1));
			}
		}
		if (l1 < l2) {
			for (int i = 0; i < l1; i++) {
				c.add(string.charAt(i));
				c.add(string2.charAt(i));
			}
			for (int i = 0; i < l2 - l1; i++) {
				c.add(string2.charAt(i + l1));
			}
		}
		if (l1 == l2) {
			for (int i = 0; i < l1; i++) {
				c.add(string.charAt(i));
				c.add(string2.charAt(i));
			}
		}
		for (Character ca : c) {
			elFin += ca;
		}
		return elFin;
	}

}
