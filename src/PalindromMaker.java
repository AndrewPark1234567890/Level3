import java.util.ArrayList;
import java.util.Stack;

public class PalindromMaker {
	public static void main(String[] args) {
		PalindromMaker w = new PalindromMaker();
		System.out.println(w.getPalindrome("eli is such an idiot his best insult is 'haze yourself' lol hes bad"));
	}

	public static String getPalindrome(String word) {
		Stack<Character> chz = new Stack<Character>();
		Stack<Character> chzforw = new Stack<Character>();
		String finalf = "";
		if (word.length() % 2 == 0) {
			for (int i = 0; i < word.length() / 2; i++) {
				chz.push(word.charAt(i));
				chzforw.push(word.charAt(i));
			}
			for (int i = 0; i < word.length() / 2; i++) {
				chzforw.push(chz.pop());
			}
		}else{
			for (int i = 0; i < word.length() / 2; i++) {
				chz.push(word.charAt(i));
				chzforw.push(word.charAt(i));
			}
			chzforw.push(word.charAt((word.length()/2)));
			for (int i = 0; i < word.length() / 2; i++) {
				chzforw.push(chz.pop());
			}
		}
		for (int i = 0; i < word.length(); i++) {
			finalf += chzforw.pop();
		}
		return finalf;
	}
}
