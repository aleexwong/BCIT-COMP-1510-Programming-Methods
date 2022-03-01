package q1;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.ArrayList;

/**
 * <p>
 * This is where you put your description about what this class does. You don't
 * have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 * </p>
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Timesheet {

    /**
     * Holds the employee number as a String Variable.
     */
    private String empNum;

    /**
     * must be a friday.
     */
    private LocalDate endWeek;

    /**
     *  set day to friday.
     */
    private DayOfWeek day = DayOfWeek.FRIDAY;

    /**
     * create timesheetrow arraylist.
     */
    private ArrayList<TimesheetRow> timeSheetRowList;
    
    /**
     * no args constructor.
     */
    public Timesheet() {
        String empNum;
        LocalDate endWeek = LocalDate.now().with(day);
    }
    
    
    
    

    /** gets employee number.
     * @return the empNum
     */
    public String getEmpNum() {
        return empNum;
    }

    /** set emp number String.
     * @param empNum the empNum to set
     */
    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    /** gets endweek.
     * @return the endWeek
     */
    public LocalDate getEndWeek() {
         
        return endWeek;
    }

    /** set end of week.
     * @param endWeek the endWeek to set
     */
    public void setEndWeek(LocalDate endWeek) {
        this.endWeek = endWeek;
    }

    /**
     * mutator for get day.
     * @return the day
     */
    public DayOfWeek getDay() {
        return day;
    }

    /** set day.
     * @param day the day to set
     */
    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    /** return arraylist.
     * @return the timeSheetRowList
     */
    public ArrayList<TimesheetRow> getTimeSheetRowList() {
        return timeSheetRowList;
    }

    /** set arraylist.
     * @param timeSheetRowList the timeSheetRowList to set
     */
    public void setTimeSheetRowList(ArrayList<TimesheetRow> timeSheetRowList) {
        this.timeSheetRowList = timeSheetRowList;
    }


    /** add row.
     * @param row adds row to TimesheetRow
     */
    public void addRow(TimesheetRow row) {
    }

    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // replace next line with your code:
        System.out.println("Question one was called and ran sucessfully.");
    }
}
