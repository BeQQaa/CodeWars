package divisible;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisibleNbTest {

    private DivisibleNb divisibleNb = new DivisibleNb();
    @Test
    public void test1() {
        assertTrue(divisibleNb.isDivisible(12, 4, 3));
    }
    @Test
    public void test2(){
        assertFalse(divisibleNb.isDivisible(3, 4, 3));
    }
}