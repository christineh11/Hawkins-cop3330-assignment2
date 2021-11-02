package ex28;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testTotal() {


        int expectedTotal = 15;
        int actual=Main.total();

        assertEquals(expectedTotal,actual);
    }
}

