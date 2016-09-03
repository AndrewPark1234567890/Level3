import java.util.Random;

public class Randomness {
	public static boolean trues(){
		int r = new Random().nextInt(1);
		if(r == 0){
			return true;
		}else{
			return false;
		}
	}
	public static int numbs(){
		int r = new Random().nextInt(9)+1;
		return r;
	}
}
