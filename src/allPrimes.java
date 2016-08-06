

import java.util.Date;

public class allPrimes {
public static void main(String[] args) {
	Date Start = new Date(System.currentTimeMillis());
	long t1 = Start.getTime();
	for (int i = 2; i < 1000000; i++) {
		if(sqrtCalc.calc(i)){
			//System.out.println(i);
		}
		}
	Date End = new Date(System.currentTimeMillis());
	long t2 = End.getTime();
	System.out.println(t2-t1-30);
}
}
