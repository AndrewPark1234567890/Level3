import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Hangman {
	static String word = "apple";
	static int lives = 9;

	public static void main(String[] args) {
		ArrayList<Character> wordChars = new ArrayList<Character>();
		for (int i = 0; i < word.length(); i++) {
			wordChars.add(word.charAt(i));
		}
		Scanner s = new Scanner(System.in);
		System.out.println("Hangman time!");
		System.out.println("The word has " + word.length() + " letters.");
		System.out.println("You have " + lives + " lives.");
		System.out.println("Time to guess!");
		for (int i = 0; i < word.length(); i++) {
			System.out.print("_");
		}
	}
}