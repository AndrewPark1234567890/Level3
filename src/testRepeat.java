import static org.junit.Assert.*;

import org.junit.Test;

public class testRepeat {
Repeat r = new Repeat(); 
	@Test
	public void testRepeatWithString() {
		String s1 = "bobxbobxbob"; 
		String s2 = "AabcAabcAabcA"; 
		String s3 = "Word";
		assertEquals(s1, r.RepeatWithString("bob", "x", 3));
		assertEquals(s2, r.RepeatWithString("A", "abc", 4)); 
		assertEquals(s3, r.RepeatWithString("Word", "5", 1));
	}
	@Test
	public void testRepeatedChar() {
		String s1 = "turtle";
		String s2 = "name";
		String s3 = "ladder";
		String s4 = "computer";
		boolean b1 = r.hasRepeatedChar(s1);
		boolean b2 = r.hasRepeatedChar(s2);
		boolean b3 = r.hasRepeatedChar(s3);
		boolean b4 = r.hasRepeatedChar(s4);
		System.out.println(b1);
		assertTrue(b1);
		System.out.println(b2);
		assertFalse(b2);
		System.out.println(b3);
		assertTrue(b3);
		System.out.println(b4);
		assertFalse(b4);
				
	}
}