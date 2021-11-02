package ex25;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testPasswordValidator() {

        String input="1234hh";
        Main.PasswordValidator(input);

        assertNotNull(input);
    }
}