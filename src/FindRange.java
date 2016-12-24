import java.util.ArrayList;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class FindRange {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		FindRange fR = new FindRange();
		//fR.runner();
	}

	public void smallsAndLarges(ArrayList<Integer> nums) {
		System.out.println("This progam find the largest and smallest numbers, and ends when you enter 0");
//		ArrayList<Integer> nums = new ArrayList<Integer>();
//		System.out.println("?");
//		int i = sc.nextInt();
//		System.out.println("?");
//		while (i != 0) {
//			nums.add(i);
//			i = sc.nextInt();
//			System.out.println("?");
//		}
//		System.out.println("Input complete... Running...");
		try{
		int largest = nums.get(0);
		int smallest = nums.get(0);
		for (int g : nums) {
			if (g > largest) {
				largest = g;
			}
		}
		for (int g : nums) {
			if (g < smallest) {
				smallest = g;
			}
		}
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
	}catch(java.lang.IndexOutOfBoundsException k){
		System.out.println("Start with anything but 0 dummy");
	}
	}
}