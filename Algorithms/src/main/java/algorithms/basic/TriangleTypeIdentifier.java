package algorithms.basic;

public class TriangleTypeIdentifier {
	public static String identifyTriangleType(double side1, double side2, double side3) {
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			return "Invalid sides";
		}

		if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
			return "Not a triangle";
		}

		if (side1 == side2 && side2 == side3) {
			return "Equilateral triangle";
		} else if (side1 == side2 || side1 == side3 || side2 == side3) {
			return "Isosceles triangle";
		} else {
			return "Scalene triangle";
		}
	}
}
