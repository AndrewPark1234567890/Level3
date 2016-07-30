import java.util.ArrayList;

public class Fibbonachi {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(1);
		System.out.println(numbers);
		for (int i = 0; i < 25; i++) {
		    Integer first = (numbers.get(numbers.size()-1)); 
		    Integer second = (numbers.get(numbers.size()-2));
		    Integer answ = first + second;
		    System.out.println(answ);
		    numbers.add(answ);
		}
	}
}
