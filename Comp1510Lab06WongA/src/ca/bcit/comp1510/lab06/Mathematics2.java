/**
 * 
 */
package ca.bcit.comp1510.lab06;

import java.util.Random;

/**
 * @author Wong Alex a.wong555@bcit.ca.
 * @version Feb 11.2021
 */
public class Mathematics2 {
    // taken from google feet to km
    public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;
    
    
    /**
     * Returns the area of the square with the specified edge length. 5 of 6
     *
     * @param edgeLength of the square.
     * @return area as a double
     */
    public double getSquareArea(double edgeLength) {
        return edgeLength * edgeLength;
    }

    /**
     * Returns the sum of the specified values.
     *
     * @param first  operand
     * @param second operand
     * @return sum of the operands
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Returns the product of the specified values.
     *
     * @param first  operand
     * @param second operand
     * @return product of the operands
     */
    public double multiply(double first, double second) {
        return first * second;
    }

    /**
     * Returns the difference of the specified values.
     *
     * @param first  operand
     * @param second operand
     * @return difference of the operands
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Returns the quotient of the specified values. If the divisor is zero, returns
     * zero instead of NaN or infinity.
     *
     * @param first  operand
     * @param second operand
     * @return quotient of the operands
     */
    public double divide(double first, double second) {
        if (second == 0) {
            return 0;
        } else {
            return first / second;
        }
    }

    /**
     * Returns the absolute value of the specified integer.
     *
     * @param number 6 of 6 to test
     * @return absolute value of number
     */
    public int absoluteValue(int number) {
        if (number > 0) {
            return number;
        } else {
            return -number;
        }
    }
    

    /**
     * Converts the specified number of feet to kilometres.
     * 
     * @param feet to convert
     * @return kilometres in the specified number of feet
     */
    public double convertFeetToKilometres(double feet) {
        return feet * FOOT_TO_KILOMETRE_RATIO;

    }

    /**
     * Returns the sum of the numbers between zero and the first parameter that are
     * divisible by the second number. For example, sumOfProducts(10, 3) will return
     * 3 + 6 + 9 = 18, and sumOfProducts(10, 2) will return 2 + 4 + 6 + 8 + 10 = 30
     * and sumOfProducts(-10, 2) will return -2 + -4 + -6 + -8 + -10 = -30.
     * 
     * @param bound   the upper bound
     * @param divisor the divisor
     * @return sum
     */
    public int sumOfProducts(int bound, int divisor) {
        int i = 0;
        int total = 0;
        if (bound > 0) {
            while (i <= bound) {
                total += i;
                i = i + divisor;
            }
        } else {
            while (i >= bound) {
                total += i;
                i = i - divisor;
            }
        }
        return total;
    } 

    /**
     * Returns a random number between 10 and 20 inclusive, but NOT 15.
     * 
     * @return random number in range [10, 20] excluding 15.
     */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        
        final int not15 = 15;
        int result = not15;
        
        Random generator = new Random();        
        final int ten = 10;
        // 0 - 10 range add to base 10 e.g 10 + 0 = 10;
        final int totalnumber = 11;
        
        // continue looping until result is not 15
        while (result == not15) {
            result = generator.nextInt(totalnumber) + ten;
        }
        
        return result;
    }

}
