package q1;

import java.util.Scanner;

/**
 * Read prompt for fewest bill and coin to represent that amount.
 *
 * @author Wong, Alex a.wong555@bcit.ca.
 * @version 1.0 
 */
public class Change {
    
    /** Constant in pennies. */    
    public static final int TENDOLLARS = 1000;
    
    /** Constant in pennies. */    
    public static final int FIVEDOLLARS = 500; 
    
    /** Constant in pennies. */    
    public static final int TWODOLLARS = 200;

    /** Constant in pennies. */    
    public static final int ONEDOLLARS = 100;

    /** Constant in pennies. */    
    public static final int QUARTERS = 25;

    /** Constant in pennies. */    
    public static final int DIMES = 10;
    
    /** Constant in pennies. */    
    public static final int NICKELS = 5;

    /** Constant. */    
    public static final int PENNY = 1;


    
    
    /**
     * runs program.
     * @param args unused.
     */
    public static void main(String[] args) {
                
        Scanner scan = new Scanner(System.in);      
        System.out.println("Enter any amount for calculation");        
        double money = scan.nextDouble();
        
        
        //Conversion from money from dollars to cents
        int convertCents = (int) (money * ONEDOLLARS);
        
        // takes money prompt and breaks down to each bill/coin
        System.out.println((convertCents / TENDOLLARS) + " ten dollar bills");
        convertCents =  convertCents % TENDOLLARS;
        
        System.out.println((convertCents / FIVEDOLLARS) + " five dollar bills");
        convertCents =  convertCents % FIVEDOLLARS;
        
        System.out.println((convertCents / TWODOLLARS) + " toonies");
        convertCents =  convertCents % TWODOLLARS;
        
        System.out.println((convertCents / ONEDOLLARS) + " loonies");
        convertCents =  convertCents % ONEDOLLARS;
        
        System.out.println((convertCents / QUARTERS) + " quarters");
        convertCents =  convertCents % QUARTERS;
        
        System.out.println((convertCents / DIMES) + " dimes");
        convertCents =  convertCents % DIMES;
        
        System.out.println((convertCents / NICKELS) + " nickels");
        convertCents =  convertCents % NICKELS;
        
        System.out.println((convertCents / PENNY) + " pennies");
        convertCents =  convertCents % PENNY;
        
        
        scan.close();
        
        
    }

}
