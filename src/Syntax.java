import java.util.ArrayList;
import java.util.Stack;

public class Syntax {
	public static void main(String[] args) {
		if (hasGoodSyntax("[][") == true) {
			System.out.println("WINNER");
		} else {
			System.out.println("loser...");
		}
	}

	public static boolean hasGoodSyntax(String input) {
		boolean good = true;
		ArrayList<Character> carrys = new ArrayList<Character>();
		for (int i = 0; i < input.length(); i++) {
			carrys.add(input.charAt(i));
		}
		Stack stack = new Stack();
		for (char c : carrys) {
			stack.push(c);
		}
		if (!input.contains("{") && input.contains("}") || !input.contains("}") && input.contains("{")) {
			good = false;
		}
		if (!input.contains("(") && input.contains(")") || !input.contains(")") && input.contains("(")) {
			good = false;
		}
		if (!input.contains("<") && input.contains(">") || !input.contains(">") && input.contains("<")) {
			good = false;
		}
		if (!input.contains("[") && input.contains("]") || !input.contains("]") && input.contains("[")) {
			good = false;
		}
		return good;
	}
}
