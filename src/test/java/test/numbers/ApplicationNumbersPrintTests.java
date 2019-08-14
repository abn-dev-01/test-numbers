package test.numbers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link ApplicationNumbersPrint}
 */
public class ApplicationNumbersPrintTests {

    private ApplicationNumbers applicationNumbers;
    private ApplicationNumbersPrint print;

    @Before
    public void before() {
        this.applicationNumbers = new ApplicationNumbers();
        // prepare data
        this.applicationNumbers.calculation("1");
        this.applicationNumbers.calculation("2");
        this.applicationNumbers.calculation("3");
        this.applicationNumbers.calculation("4");
        this.applicationNumbers.calculation("5");

        this.print = new ApplicationNumbersPrint(applicationNumbers);
    }

    @Test
    public void testPrintMinimum() {
        String expected = ApplicationNumbersPrint.MINIMUM + applicationNumbers.getMinimum();
        Assert.assertEquals(expected, print.getPrintMinimum());
    }

    @Test
    public void testPrintMaximum() {
        String expected = ApplicationNumbersPrint.MAXIMUM + applicationNumbers.getMaximum();
        Assert.assertEquals(expected, print.getPrintMaximum());
    }

    @Test
    public void testPrintAverage() {
        String expected = ApplicationNumbersPrint.AVERAGE + applicationNumbers.getAverage();
        Assert.assertEquals(expected, print.getPrintAverage());
    }

    @Test
    public void testPrint() {
        String expected = ApplicationNumbersPrint.TOTAL_NUMBERS + applicationNumbers.getCount();
        Assert.assertEquals(expected, print.getPrintCount());
    }

}
