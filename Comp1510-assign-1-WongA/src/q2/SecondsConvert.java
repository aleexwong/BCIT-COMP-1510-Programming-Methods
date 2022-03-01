package q2;

import java.util.Scanner;

/**
 * Conversion 3 numbers representing hour minute seconds to seconds.
 * @author Wong, Alex a.wong555@bcit.ca.
 * @version 1.0
 */
public class SecondsConvert {
   
    /** Constant. */    
    public static final int HOURSINSECONDS = 3600;
    
    /** Constant. */    
    public static final int MINUTESINSECONDS = 60;
    
    /** Constant. */    
    public static final int SECONDS = 1;
    

    
    
    /**
     * Drives program.
     * @param args unused.
     */
    public static void main(String[] args) {
        int hours;
        int minutes;
        int seconds;
        
        Scanner scan = new Scanner(System.in);  
        System.out.println("Please enter the hours to convert");
        hours = scan.nextInt();
        hours = HOURSINSECONDS;
        
        System.out.println("Please enter the minutes to convert");
        minutes = scan.nextInt();
        minutes = minutes * MINUTESINSECONDS;

        System.out.println("Please enter the seconds to convert");
        seconds = scan.nextInt();
        
        System.out.println("The time you have entered is converts to " 
                            + (hours + minutes  + seconds) + " seconds");


        
        
        
        scan.close();

    }

}
