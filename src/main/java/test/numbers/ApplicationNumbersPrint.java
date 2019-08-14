package test.numbers;

import java.util.Objects;

/**
 * Prepare a printing data for {@link ApplicationNumbers}
 */
public class ApplicationNumbersPrint {

    public static final String MINIMUM = ResourceUtil.getMessageString("minimum");
    public static final String MAXIMUM = ResourceUtil.getMessageString("maximum");
    public static final String TOTAL_NUMBERS = ResourceUtil.getMessageString("total.numbers");
    public static final String AVERAGE = ResourceUtil.getMessageString("average");

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
