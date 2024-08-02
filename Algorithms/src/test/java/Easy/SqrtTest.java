package Easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {
    @Test
    public void testMySqrt_Case1() {
        Sqrt sol = new Sqrt();
        int result = sol.solution(4);
        assertEquals(2, result);
    }

    @Test
    public void testMySqrt_Case2() {
        Sqrt sol = new Sqrt();
        int result = sol.solution(8);
        assertEquals(2, result); // 2.82842... floors to 2
    }

    @Test
    public void testMySqrt_Case3() {
        Sqrt sol = new Sqrt();
        int result = sol.solution(1);
        assertEquals(1, result);
    }

    @Test
    public void testMySqrt_Case4() {
        Sqrt sol = new Sqrt();
        int result = sol.solution(0);
        assertEquals(0, result);
    }

    @Test
    public void testMySqrt_Case5() {
        Sqrt sol = new Sqrt();
        int result = sol.solution(2147395599);
        assertEquals(2147395599, result); // Large input case
    }

    @Test
    public void testMySqrt_Case6() {
        Sqrt sol = new Sqrt();
        int result = sol.solution(2);
        assertEquals(1, result);
    }

    @Test
    public void testMySqrt_Case7() {
        Sqrt sol = new Sqrt();
        int result = sol.solution(9);
        assertEquals(3, result);
    }

    @Test
    public void testMySqrt_Case8() {
        Sqrt sol = new Sqrt();
        int result = sol.solution(10);
        assertEquals(3, result); // 3.1622... floors to 3
    }
}
