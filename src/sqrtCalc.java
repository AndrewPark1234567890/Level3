

import javax.swing.JOptionPane;

public class sqrtCalc {
	public static void main(String[] args){
//		String x = JOptionPane.showInputDialog("Pick a number to be prime checked");
//		int l = Integer.parseInt(x);
//		if(calc(l)){
//			JOptionPane.showMessageDialog(null, "It's prime");
//		}else{
//			JOptionPane.showMessageDialog(null, "It's not prime");
//		}
	}

	public static boolean calc(int x) {
		if(x == 2){
			return true;
		}
		if(x%2 == 0){
			return false;
		}
		for (int i = 3; i < Math.sqrt(x)+1; i+=2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;

	}
}
