/**
 * 
 */

package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
 * @author Wong, Alex a.wong555@bcit.ca.
 * @version 01-25-2021
 *
 */
public class Circle {
    /** PI value defined.*/
    
    public static final double PI = 3.14159;
    
    
    /**
     * Calculates Circle based on value given by user.
     * @param args unused
     */
    public static void main(String[] args) {
        double radius = 0;
        double circumference;
        double area;
        double doubleRadius;
        double newCircumference;
        double newArea;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Please Enter the radius value of the Circle");
        
        radius = myScanner.nextDouble();
        
        // Calculates the circumference of the Circle
        circumference = radius * 2 * PI;
        System.out.println("The circumference of the Circle from the value is " 
                            + circumference);
        
        area = radius * PI * PI;
        System.out.println("The area of the Circle from the value" + " is "
                            + area);
        /*
         *Let’s have some fun. 
         *Suppose we double the radius. 
         *
         *What happens to the area, does it also double? 
         * area becomes 4 times larger.
         *What about the circumference, does it double?
         * circumference does double.
         */
        // modify program enter value of radius to doubleRadius
        doubleRadius =  radius * 2;
        System.out.println("The doubleRadius of the circle from the value"
                            + " is " + doubleRadius);
        
        newCircumference = doubleRadius * 2 * PI;
        System.out.println("Using doubleRadius our new Circumference is " 
                            + newCircumference);
        
        newArea = doubleRadius * PI * PI;
        System.out.println("Using doubleRadius our new Area is " 
                            + newArea);
        
        myScanner.close();
  

    }

}
