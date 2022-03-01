/**
 * 
 */

package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/** 
 * @author Wong, Alex a.wong555@bcit.ca.
 * @version 01-25-2021
 */
public class Paint {

    /** Coverage per can. */
    public static final double COVERAGE = 400;
    
    /** Sides of a room. */
    public static final int TOTALSIDESOFROOM = 4;
    
    /**
     * Determines how much paint is needed.
     * @param args unused
     */
    public static void main(String[] args) {
        
        double length;
        double width;
        double height;
        double coats;
        double surfaceArea;
        double coverageNeeded;
        double cansOfPaintNeeded;
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the length of the room");
        length = myScanner.nextDouble();
        
        System.out.println("Please enter the width of the room");
        width = myScanner.nextDouble();
        
        System.out.println("Please enter the height of the room");
        height = myScanner.nextDouble();
        
        System.out.println("Please enter the number of coats of the room");
        coats = myScanner.nextDouble();
        
        surfaceArea = ((TOTALSIDESOFROOM * (length * width)) 
                + (length * height));
        
        coverageNeeded = coats * surfaceArea;
        
        cansOfPaintNeeded = coverageNeeded / COVERAGE;
        
        System.out.println("Number of Coats Needed " 
                + Math.ceil(cansOfPaintNeeded));
        
        myScanner.close();
        
        
        
    }

}
