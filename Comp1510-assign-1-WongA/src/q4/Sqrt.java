package q4;

import java.util.Scanner;

/**
 * prompts for and reads a double value, a, calculates
 * an approximation to the square root 10 estimates.
 * 
 * @author Wong, Alex a.wong555@bcit.ca.
 * @version 1.0
 */
public class Sqrt {
    /**
     * run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        // User input number
        double num1;
        
        // sNum holds the square root;
        double sNum;
        
        Scanner scan = new Scanner(System.in);  
        System.out.println("Please enter a number to square root");
        num1 = scan.nextDouble();
        
        // Estimates 1
        sNum = (num1 + 1) / 2;
        System.out.println(sNum);
        
        // Estimate 2 - 10 Each following estimate should be s = (s + a / s) /2.
        sNum = (sNum + num1 / sNum) / 2;
        System.out.println(sNum);       
        sNum = (sNum + num1 / sNum) / 2;
        System.out.println(sNum);
        sNum = (sNum + num1 / sNum) / 2;
        System.out.println(sNum);
        sNum = (sNum + num1 / sNum) / 2;
        System.out.println(sNum);
        sNum = (sNum + num1 / sNum) / 2;
        System.out.println(sNum);
        sNum = (sNum + num1 / sNum) / 2;
        System.out.println(sNum);
        sNum = (sNum + num1 / sNum) / 2;
        System.out.println(sNum);
        sNum = (sNum + num1 / sNum) / 2;
        System.out.println(sNum);
        sNum = (sNum + num1 / sNum) / 2;
        System.out.println(sNum);
        
        
        
       
        scan.close();

        
        
    }

}
