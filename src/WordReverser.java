import java.util.Stack;

import javax.swing.JOptionPane;

public class WordReverser {
Stack<Character>eli = new Stack<Character>();
String s = JOptionPane.showInputDialog("ENTER A WORD. ONE WORD ONLY YOU DUMKOF");
int leng = s.length();
	public static void main(String[] args) {
WordReverser wr = new WordReverser();
		wr.switeroo("sah dude");		
}
	WordReverser(){
		for (int j = 0; j < leng; j++) {
				eli.push(s.charAt(j));
	}
		}
public String switeroo(String s){
	String x = "";
	for (int i = 0; i < leng; i++) {
		x += eli.pop();
	}
	System.out.println(x);
	return x;
}
}
