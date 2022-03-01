package ca.bcit.comp1510.lab08;

import java.util.Scanner;

/**
 * Represent a valid Gregorian date on or after 24 February 1584
 * 
 * @author blink
 * @version 1.0
 */
public class Date {
    /** MIN DAY. */
    public static final int MINDAY = 1;
    
    /** MAX DAY. */
    public static final int MAXDAY = 31;
    
    /** MIN MONTH. */
    public static final int MINMONTH = 1;
    
    /** MAX MONTH. */
    public static final int MAXMONTH = 12;
    
    /** MIN YEAR. */
    public static final int MINYEAR = 1582;
    
    /** MAX YEAR. */
    public static final int MAXYEAR = 2999;
    
    /** constant. */
    public static final int FOUR = 4;
    
    /** constant. */
    public static final int HUNDRED = 100;
    
    /** constant. */
    public static final int FOUR_HUNDRED = 400;
    
    
    /** day of month. 1 .. max days in month */
    private int day;

    /** month of year. 1 .. 12 */
    private int month;

    /** year in Gregorian calendar. 1001 .. 2999 */
    private int year;
    
    /** Constructor for Date.
     * 
     * @param theDay day of month
     * @param theMonth month of year
     * @param theYear year of the century
     */
    public Date(int theDay, int theMonth, int theYear) {
        if (theDay >= MINDAY && theDay <= MAXDAY) {
            this.day = theDay;
        } else {
            throw new IllegalArgumentException("Date is larger " 
                    + " than 31 or less than 1");
        }
        if (theMonth >= MINMONTH && theMonth <= MAXMONTH) {
            this.month = theMonth;
        } else {
            throw new IllegalArgumentException("month is larger " 
        + " than 12 or less than 1");
        }

        if (theYear >= MINYEAR && theYear <= MAXYEAR) {
            this.year = theYear;
        } else {
            throw new IllegalArgumentException("year is larger " 
        + " than 2999 or less than 1582");
        }
        // fill this code in and only store a valid date.
        // throw exception if parameters are not a valid date
    }
    
    /** month of year. 1 to 12 
     * @return true or false
     * 
     *
     */
    public static boolean isMonthValid(int m) {
        if (m <= MAXMONTH && m > MINMONTH) {
            return true;
        } else {
            return false;
        }
    }
    
    /** is year valid true/false.
     
     * @returns boolean year is valid;
     */
    public static boolean isYearValid(int year) {
        if (year > MINYEAR && year <= MAXYEAR) {
            return true;
        } else {
            return false;
        }

    }
    
    /** logic for isLeapYear.
     * @returns boolean if leap or not.
     */
    public static boolean isLeapYear(int year) {
        if (year % FOUR != 0) {
            return false;
          } else if (year % HUNDRED == 0) {
            return false;
          } else if (year % FOUR_HUNDRED == 0) {
            return true;
          } else {
            return true;
          }
        }

    /** Sets day in month dependent on month.
     * @returns days of specific month;
     * 
     */
    public static int daysInMonth(int month, boolean isLeapYear) {
        switch (month) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
          return 31;
        case 2: 
          if (isLeapYear)
        return 29;
          else
            return 28;
        default:
          return 30;
        }
     }
    
    /** month of year. 1 .. 12 */
    public static boolean isDateValid(int day, int month, int year) {
        if ((day <= MAXDAY && day >= MINDAY)
                && (month <= MAXMONTH && month >= MINDAY)
                && (year <= MAXYEAR && year >= MINYEAR)) {
            if (isLeapYear(year) && month == 2 && day <= 29){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public String toString(){
        return month+" "+ day +" "+ year;  
       }
    
    /** month of year. 1 .. 12 */
    public static void main(String[] args) {
        // date read in from user
        int month, day, year;
        // true if parts of input from user is valid
        boolean monthValid, yearValid, dayValid;
        // number of days in month read in
        int daysInMonth;
        // true if user's year is a leap year
        boolean leapYear;

        Scanner scan = new Scanner(System.in);
        // Get integer month, day, and year from user
        System.out.println("Enter a month a day and a year to see " 
                + " if said date is a leap year!");
        System.out.println("Month please");
        month = scan.nextInt();
        System.out.println("Day please");
        day = scan.nextInt();
        System.out.println("Year please");
        year = scan.nextInt();
      
        // Use the methods to check to see if month is valid
        if (isMonthValid(month)) {
            monthValid = true;
        }
        // Use the methods to check to see if year is valid
        if (isYearValid(year)) {
            yearValid = true;
        }
        // Use the methods to determine whether it's a leap year
        if (isLeapYear(year)) {
            leapYear = true;
        }
        // Use the methods to determine number of days in month
        day = daysInMonth(month, isLeapYear(year));
        // Use the methods to see if day is valid
            
        // Use the methods to determine whether date is valid
        if (isDateValid(day, month, year)) {
            dayValid = true;
        }
        // and print appropriate message
        if (isDateValid(day, month , year)) {
            System.out.println("congrats its a Valid Date");
        }
        
        // Create a Date object with month, day, year
        Date date = new Date(day, month, year);
        System.out.println(date.toString() + " format day month year ");
    }
}

