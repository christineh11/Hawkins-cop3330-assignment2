package ex31;

import junit.framework.TestCase;

public class TargetHeartRateTest extends TestCase {

    public void testRateCalculator() {
        int age = 22;
        int restingHR = 65;
        double expected = 191;
        double actual = TargetHeartRate.RateCalculator(age,restingHR);

        assertEquals(expected,actual);

    }
}