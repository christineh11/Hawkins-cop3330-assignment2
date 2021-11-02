package ex38;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class MainTest extends TestCase {

    public void testFilterEvenNumbers() {

        String[] testInput = new String[]{"1 2 3 4 5 6 7 8 "};
        Integer [] Actual = Main.filterEvenNumbers(testInput);
        String [] expected = new String[]{"2 4 6 8"};
        Integer [] Expec= Main.filterEvenNumbers(expected);

        assertEquals(Expec,Actual);
    }
}