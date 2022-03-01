package q1;

import java.util.Scanner;

/**
 * Reads String given containing 10 digit phone number and converts to proper
 * dashes and parentheses.
 *
 * @author Wong, Alex a.wong555@bcit.ca
 * @version 1.0
 */
public class PhoneNumbers {

    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        final int three = 3;
        final int six = 6;
        final int ten = 10;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a 10 digit number e.g. 6044127509");

        String number = scan.next();

        System.out.println("(" + number.substring(0, three) + ")" 
                + number.substring(three, six) + "-"
                + number.substring(six, ten));

        scan.close();

    }

}
