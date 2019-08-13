package test.numbers;


import java.util.Scanner;

import static test.numbers.ApplicationNumbers.END_OF_APP;
import static test.numbers.ApplicationNumbers.SIGN_TOTAL_INFO;

/**
 * Main class. Entry point for Application.
 */
public class Start {

    public static void main(String[] args) {

        ApplicationNumbers application = new ApplicationNumbers();
//        application.start();

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter at one row a number, `Z` for finish or `=` to print total");
        boolean continueEnter = true;

        while (continueEnter) {
            // String input
            String name = myObj.nextLine();
            if (END_OF_APP.equals(name)) {
                continueEnter = false;
                application.calculation(name);

            } else if (SIGN_TOTAL_INFO.equalsIgnoreCase(name)) {
                application.printTotalInfo();
            } else {
                application.calculation(name);
            }
        }
        System.out.println("Application stopped.");

    }
}
