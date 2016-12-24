import java.util.ArrayList;
import java.util.Stack;

public class TestTesting {
	static ArrayList<String> inputs = new ArrayList<String>();
public static void main(String[] args) {
	inputs.add("test");
	inputs.add("a");
	inputs.add("is");
	inputs.add("this");
	turner(inputs);
}
public static void turner(ArrayList<String> f){
	Stack s = new Stack();
	for(String st: f){
		s.push(st);
	}
	for (int i = 0; i < f.size(); i++) {
		System.out.println(s.pop());
	}
}

}
