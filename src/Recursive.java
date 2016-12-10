
public class Recursive {
	static int fin = 0;

	public static void main(String[] args) {
		System.out.println(recrec(0));
	}

	public static int recrec(int enter) {
		if (enter != 0) {
			fin += enter % 10;
			recrec(enter /= 10);
		}
		return fin;
	}
}
