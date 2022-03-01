package ca.bcit.comp1510.lab10;

/**
 * Class Name.
 * 
 * @author Wong Alex
 * @version April 8 2021.
 */
public class Name implements Comparable<Name> {

    /**
     * holds first name of name.
     */
    private String firstName;

    /**
     * holds the middle name.
     */
    private String middleName;

    /**
     * holds last name.
     */
    private String lastName;

    /**
     * Constructor for first middle last names.
     * 
     * @param fName String for first name
     * @param mName String for middle name
     * @param lName String for last name
     */
    public Name(String fName, String mName, String lName) {
        if (fName.trim().equals("") 
                || mName.trim().equals("") 
                || lName.trim().equals("")) {
            throw new IllegalArgumentException("all names can not " 
                + "be empty or empty space");
        }
        this.firstName = fName;
        this.middleName = mName;
        this.lastName = lName;

    }

    /**
     * Constructor for first and last name.
     * 
     * @param fName first name
     * @param lName last name
     */
    public Name(String fName, String lName) {
        if (fName.trim().equals("") || lName.trim().equals("")) {
            throw new IllegalArgumentException("first/last names can not " 
                    + "be empty or empty " 
                    + "space");
        }
        this.firstName = fName;
        this.middleName = null;
        this.lastName = lName;
    }

    /** Accessor for first name.
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /** Accessor for middle name.
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /** Accessor for last name.
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Comparing names.
     * returns -1 if same last name.
     * returns 0 if same first name.
     * returns 1 if same middle name.
     */
    @Override
    public int compareTo(Name compare) {
        if (this.lastName.equals(compare.lastName)) {
            return -1;
        } else if (this.firstName.equals(compare.firstName)) {
            return 0;
        } else if (this.middleName.equals(compare.middleName)) {
            return 1;
        } else {
            return 0;
        }

    }
}
