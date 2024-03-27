package algorithms.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TriangleTypeIdentifierTest {

	@Test
	public void testEquilateralTriangle() {
		String expectedType = "Equilateral triangle";
		String actualType = TriangleTypeIdentifier.identifyTriangleType(5, 5, 5);
		assertEquals(expectedType, actualType);
	}

	@Test
	public void testIsoscelesTriangle() {
		String expectedType = "Isosceles triangle";
		String actualType = TriangleTypeIdentifier.identifyTriangleType(4, 4, 5);
		assertEquals(expectedType, actualType);
	}

	@Test
	public void testScaleneTriangle() {
		String expectedType = "Scalene triangle";
		String actualType = TriangleTypeIdentifier.identifyTriangleType(3, 4, 5);
		assertEquals(expectedType, actualType);
	}

	@Test
	public void testNotATriangle() {
		String expectedType = "Not a triangle";
		String actualType = TriangleTypeIdentifier.identifyTriangleType(1, 2, 3);
		assertEquals(expectedType, actualType);
	}

	@Test
	public void testInvalidSides() {
		String expectedType = "Invalid sides";
		String actualType = TriangleTypeIdentifier.identifyTriangleType(-1, 2, 3);
		assertEquals(expectedType, actualType);
	}

}
