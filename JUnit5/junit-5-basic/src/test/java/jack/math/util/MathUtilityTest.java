package jack.math.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

class MathUtilityTest {
	
	private MathUtility math;
	private TestInfo info;
	private TestReporter reporter;
	

	@BeforeEach
	void init(TestInfo info, TestReporter reporter) {
		math 			= new MathUtility();
		this.info 		= info;
		this.reporter 	= reporter;
		reporter.publishEntry("Running test " + info.getDisplayName() + " with tag " + info.getTags());
	}
	
	@Nested
	@Tag("Math")
	class addTest {
		@Test
		void testAddPositive() {
			assertEquals(2, math.add(1, 1), "An add method that add two integers, from " + MathUtility.class.getName().toString());
		}
		@Test
		void testAddNegative() {
			assertEquals(-2, math.add(-1, -1), () -> "An add method that add two integers, from " + MathUtility.class.getName().toString());
		}
	}

	@Test
	@Tag("Math")
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> math.divide(1, 0), "divided by zero should throw ArithmeticExcpetion, divide by zero");
	}

	@Test
	@Tag("Math")
	@DisplayName("multiply method")
	void testMultiply() {

		
		
		assertAll (
				() -> assertEquals(4, math.multiply(2, 2)),
				() -> assertEquals(0, math.multiply(2, 0)),
				() -> assertEquals(-4, math.multiply(2, -2))
				);
	}
	
	@Test
	@Tag("Math")
	void testComputeCircleRadius() {
		double radius = 10;
		double expected = Math.pow(radius, 2) * Math.PI;
		double actual 	= math.computeCircleArea(radius);
		String description = "An circle area computation method, from " + MathUtility.class.getName().toString();
		assertEquals(expected, actual, description);
	}
	
	@Test
	@Disabled
	@DisplayName("This test always fails for now")
	@Tag("NotMath")
	void testFails() {
		fail("Always fails");
	}
	
}
