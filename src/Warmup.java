
public class Warmup {
public int exclaimCount(String input){
	int marks = 0;
	for (int i = 0; i < input.length(); i++) {
		if(input.charAt(i) == '!'){
			marks ++;
		}
	}
	return marks;
}
public boolean isPrime(int input){
	double d = input;
	for (int i = 2; i < Math.sqrt(d)+1; i++) {
		if(input%i == 0){
			return false;
		}
	}
	return true;
	
}


}
