import static org.junit.Assert.*;

import org.junit.Test;

public class tester {
//	@Test
//	void testStringManipulator() {
//		StringManipulator sm = new StringManipulator();
//		assertEquals("sdrowkcab", sm.reverseWord("backwards"));
////		assertEquals("CAPITAL", sm.capitalizeWord("captial"));
//		assertEquals("lowercase", sm.uncapitalizeddWord("LoWerCAsE"));
	//}

	@Test
	public void testShapeCalculator() {
		ShapeCalculator sc = new ShapeCalculator();
		assertEquals(16, sc.calculateSquarePerimeter(4));
		assertEquals(12, sc.calculateRectanglePerimeter(2, 4));
		assertEquals(Math.PI, sc.calculateCircleArea(1),.0001);
		assertEquals(2 * Math.PI, sc.calculateCirclePerimeter(1),.0001);
	}
}
