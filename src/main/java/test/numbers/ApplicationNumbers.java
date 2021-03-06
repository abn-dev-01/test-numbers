package test.numbers;

import java.util.ResourceBundle;

public class ApplicationNumbers {

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

    public double getAverage() {
        return (count > 0 ? sum / count : 0.0D);
    }

    public void calculation(String input) {
        try {
            double parsedNumber = Double.parseDouble(input);
            updateMinimum(parsedNumber);
            updateMaximum(parsedNumber);
            updateAverage(parsedNumber);
        } catch (NumberFormatException e) {
            System.out.println(ResourceUtil.getResourceBundle().getString("incorrect.value"));
        }
    }

    /**
     * This method have to be invoked last, after the updating minimum & maximum.
     *
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

}
