/**
 * 
 */

package q2;

import java.util.Scanner;

/**
 * Driver.
 * @author Wong, Alex a.wong555@bcit.ca
 * @version 1.0
 */
public class Blow {

    /** Drives program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Balloon balloon = new Balloon();
        System.out.println("Enter how much to inflate the balloon by radius");
        
        double amount;        
        amount = scan.nextDouble();
        
        balloon.inflate(amount);
        balloon.getVolume();
        
        System.out.println("Balloon inflates by " + amount 
                            + " Balloon Volume is " + balloon.getVolume());
        scan.close();
        
        
        
        
    }

}
