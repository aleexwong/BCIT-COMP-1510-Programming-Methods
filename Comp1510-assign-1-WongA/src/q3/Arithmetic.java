package q3;

import java.util.Scanner;
/**
 * prompt two numbers a and b and use arithmetic on them.
 * 
 * @author Wong, Alex a.wong555@bcit.ca.
 * @version 1.0
 */


public class Arithmetic {
    
    
    /**
     * run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        double num1;
        double num2;
        double num3;
        double num4;
        double num5;
        
        // Prompt
        
        Scanner scan = new Scanner(System.in);  
        System.out.println("Please enter two numbers:");
        System.out.println("First Number");
        num1 = scan.nextDouble();
        System.out.println("Second Number");
        num2 = scan.nextDouble();
        
        // Calculations 
        num3 = num1 / num2;
        num4 = num1 % num2;
        num5 = num3 * num2 + num4;
        
        System.out.println("a is " + num1 + " b is " + num2 + " q is " + num3 
                + " r is " + num4 + " (q*b + r) is " + num5);
        
       
        scan.close();

        
        
    }

}
