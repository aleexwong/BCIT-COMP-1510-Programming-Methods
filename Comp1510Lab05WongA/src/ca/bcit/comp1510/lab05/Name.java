/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * names.
 * 
 * @author Wong Alex a.wong555@bcit.ca.
 * @version Feb 11.2021
 */
public class Name {

    /** first name variable. */
    private String fName;

    /** middle name variable. */
    private String mName;

    /** last name. */
    private String lName;

    /**
     * Constructs a name first, middle, last name.
     * 
     * @param first  fName;
     * @param middle mName;
     * @param last   lName;
     */
    public Name(String first, String middle, String last) {
        fName = first;
        mName = middle;
        lName = last;

    }

    /**
     * name.
     * 
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * name.
     * 
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * name.
     * 
     * @return the mName
     */
    public String getmName() {
        return mName;
    }

    /**
     * name.
     * 
     * @param mName the mName to set
     */
    public void setmName(String mName) {
        this.mName = mName;
    }

    /**
     * name.
     * 
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * name.
     * 
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * returns.
     * 
     * @return the full name.
     */
    public String toString() {
        return fName + " " + mName + " " + lName;

    }

    /**
     * returns sum of names in int form.
     * 
     * 
     * @return the full name in a sum.
     */
    public int nameCount() {
        return fName.length() + mName.length() + lName.length();

    }

    /**
     * returns each name with first letter uppercase.
     * 
     * @return
     * 
     * 
     * @return the full name upper case first letter each name.
     */
    public String stringIntitialFirstLetterOfName() {
        return fName.substring(0, 1).toUpperCase() + fName.substring(1) 
                + mName.substring(0, 1).toUpperCase()
                + mName.substring(1) 
                + lName.substring(0, 1).toUpperCase() + lName.substring(1);

    }

    /**
     * Returns the nth character of this full name.
     * 
     * @param n is int
     * 
     * @return get nth char from chosen.
     */
    public char getNthChar(int n) {

        return toString().charAt(n - 1);

    }

    /**
     * Returns name ordered last name, first name then middle name.
     * 
     * @return fullName as a String
     */
    public String fullName() {

        return lName + ", " + fName + " " + mName;

    }

    /**
     * Returns true if str entered is same as fName.
     * 
     * @param str is String
     * @return isEquals boolean t/f
     */
    public boolean isEquals(String str) {
        
        return fName.equals(str);
        
    }

    /**
     * Returns true if this.name equals name for all 3 names.
     * 
     * @param name Name
     * @return isEqualtoNameObj as a boolean
     */
    public boolean isEqualstoName(Name name) {
        
        return this.fName.equals(name.getfName()) 
                && this.mName.equals(name.getmName())
                && this.lName.equals(name.getlName());
    }

}
