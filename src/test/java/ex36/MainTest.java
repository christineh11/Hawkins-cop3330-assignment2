package ex36;

import junit.framework.TestCase;

import java.util.ArrayList;

public class MainTest extends TestCase {

    public void testCalculateAverage() {

        ArrayList<Integer> test = new ArrayList<>();
        test.add(0, 100);
        test.add(1, 200);
        test.add(2, 1000);
        test.add(3, 300);
        double actual = Main.calculateAverage(test);
        double expected = 400;

        assertEquals(expected, actual);
    }

    public void testMax() {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(0, 100);
        test.add(1, 200);
        test.add(2, 1000);
        test.add(3, 300);
        double actual = Main.max(test);
        double expected = 1000;

        assertEquals(expected, actual);
    }

    public void testMin() {

        ArrayList<Integer> test = new ArrayList<>();
        test.add(0, 100);
        test.add(1, 200);
        test.add(2, 1000);
        test.add(3, 300);
        double actual = Main.min(test);
        double expected = 100;

        assertEquals(expected, actual);
    }

    public void testStdD() {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(0, 100);
        test.add(1, 200);
        test.add(2, 1000);
        test.add(3, 300);
        double actual = Main.stdD(test);
        double expected = 353.5887441647429;

        assertEquals(expected, actual,.005);
    }
}