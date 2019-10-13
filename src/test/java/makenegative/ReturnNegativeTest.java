package makenegative;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReturnNegativeTest {
ReturnNegative negative = new ReturnNegative();
    @Test
    public void makeNegative() {
        assertEquals(-42, negative.makeNegative(42));
        assertEquals(0, negative.makeNegative(0));
        assertEquals(-33, negative.makeNegative(-33));
    }
}