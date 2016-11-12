import java.util.ArrayList;
import java.util.HashMap;

public class Warmup5Test {

	public boolean hasRepeatedWord(ArrayList<String> a1) {
		HashMap<String, Integer> hashy = new HashMap<String, Integer>();
		boolean rep = false;
		for (int i = 0; i < a1.size(); i++) {
			if (hashy.containsKey(a1.get(i))) {
				hashy.put(a1.get(i), 2);
			} else {
				hashy.put(a1.get(i), 1);
			}
		}
		for (Integer k : hashy.values()) {
			if (k > 1) {
				rep = true;
			}
		}
		return rep;
	}

	public int getUniqueWords(ArrayList<String> a1) {
		int unique = 0;
		HashMap<String, Integer> hashy = new HashMap<String, Integer>();
		for (int i = 0; i < a1.size(); i++) {
			if (hashy.containsKey(a1.get(i))) {

			} else {
				hashy.put(a1.get(i), 1);
			}
		}
		for (Integer k : hashy.values()) {
			if (k == 1) {
				unique++;
			}
		}
		return unique;

	}
}
