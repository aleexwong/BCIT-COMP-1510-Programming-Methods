/**
 * 
 */

package ca.bcit.comp1510.lab05;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Geometry Drives.
 * 
 * @author Wong Alex a.wong555@bcit.ca.
 * @version Feb 11.2021
 */
public class GeometryDriver {

    /**
     * Drives program.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        DecimalFormat decFmt = new DecimalFormat(".###");
        
        System.out.println("Please enter the X-coordinate, " 
                + " Y-coordinate, Z-coordinate, "
                + " and radius of the Sphere. 65");
        
        Sphere sphere = new Sphere(scan.nextDouble(), scan.nextDouble(), 
                                   scan.nextDouble(), scan.nextDouble());
        
        System.out.println("Using the Sphere coordations surface area is "
                            + decFmt.format(sphere.calculateSA()));
        System.out.println("Using the Sphere coordations volume is "
                + decFmt.format(sphere.calculateVolume()));
        
        System.out.println("Please enter the X-coordinate, " 
                + " Y-coordinate, Z-coordinate, "
                + " and edge length of the Cube.");
        
        Cube cube = new Cube(scan.nextDouble(), scan.nextDouble(), 
                scan.nextDouble(), scan.nextDouble());

        System.out.println("Using the cube coordations surface area is " 
                + decFmt.format(cube.calculateSA()));
        System.out.println("Using the cube coordations volume is " 
                + decFmt.format(cube.calculateVolume()));
        System.out.println("Using the cube coordations face diagonal is " 
                + decFmt.format(cube.calculateFaceDiagonal()));
        System.out.println("Using the cube coordations space diagonal is " 
                + decFmt.format(cube.calculateSpaceDiagonal()));
        
        System.out.println("enter height and radius of the cone please");
        Cone cone = new Cone(scan.nextDouble(), scan.nextDouble());
        System.out.println("Using the cone volume is " 
                + decFmt.format(cone.calculateVolume()));
        System.out.println("Using the cone Slant height is " 
                + decFmt.format(cone.calculateSlantHeight()));
        System.out.println("Using the cone SA is " 
                + decFmt.format(cone.calculateSurfaceArea()));

        NumberFormat nFormat = NumberFormat.getInstance();
        
        final int decimals = 3;
        nFormat.setMaximumFractionDigits(decimals);
        System.out.println("enter new radius and height");
        Cone cone2 = new Cone(scan.nextDouble(), scan.nextDouble());
        System.out.println("Using the cone volume is " 
                + nFormat.format(cone2.calculateVolume()));
        System.out.println("Using the cone Slant height is " 
                + nFormat.format(cone2.calculateSlantHeight()));
        System.out.println("Using the cone SA is " 
                + nFormat.format(cone2.calculateSurfaceArea()));
        
        
        
        
        scan.close();
        

    }

}
