import java.util.ArrayList;
import java.util.Random;

public class Anagramer {
	public static void main(String[] args) {
		Anagramer a = new Anagramer();
		System.out.println(a.scrambler("pi"));
	}

	public static String scrambler(String word) {
		String fin = "";
		ArrayList<Character> kachow = new ArrayList<Character>();
		ArrayList<Integer> limits = new ArrayList<Integer>();
		Random r = new Random();
		int rand;
		for (int i = 0; i < word.length(); i++) {
			rand = r.nextInt(word.length());
			while(limits.contains(rand)){
				rand = r.nextInt(word.length());
			}
			limits.add(rand);
			kachow.add(word.charAt(rand));
		}
		for (int i = 0; i < word.length(); i++) {
			fin += kachow.get(i);
		}
		if (fin.equals(word)){
			fin = scrambler(word);
		}
		return fin;
	}
}
