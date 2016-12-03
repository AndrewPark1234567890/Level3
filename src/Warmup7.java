import java.util.ArrayList;

public class Warmup7 {
	static int[]inpact={0,3,7,8,10,5,20};
	static String first = "turkey";
	static String second = "gravy";
	public static void main(String[] args) {
		System.out.println(sumOfMidAndMax(inpact));
		System.out.println(inBoth(first, second));
	}

public static int sumOfMidAndMax(int[]inpact){
	int max = 0;
	int sum = 0;
	for(int i: inpact){
		if(i > max);
		max = i;
	}
int min = max;
	for(int i: inpact){
		if(i < min){
			min = i;
		}
	}
	sum = min + max;
	return sum;
}

public static ArrayList inBoth(String first, String second){
	ArrayList<Character> chars = new ArrayList<Character>();
	String longer;
	String other;
	if(first.length()>second.length()){
		longer = first;
		other = second;
	}else{
		longer = second;
		other = first;
	}
	for (int i = 0; i < other.length(); i++) {
		for (int j = 0; j < other.length(); j++) {
			char c= longer.charAt(i);
			if(c == other.charAt(i)){
				chars.add(c);
		}
	}
	}
	return chars;
}
}