package nostringspace;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoSpaceTest {

    NoSpace space = new NoSpace();
    @Test
    public void rmSpace() {
        assertEquals("8j8mBliB8gimjB8B8jlB", space.rmSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", space.rmSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", space.rmSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", space.rmSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", space.rmSpace("8j aam"));
    }
}