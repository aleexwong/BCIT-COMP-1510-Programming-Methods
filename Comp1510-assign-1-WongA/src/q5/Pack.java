package q5;

import java.util.Scanner;

/**
 * decodes and encodes. 
 * @author Wong, Alex a.wong555@bcit.ca.
 * @version 1.0
 */
public class Pack {    
    /** Constant. */    
    public static final int BASE56 = 56;
    
    /** Constant. */    
    public static final int ZERO = 0;
    
    /** Constant. */    
    public static final int ONE = 1;
    
    /** Constant. */    
    public static final int TWO = 2;
    
    /** Constant. */    
    public static final int THREE = 3;
    
    /** Constant. */    
    public static final int FOUR = 4;


    
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        String input = "IFEBA";
        int n = input.length();
        System.out.println(n);        
        Scanner scan = new Scanner(System.in);  
                
        char c1 = input.charAt(ZERO);
        char c2 = input.charAt(ONE);
        char c3 = input.charAt(TWO);  
        char c4 = input.charAt(THREE);  
        char c5 = input.charAt(FOUR);  
        
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);
//        System.out.println(c4);
//        System.out.println(c5);
        
        // char to MIX numbers
        int num1 = c1 - 'A' + 1;
        int num2 = c2 - 'A' + 1;
        int num3 = c3 - 'A' + 1;
        int num4 = c4 - 'A' + 1;
        int num5 = c5 - 'A' + 1;
          
        int encoded = num1 * BASE56 * BASE56 * BASE56 * BASE56
                + num2 * BASE56 * BASE56 * BASE56 
                + num3 * BASE56 * BASE56
                + num4 * BASE56
                + num5;
        System.out.println("The Five Encoded Characters is: " + encoded);
               
        int decode1 = encoded / (BASE56 * BASE56 * BASE56 * BASE56);
        encoded = encoded % (BASE56 * BASE56 * BASE56 * BASE56);
        int decode2 = encoded / (BASE56 * BASE56 * BASE56);
        encoded = encoded % (BASE56 * BASE56 * BASE56);
        int decode3 = encoded / (BASE56 * BASE56);
        encoded = encoded % (BASE56 * BASE56);
        int decode4 = encoded / (BASE56);
        encoded = encoded % (BASE56);
        int decode5 = encoded;
        
        
        char dec1 = (char) (decode1 - 1 + 'A');
        char dec2 = (char) (decode2 - 1 + 'A');
        char dec3 = (char) (decode3 - 1 + 'A');
        char dec4 = (char) (decode4 - 1 + 'A');
        char dec5 = (char) (decode5 - 1 + 'A');
        
        System.out.println("The Five Decoded Characters is: " 
                     + dec1 + dec2 + dec3 + dec4 + dec5);
        
        
        scan.close();

    }

}
