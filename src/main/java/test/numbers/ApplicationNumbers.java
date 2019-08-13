package test.numbers;

import java.util.Scanner;

public class ApplicationNumbers {

    public static final String END_OF_APP = "Z";
    public static final String SIGN_TOTAL_INFO = "=";

    private double minimum = 0.0D;
    private double maximum = 0.0D;
    private int count = 0;
    private double sum = 0.0D;

//    public void start() {
//        Scanner myObj = new Scanner(System.in);
//
//        System.out.println("Enter at one row a number, `Z` for finish or `=` to print total");
//        boolean continueEnter = true;
//
//        while (continueEnter) {
//            // String input
//            String name = myObj.nextLine();
//            if (END_OF_APP.equals(name)) {
//                continueEnter = false;
//                calculation(name);
//
//            } else if (SIGN_TOTAL_INFO.equalsIgnoreCase(name)) {
//                printTotalInfo();
//            } else {
//                calculation(name);
//            }
//        }
//        System.out.println("Application stopped.");
//    }

    public void calculation(String input) {
        double parsedNumber = Double.parseDouble(input);
        updateMinimum(parsedNumber);
        updateMaximum(parsedNumber);
        updateAverage(parsedNumber);
    }

    protected void updateAverage(double parsedNumber) {
        count++;
        sum += parsedNumber;
    }

    protected void updateMaximum(double parsedNumber) {
        if (parsedNumber > maximum) {
            maximum = parsedNumber;
        }
    }

    protected void updateMinimum(double parsedNumber) {
        if (parsedNumber < minimum) {
            minimum = parsedNumber;
        }
    }

    public void printTotalInfo() {
        System.out.println("Minimum .... : " + minimum);
        System.out.println("Maximum .... : " + maximum);
        System.out.println("Average .... : " + (count > 0 ? sum / count : 0.0D));
    }
}
