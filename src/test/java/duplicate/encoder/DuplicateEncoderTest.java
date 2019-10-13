package duplicate.encoder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuplicateEncoderTest {
    DuplicateEncoder encoder = new DuplicateEncoder();

    @Test
    public void encode() {
        assertEquals(")))", encoder.encode("aaa"));
        assertEquals("(((", encoder.encode("asd"));
        assertEquals("((", encoder.encode(") "));
        assertEquals("))", encoder.encode("(("));
        assertEquals("(((((", encoder.encode("!@#$%"));
    }
}