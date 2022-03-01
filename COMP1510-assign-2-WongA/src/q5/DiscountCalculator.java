package q5;

import java.util.Scanner;

/**
 * <p>
 * calculates the discount that can be given to customers using amount of cheese
 * bought and how many customers referred.
 * </p>
 *
 * @author Wong, Alex a.wong555@bcit.ca
 * @version 1.0 
 */
public class DiscountCalculator {

    /** Constant. */
    public static final int MAXDISCOUNT = 75;

    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        System.out.println("Enter how many cheeses the customers bought" 
                            + " and each referal customer = 1% off");
        int cheese;
        int customers;
        int total;

        Scanner scan = new Scanner(System.in);
        cheese = scan.nextInt();
        customers = scan.nextInt();

        total = cheese + customers;

        if (total > MAXDISCOUNT) {
            total = MAXDISCOUNT;
            System.out.println("MAX DISCOUNT REACHED 75% OFF ONLY");

        } else {
            final int totals = total;
            total = totals;
            System.out.println("YOUR DISCOUNT IS " + total + "%");

        }

        scan.close();

        System.out.println("Question five was called and ran sucessfully.");
    }

}
