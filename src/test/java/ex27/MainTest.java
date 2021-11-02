package ex27;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testValidateinput() {

        String firstname ="Christine";
        String lastname="Hawkins";
        boolean expected = true;
        boolean actual = Main.Validateinput(firstname, lastname);

        assertEquals(expected,actual);

    }

    public void testValidatezip_false() {
        String zipcode ="24GHH";
        boolean expected = false;
        boolean actual = Main.Validatezip(zipcode);

        assertEquals(expected,actual);
    }

    public void testValidatezip_true() {
        String zipcode ="55555";
        boolean expected = true;
        boolean actual = Main.Validatezip(zipcode);

        assertEquals(expected,actual);
    }

    public void testVerifyID_true() {
        String employeeId ="DD-4321";
        boolean expected = true;
        boolean actual = Main.verifyID(employeeId);

        assertEquals(expected,actual);
    }

    public void testVerifyID_false() {
        String employeeId ="l90!bbb";
        boolean expected = false;
        boolean actual = Main.verifyID(employeeId);

        assertEquals(expected,actual);
    }
}