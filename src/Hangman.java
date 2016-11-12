import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
	static String word = "apple";
	static int lives = 5;
	static Scanner s = new Scanner(System.in);
	static Character c;
	static ArrayList<Character> wordy = new ArrayList<Character>();

	public static void main(String[] args) {
		ArrayList<Character> wordChars = new ArrayList<Character>();
		for (int i = 0; i < word.length(); i++) {
			wordChars.add(word.charAt(i));
		}

		// Start
		System.out.println("Hangman time!");
		System.out.println("The word has " + word.length() + " letters.");
		System.out.println("You have " + lives + " lives.");
		System.out.println("Time to guess!");
		drawGallows();
		System.out.println("Word:");
		for (int i = 0; i < word.length(); i++) {
			wordy.add("_");
		}
		System.out.println(wordy);
		runner();
	}

	public static void runner() {
		while (lives > 0) {
			c = getGuess();
			for (int i = 0; i < word.length(); i++) {
				if (c == word.charAt(i)) {
					wordy = c;
				}
			}
		}
	}

	public static Character getGuess() {
		String guess = s.next();
		boolean l = false;
		while (!l) {
			if (guess.length() == 1) {
				System.out.println("Only one letter per guess.... you idiot");
				guess = s.next();
			} else {
				l = true;
			}
		}
		Character c = guess.charAt(0);
		return c;
	}

	public static void drawGallows() {
		System.out.println(
				"_______\n" + "|     |\n" + "|     \n" + "|    \n" + "|    \n" + "|_________\n" + "|________|\n");
	}
}
/*
 * ------- | | | O | /|\ | / \ |--------- |________|
 */
