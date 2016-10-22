import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class Warmup3 {
	Warmup3Test w = new Warmup3Test();
@Test
public void testMult1(){
int[] input1 = {0,1,2,3};
int[] result1 = {0,3,6,9};
assertArrayEquals(w.Mult1(input1), result1);
}
@Test
public void testMult2(){
	ArrayList<Integer> input2 = new ArrayList<Integer>();
	input2.add(0);
	input2.add(1);
	input2.add(2);
	input2.add(3);
	ArrayList<Integer> result2 = new ArrayList<Integer>();
	result2.add(0);
	result2.add(3);
	result2.add(6);
	result2.add(9);
	assertEquals(w.Mult2(input2), result2);
}

}