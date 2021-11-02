package ex40;

import junit.framework.TestCase;

public class Record2Test extends TestCase {

    public void testSetFirstName() {

        String f="John";
        assertNotNull(f);
    }

    public void testSetLastName() {
        String l="Johnson";
        assertNotNull(l);
    }

    public void testSetposition() {
        String p="Manager";
        assertNotNull(p);
    }
}