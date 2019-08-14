package test.numbers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link ApplicationNumbers}
 */
public class StartTests {

    private ApplicationNumbers applicationNumbers;

    @Before
    public void before() {
        this.applicationNumbers = new ApplicationNumbers();
    }

    @Test
    public void testCalculationPositive() {
        this.applicationNumbers.calculation("1");
        this.applicationNumbers.calculation("2");
        this.applicationNumbers.calculation("3");
        this.applicationNumbers.calculation("4");
        this.applicationNumbers.calculation("5");

        Assert.assertEquals(1.0D, this.applicationNumbers.getMinimum(), 0.000001);
        Assert.assertEquals(5.0D, this.applicationNumbers.getMaximum(), 0.000001);
        Assert.assertEquals(5, this.applicationNumbers.getCount());
        Assert.assertEquals((1.0d + 2.0d + 3.0d + 4.0d + 5.0d), this.applicationNumbers.getSum(), 0.000001);
    }

    @Test
    public void testCalculationNegative() {
        this.applicationNumbers.calculation("-10");
        this.applicationNumbers.calculation("-202");
        this.applicationNumbers.calculation("30.50");
        this.applicationNumbers.calculation("40.0");
        this.applicationNumbers.calculation("-50.0");

        Assert.assertEquals(-202.0D, this.applicationNumbers.getMinimum(), 0.000001);
        Assert.assertEquals(40.0D, this.applicationNumbers.getMaximum(), 0.000001);
        Assert.assertEquals(5, this.applicationNumbers.getCount());
        Assert.assertEquals((-10.0d + (-202.0d) + 30.50d + 40.0d - 50.0d), this.applicationNumbers.getSum(), 0.000001);
    }
}
