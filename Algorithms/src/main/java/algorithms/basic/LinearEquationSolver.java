package algorithms.basic;

public class LinearEquationSolver {
	public static double solveLinearEquation(double a, double b) {
		if (a == 0) {
			if (b == 0) {
				return Double.POSITIVE_INFINITY;
			} else {
				return Double.NaN;
			}
		} else {
			return -b / a;
		}
	}
}
