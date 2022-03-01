/**
 * 
 */

package ca.bcit.comp1510.lab04;

/** name.
 * @author Wong Alex a.wong555@bcit.ca.
 * @version Feb 11.2021
 */
public class Name {
    
    /** first name variable.*/    
    private String fName;
    
    /** middle name variable.*/
    private String mName;
    
    
    /** last name.*/
    private String lName;
    
    /**
     * Constructs a name first, middle, last name.
     * 
     * @param first fName;
     * @param middle mName;
     * @param last lName;
     */
    public Name(String first, String middle, String last) {
        fName = first;
        mName = middle;
        lName = last;
               
    }

    /** name.
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /** name.
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /** name.
     * @return the mName
     */
    public String getmName() {
        return mName;
    }

    /** name.
     * @param mName the mName to set
     */
    public void setmName(String mName) {
        this.mName = mName;
    }

    /** name.
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /** name.
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }
    
    /** returns.
     *  
     * @return the full name.
     */
    public String toString() {
        return fName + " " + mName + " " + lName;
    
        
    }
}


