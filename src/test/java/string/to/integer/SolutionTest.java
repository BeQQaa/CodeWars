package string.to.integer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution;


    @Before
    public void init (){
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals("Sting to int",123345, solution.castToInt("123345"));
    }
    @Test
    public void test2() {
        assertEquals("Sting to int",605, solution.castToInt("605"));
    }
    @Test
    public void test3() {
        assertEquals("Sting to int",1405, solution.castToInt("1405"));
    }
    @Test
    public void test4() {
        assertEquals("Sting to int",-7, solution.castToInt("-7"));
    }
}