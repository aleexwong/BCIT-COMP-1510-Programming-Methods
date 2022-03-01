/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * Rolling Dices.
 * @author Wong, Alex a.wong555@bcit.ca.
 * @version 01-25-2021
 */
public class Dice {
    
    /** Constant. */    
    public static final int FOUR = 4;
    
    /** Constant. */
    public static final int SIX = 6;
   
    /** Constant. */
    public static final int EIGHT = 8;
    
    /** Constant. */
    public static final int TEN = 10;
    
    /** Constant. */
    public static final int TWELVE = 12;
    
    /** Constant. */
    public static final int TWENTY = 20;


    
    
    /**
     * Stimulates dice rolls.
     * @param args unused
     */
    
    public static void main(String[] args) {
        Random generator = new Random();
        int dieSide4 = generator.nextInt(FOUR) + 1;
        int dieSide6 = generator.nextInt(SIX) + 1;
        int dieSide8 = generator.nextInt(EIGHT) + 1;
        int dieSide10 = generator.nextInt(TEN) + 1;
        int dieSide12 = generator.nextInt(TWELVE) + 1;
        int dieSide20 = generator.nextInt(TWENTY) + 1;
        
        System.out.println("4-sided die: " + dieSide4);
        System.out.println("6-sided die: " + dieSide6);
        System.out.println("8-sided die: " + dieSide8);
        System.out.println("10-sided die: " + dieSide10);
        System.out.println("12-sided die: " + dieSide12);
        System.out.println("20-sided die: " + dieSide20);
        
        System.out.println("Total rolled is " + (dieSide4 + dieSide6 + dieSide8 
                            + dieSide10 + dieSide12 + dieSide20));
         
    }

}
