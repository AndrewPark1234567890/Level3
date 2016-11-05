import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Warmup4 {
Warmup4Test w = new Warmup4Test();
@Test
public void testGetMode(){
	ArrayList<Integer> input1 = new ArrayList<Integer>();
	input1.add(3);
	input1.add(7);
	input1.add(2);
	input1.add(3);
	input1.add(3);
	input1.add(1);
	input1.add(5);
	assertEquals(w.getMode(input1), 3);
}
@Test
public void testGreaterThanMean(){
	ArrayList<Integer> input1 = new ArrayList<Integer>();
	input1.add(2);
	input1.add(1);
//	input1.add(4);
//	input1.add(5);
//	input1.add(3);
	ArrayList<Integer> result = new ArrayList<Integer>();
//	result.add(4);
//	result.add(5);
	result.add(2);
	assertEquals(w.greaterThanMean(input1), result);
}
}

