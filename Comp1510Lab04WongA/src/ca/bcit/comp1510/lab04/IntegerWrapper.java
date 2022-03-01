/**
 * 
 */

package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * Int Wrapper.
 * 
 * @author Wong Alex a.wong555@bcit.ca.
 * @version Feb 11.2021
 */
public class IntegerWrapper {

    /**
     * Drives program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a int number");

        int input = scan.nextInt();

        System.out.println("Number entered " + input);

        // conversion
        System.out.println("Input value to binary " 
                + Integer.toBinaryString(input));
        System.out.println("Input value to octal " 
                + Integer.toOctalString(input));
        System.out.println("Input value to hexadecmial " 
                + Integer.toHexString(input));

        // max & mins values
        System.out.println("The maximum java integer value is " 
                + Integer.MAX_VALUE);

        System.out.println("The minimum java integer value is " 
                + Integer.MIN_VALUE);

        // p3
        System.out.println("Enter two integers");

        System.out.println("First integer");
        String num1 = scan.next();

        System.out.println("Second integer");
        String num2 = scan.next();

        System.out.println("Converted to string the numbers are " 
        + (Integer.parseInt(num1) + Integer.parseInt(num2)));

        scan.close();
    }

}
