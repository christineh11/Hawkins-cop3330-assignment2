package ex26;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class PaymentCaluclatorTest extends TestCase {

     @Test
    public void testCalculateMonthsUntilPaidOff() {

        double balance = 5000;
        double APR = 12;
        double monthlyPayment = 100;
        double expectedMonths = 70;
        double actualMonths = PaymentCaluclator.calculateMonthsUntilPaidOff(balance,APR,monthlyPayment);

        assertEquals(expectedMonths,actualMonths);
    }
}