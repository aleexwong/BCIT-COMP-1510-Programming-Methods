package q1;

/**
 * <p>
 * This is where you put your description about what this class does. You don't
 * have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 * </p>
 *
 * @author Alex Wong
 * @version 1.0
 */
public class TimesheetRow {
    
    /**
     * Mask.
     */
    private static final long[] MASK = {0xFFL, 0xFF00L, 0xFF0000L, 0xFF000000L,
        0xFF00000000L, 0xFF0000000000L,
        0xFF000000000000L };

    /**
     * Unmasked.
     */
    private static final long[] UMASK = {0xFFFFFFFFFFFFFF00L, 
        0xFFFFFFFFFFFF00FFL, 0xFFFFFFFFFF00FFFFL,
        0xFFFFFFFF00FFFFFFL, 0xFFFFFF00FFFFFFFFL, 
        0xFFFF00FFFFFFFFFFL, 0xFF00FFFFFFFFFFFFL };
    
    /**
     * int project number.
     */
    private int project;

    /**
     * String rep of package.
     */
    private String workPackage;

    /**
     * hours worked.
     */
    private long hours;


    // two constructors

    /**
     * Constructor for timesheetRow.
     */
    public TimesheetRow() {
        // no args takes
    }
    

    /**
     * Consturctor using 2 fields from Timesheet.
     * @param empNum from Timesheet
     * @param endWeek from Timesheet
     */
    public TimesheetRow(Timesheet empNum, Timesheet endWeek) {
        // no args takes
    }
    
    


    /** get project.
     * @return the project
     */
    public int getProject() {
        return project;
    }


    /** set project.
     * @param project the project to set
     */
    public void setProject(int project) {
        this.project = project;
    }


    /** get work.
     * @return the workPackage
     */
    public String getWorkPackage() {
        return workPackage;
    }


    /** set package.
     * @param workPackage the workPackage to set
     */
    public void setWorkPackage(String workPackage) {
        this.workPackage = workPackage;
    }


    /** get hours.
     * @return the hours
     */
    public long getHours() {
        return hours;
    }


    /** set hours.
     * @param hours the hours to set
     */
    public void setHours(long hours) {
        this.hours = hours;
    }

}
