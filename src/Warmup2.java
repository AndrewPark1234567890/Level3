import static org.junit.Assert.*;

import org.junit.Test;

public class Warmup2{ 
	Warmup2Test w = new Warmup2Test();
@Test
    public void testMaxFill() {
        int[] expected1 = {1,2,3};
        int[] actual1 = {3,3,3};
        int[] expected2 = {11,5,9};
        int[] actual2 = {11,11,11};
        int[] expected3 = {2,11,3};
        int[] actual3 = {11,11,11};
        assertArrayEquals(w.maxFill(expected1), actual1);
        assertArrayEquals(w.maxFill(expected2), actual2);
        assertArrayEquals(w.maxFill(expected3), actual3);
    }
 

	@Test
    public void testMixString() {
        assertEquals(w.mixString("abc", "xyz"), "axbycz");
        assertEquals(w.mixString("Hi", "There"), "HTihere");
        assertEquals(w.mixString("xxxx", "There"), "xTxhxexre");
    }
}