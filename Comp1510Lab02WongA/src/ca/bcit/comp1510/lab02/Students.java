/**
 * 
 */

package ca.bcit.comp1510.lab02;

/**
 * @author Wong, Alex a.wong555@bcit.ca.
 * @version 01-25-2021
 */
public class Students {

    /** Constant. */
    public static final int LAB1 = 43;
    
    /** Constant. */

    public static final int LAB2 = 50;
    
    /** Constant. */
    public static final int LAB3 = 39;
    
    /** Constant. */
    public static final int LAB4 = 87;
    
    /** Constant. */
    public static final int LAB5 = 99;
    
    /** Constant. */
    public static final int BONUS1 = 7;
    
    /** Constant. */
    public static final int BONUS2 = 8;
    
    /** Constant. */
    public static final int BONUS3 = 10;
    
    /** Constant. */
    public static final int BONUS4 = 6;
    
    /** Constant. */
    public static final int BONUS5 = 0;
    
    /**
     * format student points.
     * @param args unused
     */
    public static void main(String[] args) {
        int total;
        
        System.out.println("///////////////////"
                + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 
                            + "///////////////////");
        System.out.println("Name  Lab   Bonus Total");
        System.out.println("----  ---   ----- -----");
        
        total = LAB1 + BONUS1;
        System.out.println("Joe   " + LAB1 + "    " + BONUS1 
                           + "     " + total);
        
        total = LAB2 + BONUS2;
        System.out.println("William     " + LAB2 + "    " 
                            + BONUS2 + "     " + total);
        
        total = LAB3 + BONUS3;
        System.out.println("Mary Sue    " + LAB3 + "    " 
                            + BONUS3 + "    " + total);
        
        total = LAB4 + BONUS4;
        System.out.println("Peng  " + LAB4 + "    " + BONUS4 
                + "     " + total);
        
        total = LAB5 + BONUS5;
        System.out.println("Kwon  " + LAB5 + "    " + BONUS5 
                + "     " + total);

    }

}
