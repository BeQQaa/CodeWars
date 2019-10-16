package abbreviate.two.worlds;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

   private Solution solution;

    @Before
    public void init(){
        solution = new Solution();
    }

    @Test
    public void abbrevTwoWorlds() {
        assertEquals("Create abbreviate", "B.M", solution.abbrevTwoWorlds("Boris Monson"));
    }
}