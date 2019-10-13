package smallesinarray;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestInArrayFinderTest {

    SmallestInArrayFinder finder;
    @Before
    public void init (){

        finder = new SmallestInArrayFinder();
    }
    @Test
    public void findSmallestIntTest1() {
        int expected = 11;
        int actual = finder.findSmallestInt(new int[]{78,56,232,12,11,43});
        assertEquals(expected, actual);

    }
    @Test
    public void findSmallestIntTest2(){
        int expected = -33;
        int actual = finder.findSmallestInt(new int[]{78,56,-2,12,8,-33});
        assertEquals(expected, actual);
    }
}