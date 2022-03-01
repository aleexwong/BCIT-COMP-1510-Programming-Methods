/**
 * 
 */

package ca.bcit.comp1510.lab04;

/**
 * student details.
 * 
 * @author Wong Alex a.wong555@bcit.ca.
 * @version Feb 11.2021 *
 */
public class Student {

    /** first name variable. */
    private String fName;

    /** last name. */
    private String lName;

    /** yearOfBirth. */
    private int yearofBirth;

    /** studentNumber. */
    private String studentNumber;

    /** GPA. */
    private double gpa;

    /**
     * Constructs Student object.
     * 
     * @param first       name
     * @param last        name
     * @param yearOfBirth birthday
     * @param number      studentNumber
     * @param gpa         GPA
     */
    public Student(String first, String last, 
            int yearOfBirth, String number, double gpa) {
        fName = first;
        lName = last;
        yearofBirth = yearOfBirth;
        studentNumber = number;
        this.gpa = gpa;
    }

    /**
     * Return first name.
     * 
     * @return the first name.
     */
    public String getFirstName() {
        return fName;
    }

    /**
     * Return last name.
     * 
     * @return the last name.
     */

    public String getLastName() {
        return lName;
    }

    /**
     * Return year of birth.
     * 
     * @return the year of birth.
     */

    public int getYearofBirth() {
        return yearofBirth;
    }

    /**
     * Return student number.
     * 
     * @return the student number.
     */

    public String getStudentNumber() {
        return studentNumber;
    }

    /**
     * Return GPA.
     * 
     * @return the GPA.
     */

    public double getGPA() {
        return this.gpa;
    }

    /**
     * Set first name.
     * 
     * @param name first
     */
    public void setFirstName(String name) {
        fName = name;
    }

    /**
     * Set last name.
     * 
     * @param name last
     */

    public void setLastName(String name) {
        lName = name;
    }

    /**
     * Set year of birth.
     * 
     * @param yearOfBirth birthday
     */

    public void setYearofBirth(int yearOfBirth) {
        yearofBirth = yearOfBirth;
    }

    /**
     * Set student number.
     * 
     * @param number studentNumber
     */

    public void setStudentNumber(String number) {
        studentNumber = number;
    }

    /**
     * Set GPA using different variable of score.
     * 
     * @param score GPA
     */

    public void setGPA(double score) {
        this.gpa = score;
    }

    // toString() method
    /**
     * Return the whole student information.
     * 
     * @return the student information.
     */
    public String toString() {
        return "Student Name: " + fName + " " + lName 
                + "Year of Birth: " + yearofBirth 
                + "Student Number: " + studentNumber + "GPA: " + gpa;

    }

// test
//    public static void main(String[] args) {
//        Student student = new Student("bob","bobby", 18, "1997",4.0 );
//        System.out.println(student);
//    }
    
    
    
}
