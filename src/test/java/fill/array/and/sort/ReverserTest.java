package fill.array.and.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverserTest {

    @Test
    public void reverse() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, Reverser.reverse(5));
    }
}