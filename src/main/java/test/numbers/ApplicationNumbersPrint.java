package test.numbers;

import java.util.Objects;

/**
 * Prepare a printing data for {@link ApplicationNumbers}
 */
public class ApplicationNumbersPrint {

    public static final String MINIMUM = "Minimum ...... : ";
    public static final String MAXIMUM = "Maximum ...... : ";
    public static final String TOTAL_NUMBERS = "Total numbers  : ";
    public static final String AVERAGE = "Average ...... : ";

    private ApplicationNumbers applicationNumbers;

    public ApplicationNumbersPrint(ApplicationNumbers applicationNumbers) {
        this.applicationNumbers = applicationNumbers;
        Objects.requireNonNull(this.applicationNumbers);
    }

    public String getPrintMinimum() {
        return MINIMUM + this.applicationNumbers.getMinimum();
    }

    public String getPrintMaximum() {
        return MAXIMUM + this.applicationNumbers.getMaximum();
    }

    public String getPrintCount() {
        return TOTAL_NUMBERS + this.applicationNumbers.getCount();
    }

    public String getPrintAverage() {
        return AVERAGE + this.applicationNumbers.getAverage();
    }

    /**
     * Print total info.
     */
    public void printTotalInfo() {
        System.out.println(getPrintMinimum());
        System.out.println(getPrintMaximum());
        System.out.println(getPrintCount());
        System.out.println(getPrintAverage());
    }
}
