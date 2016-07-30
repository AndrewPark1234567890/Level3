import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		ArrayList<Integer> Lotto = new ArrayList<Integer>();
		ArrayList<Integer> LottoGuess = new ArrayList<Integer>();
		JOptionPane.showMessageDialog(null, "LETS PLAY THE POWERBALL");
		for (int i = 0; i < 5; i++) {
			int r = new Random().nextInt(100);
			Lotto.add(r);
			String guess = JOptionPane.showInputDialog("Guess a number 1 - 100");
			Integer g = Integer.parseInt(guess);
			LottoGuess.add(g);
		}
		JOptionPane.showMessageDialog(null, Lotto + " was the winning numbers.");
		JOptionPane.showMessageDialog(null, LottoGuess + " was your guess.");
		if (Lotto == LottoGuess) {
			JOptionPane.showMessageDialog(null, "YOU WON THE POWERBALL");
		} else {
			JOptionPane.showMessageDialog(null, "twas expected");
		}
	}
}
