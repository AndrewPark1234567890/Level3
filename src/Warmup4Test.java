import java.util.ArrayList;
import java.util.HashMap;

public class Warmup4Test {

	public int getMode(ArrayList<Integer> input1) {
		int mode;
		HashMap<Integer, Integer> modem = new HashMap<Integer, Integer>();
		for (int i : input1) {
			if (modem.containsKey(i)) {
				modem.put(i, modem.get(i) + 1);
			} else {
				modem.put(i, 1);
			}
		}
		int highest = -1;

		for (Integer k : modem.keySet()) {

			if (modem.get(k) > highest) {
				highest = modem.get(k);
			}
		}
		mode = modem.get(highest);
		return mode;
	}

	public ArrayList greaterThanMean(ArrayList<Integer> input1) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int totes = 0;
		int divBy = 0;
		for (Integer i : input1) {
			totes += i;
			divBy++;
		}
		int mean = totes / divBy;
		for (Integer i : input1) {
			if (i > mean) {
				result.add(i);
			}
		}
		return result;
	}
}