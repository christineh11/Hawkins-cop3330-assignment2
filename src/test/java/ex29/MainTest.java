package ex29;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testMain() {

        String parameter = "4";
        double actual = Main.main(parameter);
        double expected = 18;

        assertEquals(expected,actual);

    }
}