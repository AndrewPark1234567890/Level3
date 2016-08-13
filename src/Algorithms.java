import java.util.List;

public class Algorithms {
	public static void main(String[] args) {

	}

	public static int findBrokenEgg(List<String> eggs) {
		int posOfBroken = 0;
		for (String e : eggs) {
			if (e.equals("cracked")) {
				return posOfBroken;
			}
			posOfBroken++;
		}
		return posOfBroken;
	}

	public static int countPearls(List<Boolean> oysters) {
		int posOfBroken = 0;
		for (Boolean e : oysters) {
			if (e) {
				posOfBroken++;
			}
		}
		return posOfBroken;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (Double e : peeps) {
			if (e > tallest) {
				tallest = e;
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String tallest = "";
		for (String e : words) {
			if (e.length() > tallest.length()) {
				tallest = e;
			}
		}
		return tallest;
	}
public static Boolean containsSOS(List<String> mes){
	Boolean containsSOS = false;
	for(String e: mes){
		if(e.contains("... --- ...")){
		containsSOS = true;
		}
	}
	return containsSOS;
}
}



