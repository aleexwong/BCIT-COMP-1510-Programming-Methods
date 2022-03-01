package ca.bcit.comp1510.lab11;

/**
 * Adds numbers from command line arguments calculates the average from the
 * number of arguments.
 * 
 * @author Alex Wong a.wong555@bcit.ca
 * @version 1.0
 */
public class Average {
    /**
     * Command line arguments passing averages.
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        double sum = 0.0;

        while (args.length != i && args[i] != null) {
            System.out.println(args[i]);

            try {
                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("the number is not an integer.");
                j++;
            }

            i++;

        }
        if (i == 0) {
            System.out.println("No arguments");
        } else if (i - j == 0) {
            System.out.println("Can not divide by zero!");
        } else {
            System.out.println("Average is " + sum / (i - j));
        }

    }

}
