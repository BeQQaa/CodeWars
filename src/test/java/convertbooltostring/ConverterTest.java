package convertbooltostring;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    private Converter converter = new Converter();
    @Test
    public void boolToString() {
        assertEquals("Yes",converter.boolToString(true));
        assertEquals("No",converter.boolToString(false));
    }
}