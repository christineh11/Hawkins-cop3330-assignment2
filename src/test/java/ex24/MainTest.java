package ex24;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testIsAnagram_true() {

        boolean expected = true;
        boolean actual = Main.isAnagram("tone", "note");

        assertEquals(expected,actual);
    }

    public void testIsAnagram_false() {

        boolean expected = false;
        boolean actual = Main.isAnagram("loop", "loopy");

        assertEquals(expected,actual);
    }

}