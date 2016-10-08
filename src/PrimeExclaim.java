import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeExclaim {
	Warmup w = new Warmup();
@Test
public void testRegularCase(){
	assertEquals(3, w.exclaimCount("hello!!!"));
	assertEquals(2, w.exclaimCount("good!bye!"));
}
@Test
public void testNoExclamation(){
	assertEquals(0, w.exclaimCount(""));
	assertEquals(0, w.exclaimCount("hello"));
}
@Test
public void testPrimeNumber(){
	assertTrue(w.isPrime(17));
	assertTrue(w.isPrime(193));
}
@Test
public void testNotPrime(){
	assertFalse(w.isPrime(9));
	assertFalse(w.isPrime(100));
}
}
