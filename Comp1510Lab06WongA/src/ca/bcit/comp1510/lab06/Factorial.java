/**
 * 
 */
package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * @author Wong Alex a.wong555@bcit.ca.
 * @version Mar 4.2021
 */
public class Factorial {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        int number;
        long factorial = 1;
        int num = 1;

        System.out.println("Enter a number for the factorial.");

        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            System.out.println("Input is not a number. try again");
            scan.nextLine();
        }

        number = scan.nextInt();

        while (number <= 0) {

            if (number <= 0) {

                System.out.println("please do not enter negative or zero numbers");

            }
            number = scan.nextInt();

        }
        while (num <= number) {

            factorial = factorial * num;
            num++;
        }

        System.out.println(factorial);

        scan.close();

    }
}
