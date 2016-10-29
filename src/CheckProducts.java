import java.util.ArrayList;

public class CheckProducts {
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(2);
	list.add(3);
	list.add(1);
	list.add(4);
	list.add(3);
	list.add(2);
	outputs(list);
}
	public static void outputs(ArrayList<Integer> list){
		int total = 1;
		for(Integer i: list){
			total *= i;
		}
		for (Integer i: list) {
			System.out.println(total/i);
		}
	}
}
