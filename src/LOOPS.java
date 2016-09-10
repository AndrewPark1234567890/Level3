
public class LOOPS {
public static void main(String[] args) {
	LOOPS l = new LOOPS();
	l.func1();
}
public static void func1(){
	System.out.println("INFINIATE");
	func2();
}public static void func2(){
	System.out.println("LOOP");
	func1();
}
}