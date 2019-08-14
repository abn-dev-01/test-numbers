package test.numbers;

import java.util.Scanner;

public class ApplicationNumbers {

    public static final String END_OF_APP = "Z";
    public static final String SIGN_TOTAL_INFO = "=";

    private double minimum = 0.0D;
    private double maximum = 0.0D;
    private int count = 0;
    private double sum = 0.0D;

    public double getMinimum() {
        return minimum;
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    public double getMaximum() {
        return maximum;
    }

    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void calculation(String input) {
        try {
            double parsedNumber = Double.parseDouble(input);
            updateMinimum(parsedNumber);
            updateMaximum(parsedNumber);
            updateAverage(parsedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect value! Allowed only number, character `Z` or `=`.");
        }
    }

    /**
     * This method have to be onvoked last after update minimum & maximum.
     * @param parsedNumber
     */
    protected void updateAverage(double parsedNumber) {
        count++;
        sum += parsedNumber;
    }

    protected void updateMaximum(double parsedNumber) {
        if (count == 0) {
            maximum = parsedNumber;
        } else if (parsedNumber > maximum) {
            maximum = parsedNumber;
        }
    }

    protected void updateMinimum(double parsedNumber) {
        if (count == 0) {
            minimum = parsedNumber;
        } else if (parsedNumber < minimum) {
            minimum = parsedNumber;
        }
    }

    public void printTotalInfo() {
        System.out.println("Minimum ...... : " + minimum);
        System.out.println("Maximum ...... : " + maximum);
        System.out.println("Total numbers  : " + count);
        System.out.println("Average ...... : " + (count > 0 ? sum / count : 0.0D));
    }
}
