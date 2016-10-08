import java.util.HashMap;

public class CharCountHash {
	public static void main(String[] args) {
		System.out.println(charCount("goodbye", 'g'));
	}
public static int charCount(String input, char check){
	int total = 0;
	HashMap map = new HashMap();
//	for (int i = 0; i < input.length(); i++) {
//		//map.put(i, input.charAt(i));
	if(map.containsKey(check)){
		int counts = (int) map.get(check);
		total += counts;
		map.put(check, total);
		map.get(total);
	}
	//}

	return total;
}
}
