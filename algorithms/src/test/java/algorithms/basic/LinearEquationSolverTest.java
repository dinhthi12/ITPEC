package algorithms.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinearEquationSolverTest {

	@Test
	public void testLinearEquationWithSolution() {
		double expectedSolution = 2.0;
		double actualSolution = LinearEquationSolver.solveLinearEquation(2, -4);
		assertEquals(expectedSolution, actualSolution, 0.0001);
	}

	@Test
	public void testLinearEquationWithInfiniteSolutions() {
		double actualSolution = LinearEquationSolver.solveLinearEquation(0, 0);
		assertEquals(Double.POSITIVE_INFINITY, actualSolution, 0.0001);
	}

	@Test
	public void testLinearEquationWithNoSolution() {
		double actualSolution = LinearEquationSolver.solveLinearEquation(0, 5);
		assertEquals(Double.NaN, actualSolution, 0.0001);
	}
}
