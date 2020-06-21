package jack.math.util;

public class MathUtility {

	public int add(int a, int b) {
		return a + b ;
	}

	public int subtract(int a, int b) {
		return a - b ;
	}

	public int multiply(int a, int b) {
		return a * b ;
	}

	public int divide(int a, int b) {
		return a / b ;
	}
	
	
	public double computeCircleArea(double radius) {
		return Math.pow(radius, 2) * Math.PI ;
	}
}
