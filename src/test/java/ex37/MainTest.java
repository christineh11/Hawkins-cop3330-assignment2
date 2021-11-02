package ex37;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testGeneratePassword() {
        int l = 8;
        int c= 2;
        int n = 2;
        String actual = Main.generatePassword(l,c,n);
        System.out.println(actual);

        assertNotNull(actual);

    }

    public void testGeneratePassword_diflength() {
        int l = 1;
        int c= 1;
        int n = 1;
        String actual = Main.generatePassword(l,c,n);
        System.out.println(actual);

        assertNotNull(actual);

    }
}