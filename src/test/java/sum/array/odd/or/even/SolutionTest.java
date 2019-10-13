package sum.array.odd.or.even;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void oddOrEven() {
        assertEquals("odd", Solution.oddOrEven(new int[]{2, 5, 34, 6}));
        assertEquals("even", Solution.oddOrEven(new int[]{2, 2, 2, 2, 2}));
    }
}