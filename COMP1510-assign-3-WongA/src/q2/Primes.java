package q2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 
 * Returns the prime numbers.
 *
 * @author Wong Alex a.wong555@bcit.ca.
 * @version 1.0
 */
public class Primes {

    /** Hold the primes boolean ArrayList. */
    private static ArrayList<Boolean> primes = new ArrayList<Boolean>();

    /**
     * Prime with bounded by user.
     * 
     * @param n a string for word
     */
    public Primes(int n) {
        for (int i = 0; i <= n; i++) {
            primes.add(true);
        }
        calculatePrimes(n);

    }

    /**
     * Calculate which number is a prime between 0 to n.
     * 
     * @param n upper bound.
     */
    private static void calculatePrimes(int n) {
        primes.set(0, false);
        primes.set(1, false);

        /*
         * His method, called the Sieve of Eratosthenes, works like this: 
         * 1. Make a list
         * of numbers: 0, 1, 2, 3, ..., N 
         * 2. 0 is not prime, so cross it out 
         * 3. 1 is not
         * prime, so cross it out 
         * 4. 2 is prime, but its multiples are not prime, so
         * cross out 4, 6, 8, 10, ... 
         * 5. 3 is prime, but its multiples are not prime, so
         * cross out 6, 9, 12, 15, ... 
         * 6. (4 is crossed out so next is 5) 5 is prime,
         * but its multiples are not primes, so cross out 10, 15, 20, 25, ...
         */

        // start at 2 if sqrt 2
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes.get(i)) {
                for (int p = i + i; p <= n; p += i) {
                    primes.set(p, false);
                }
            }
        }

    }

    /**
     * Prints all the primes.
     * 
     */
    private void printPrimes() {

        System.out.println("The prime numbers between 0 and " 
                + (primes.size() - 1) + " are: ");

        for (int i = 0; i < primes.size(); i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }

        }
        System.out.println("");

    }

    /**
     * Calculate how many primes in ArrayList.
     * 
     * @return representing the number of primes in the range [0, N]
     */
    private int countPrimes() {
        int count = 0;

        for (Boolean temp : primes) {
            if (temp) {
                count++;
            }
        }
        return count;
    }

    /**
     * Checks if a number is a prime.
     * @param x is the prime
     * 
     * @return boolean if the number 
     *      is a prime which returns true if x is prime and
     *      false if it is not. The parameter must be in the range [0, N]
     *      
     * @throws ArrayIndexOutOfBoundsException if the number outside the range
     */
    private boolean isPrime(int x) throws ArrayIndexOutOfBoundsException {
        if (x < 0 || x > primes.size()) {
            throw new ArrayIndexOutOfBoundsException(
                    "The input for isPrime " 
            + "method should be between 0 and " 
            + (primes.size() - 1) + ".");
        }

        return primes.get(x);

    }

    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan;
        boolean stop = false;
        System.out.println("This program uses the sieve of Eratosthenes to " 
                + " determine which numbers are prime");

        while (!stop) {
            scan = new Scanner(System.in);

            System.out.println("Enter an upper bound:");

            try {

                int n = scan.nextInt();
                if (n > 1) {
                    Primes primesList = new Primes(n);
                    System.out.println("There are " 
                            + primesList.countPrimes() + " primes.");

                    primesList.printPrimes();

                    scan.close();

                    stop = true;

                } else {

                    System.out.println("Wrong input, should be " 
                            + "greater than 1");
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Wrong input, should be " 
                        + "greater than 1.");

            } catch (InputMismatchException e) {
                System.out.println("Wrong input, should be " 
                        + "greater than 1");
            }

        }

        System.out.println("Question two was called and ran sucessfully.");

    }

}
