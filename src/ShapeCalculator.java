
public class ShapeCalculator {

	public int calculateSquarePerimeter(int i) {
		// TODO Auto-generated method stub
		
		return i*4;
	}

	public int calculateRectanglePerimeter(int i, int j) {
		// TODO Auto-generated method stub
		return i+j+i+j;
	}

	public double calculateCircleArea(int i) {
		// TODO Auto-generated method stub
		return (i*Math.PI)*(i);
	}

	public double calculateCirclePerimeter(int i) {
		// TODO Auto-generated method stub
		return 2*Math.PI*i;
	}

}
