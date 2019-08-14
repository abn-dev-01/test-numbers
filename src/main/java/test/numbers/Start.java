package test.numbers;


import java.util.Scanner;

import static java.lang.System.out;

/**
 * This is a console application. It prints and get all data from the console. Information are supposed to be typed by
 * a user of the application. The user can type any numbers, character Z or z, and sign =.
 * <p>
 * Numbers - it is possible enter double numbers or integer.
 * Z or z - use it to finish the application.
 * Sign = - enter it when you wanna see
 * 1) the smallest number it has encountered so far
 * 2) the largest number it has encountered so far
 * 3) the average of all numbers it has encountered so far</pre>
 * <p>
 * This class is a Main class in the Application. It is Entry point for it. Run it.
 */
public class Start {

    private static final String END_OF_APP = "Z";
    private static final String SIGN_TOTAL_INFO = "=";

    public static void main(String[] args) {

        ApplicationNumbers application = new ApplicationNumbers();
        ApplicationNumbersPrint print = new ApplicationNumbersPrint(application);

        Scanner myObj = new Scanner(System.in);

        out.println(ResourceUtil.getMessageString("prompt.label"));
        boolean continueEnter = true;

        while (continueEnter) {
            // String input
            String name = myObj.nextLine();
            if (END_OF_APP.equalsIgnoreCase(name)) {
                continueEnter = false;
                application.calculation(name);
                print.printTotalInfo();

            } else if (SIGN_TOTAL_INFO.equalsIgnoreCase(name)) {
                print.printTotalInfo();
            } else {
                application.calculation(name);
            }
        }
        out.println(ResourceUtil.getMessageString("application.stopped"));

    }
}
