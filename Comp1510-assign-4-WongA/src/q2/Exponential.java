package q2;

/**
 * <p>
 * Exponentials for 21 exponentials range -10 - 10 1 value per row showing both
 * x and e^x using a for loop.
 * </p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Exponential {
    
    /**
     * constant.
     */
    private static double TEN = 10;
    
    /**
     * Exponential.
     * 
     * @param num number of double.
     * @return double number.
     */
    public static double exp(double num) {
        return num;
    }

    /**
     * Runs the program of Exponential.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        double n = Exponential.exp(-TEN);
        double i;
        double fact = 1.0;
        
        // double u = x * k;
        // double next = u * (x / (k + 1));

        for (n = -TEN; n <= TEN; n++) {
            //System.out.println(n);
            //double a = n * -1;
            double b = Math.pow(n, n);
            if (n < 0) {
                b = b * 1;
            }
            //System.out.println(n);
            System.out.println("x = " + b);
        }

        for (i = 1; i <= TEN; i++) {
            fact = fact * i;
            System.out.println(fact);
            System.out.println("k = " + i);
        }
        

        System.out.println("Question two was called and ran sucessfully.");
    }
}
