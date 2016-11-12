import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class Warmup5 {
	Warmup5Test w = new Warmup5Test();

	@Test
	public void testListSearch() {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("sheep");
		a1.add("ox");
		a1.add("deer");
		a1.add("sheep");
		a1.add("goat");
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("cat");
		a2.add("dog");
		a2.add("fish");
		assertTrue(w.hasRepeatedWord(a1));
		assertFalse(w.hasRepeatedWord(a2));

		assertEquals(4, w.getUniqueWords(a1));
		assertEquals(3, w.getUniqueWords(a2));
	}
}
