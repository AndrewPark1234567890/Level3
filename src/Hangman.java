import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
	static String word = "";
	static int lives = 6;
	static Scanner s = new Scanner(System.in);
	static Character c;
	static ArrayList<Character> wordy = new ArrayList<Character>();
	static String wordPrint = "";
	static String guessChecker = "";

	public static void main(String[] args) {
		ArrayList<Character> wordChars = new ArrayList<Character>();
		for (int i = 0; i < word.length(); i++) {
			wordChars.add(word.charAt(i));
		}

		// Start
		System.out.println("Hangman time!");
		System.out.println("The word has " + word.length() + " letters.");
		for (int i = 0; i < word.length(); i++) {
			wordy.add('_');
		}
		for (Character c : wordy) {
			wordPrint = wordPrint + "_";
			guessChecker = wordPrint;
		}

		runner();
	}

	public static void start() {
		System.out.println("You have " + lives + " lives.");
		System.out.println("Time to guess!");
		drawGallows();
		System.out.println("Word:");
	}

	public static void runner() {
		start();
		System.out.println(wordPrint);
		while (lives > 0) {
			c = getGuess();
			for (int i = 0; i < word.length(); i++) {
				if (c == word.charAt(i)) {
					for (int j = 0; j < word.length(); j++) {
						if (word.charAt(j) == c) {
							char[] changer = wordPrint.toCharArray();
							changer[j] = c;
							wordPrint = new String(changer);
						}
					}
				}
			}
			if (wordPrint == guessChecker) {
				lives--;
			}
			if (wordPrint == word) {
				System.out.println("You win!!!!");
				boolean l = false;
				while (!l) {
					System.out.println("Play again? (Yes or No)");
					String guess = s.next();
					if (guess.equals("No")) {
						System.out.println("game over;");
						l = true;
						break;
					}
					if (guess.equals("Yes")) {
						System.out.println("AGAIN! :D");
						l = true;
						lives = 6;
						runner();
					} else {
						System.out.println("what?");
					}
				}
			}
			if (lives == 0) {
				drawGallows();
				System.out.println("You lose. The word was " + word + ".");
				boolean l = false;
				while (!l) {
					System.out.println("Play again? (Yes or No)");
					String guess2 = s.next();
					if (guess2.equals("No")) {
						System.out.println("game over;");
						l = true;
						break;
					}
					if (guess2.equals("Yes")) {
						System.out.println("AGAIN! :D");
						l = true;
						lives = 6;
						runner();
					} else {
						System.out.println("what?");
					}
				}
			}
			start();
			System.out.println(wordPrint);
			guessChecker = wordPrint;
		}
	}

	public static Character getGuess() {
		String guess = s.next();
		boolean l = false;
		while (!l) {
			if (guess.length() != 1) {
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
		if (lives == 6) {
			System.out.println(
					"_______\n" + "|     |\n" + "|     \n" + "|    \n" + "|    \n" + "|_________\n" + "|________|\n");
		} else if (lives == 5) {
			System.out.println(
					"_______\n" + "|     |\n" + "|     O\n" + "|     \n" + "|    \n" + "|_________\n" + "|________|\n");
		} else if (lives == 4) {
			System.out.println("_______\n" + "|     |\n" + "|     O\n" + "|     |\n" + "|    \n" + "|_________\n"
					+ "|________|\n");
		} else if (lives == 3) {
			System.out.println("_______\n" + "|     |\n" + "|     O\n" + "|     |\\ \n" + "|    \n" + "|_________\n"
					+ "|________|\n");
		} else if (lives == 2) {
			System.out.println("_______\n" + "|     |\n" + "|     O\n" + "|    /|\\ \n" + "|    \n" + "|_________\n"
					+ "|________|\n");
		} else if (lives == 1) {
			System.out.println("_______\n" + "|     |\n" + "|     O\n" + "|    /|\\ \n" + "|    /\n" + "|_________\n"
					+ "|________|\n");
		} else if (lives == 0) {
			System.out.println("_______\n" + "|     |\n" + "|     O\n" + "|    /|\\ \n" + "|    / \\ \n"
					+ "|_________\n" + "|________|\n");
		}

	}

	public static String wordgen() {
		int num = (int) Math.ceil(Math.random() * 1001);
		try {
			FileReader fr = new FileReader("HangmanWords.txt");
			BufferedReader textReader = new BufferedReader(fr);
			int numLines = 1001;
			String[] textData = new String[numLines];
			for (int i = 0; i < num; i++) {
				textData[i] = textReader.readLine();
			}
			textReader.close();
			return textData;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String word = "apple";
		return word;
	}
}
/*
 * ------- | | | O | /|\ | / \ |--------- |________|
 */
