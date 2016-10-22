import java.util.ArrayList;
import java.util.Stack;

public class Warmup3Test {
	public static void main(String[] args) {
		Warmup3Test w = new Warmup3Test();
		System.out.println(isPalinDrome("racecar"));
	}

	public int[] Mult1(int[] input1) {
		int largest = 0;
		for (int i : input1) {
			if (i > largest) {
				largest = i;
			}
		}
		for (int i = 0; i < input1.length; i++) {
			input1[i] = input1[i] * largest;
		}
		return input1;
	}

	public ArrayList<Integer> Mult2(ArrayList<Integer> input2) {
		int largest = 0;
		for (int i : input2) {
			if (i > largest) {
				largest = i;
			}
		}
		for (int i = 0; i < input2.size(); i++) {
			input2.set(i, input2.get(i) * largest);
		}
		return input2;
	}

	public static boolean isPalinDrome(String input) {
		String copyright = "";
		char[] c = input.toCharArray();
		Stack s = new Stack();
		for (int i = 0; i < c.length; i++) {
			s.push(new Character(c[i]));
		}
		for (int j = 0; j < c.length; j++) {	
		copyright += s.pop();
		}
		if (copyright.equals(input)) {
			return true;
		} else {
			return false;
		}
	}
}











































/*
 * Hi this is past me. I thought this was a good idea lol. Also look under your
 * mattress I got 20$ for u homeboy.
 */
// int most = 1;
// ArrayList<Integer> checkin = new ArrayList<Integer>();
// ArrayList<ArrayList<Integer>> listolist = new
// ArrayList<ArrayList<Integer>>();
// for (int i : input3) {
// if (checkin.contains(i)) {
//
// } else {
// checkin.add(i);
// }
// }
// for (int i = 0; i < checkin.size(); i++) {
// listolist.add(i);
// }
// return most;