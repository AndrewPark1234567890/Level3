import java.util.ArrayList;

public class Repeat {

	public String RepeatWithString(String string, String string2, int i) {
		String repeated = "";
		for (int j = 0; j < i - 1; j++) {
			repeated += string;
			repeated += string2;
		}
		repeated += string;
		return repeated;
	}

	public boolean hasRepeatedChar(String s3) {
		ArrayList<Character> car = new ArrayList<Character>();
		boolean hasRepeated = false;
		char oneLetter;
		for (char c : s3.toCharArray()) {
			car.add(c);
		}
		for (int j = 0; j < car.size(); j++) {
			oneLetter = car.get(j);
			for (int i = 0; i < car.size(); i++) {
				char $ = car.get(i);
				if (j!=i) {
					if ($ == car.get(j)) {
						hasRepeated = true;
					}
				}
			}

		}

		return hasRepeated;
	}

}
