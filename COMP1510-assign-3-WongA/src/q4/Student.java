package q4;

import java.text.DecimalFormat;

/**
 * Represents a BCIT student.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */

public class Student {
    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student.  Can be shared by other students */
    private Address schoolAddress;
    
    /** Home address of this student. */
    private int test1;  
    
    /** Home address of this student. */
    private int test2; 
    
    /** Home address of this student. */
    private int test3;

    
    /**
     * Constructs a Student object that contains the specified values.
     * @param first a String representing the first name
     * @param last a String representing the last name
     * @param home an Address object containing the home address
     * @param school an Address object containing the school address
     */
    public Student(String first, String last, Address home, Address school) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
    }
    
    
    /**
     * Constructs a Student object that contains the specified values.
     * @param first a String representing the first name
     * @param last a String representing the last name
     * @param home an Address object containing the home address
     * @param school an Address object containing the school address
     * @param score1 test 1
     * @param score2 test 2
     * @param score3 test 3
     */
    public Student(String first, String last, Address home, Address school,
             int score1, int score2, int score3) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        test1 = score1;
        test2 = score2;
        test3 = score3;
    }
    
    
    /**
     * Constructor for student 3 zero test scores.
     * no params because takes nothing
     */
    public Student() {
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }
    
    /**
     * Sets the test scores. 
     * 
     * 
     * @param testNumber  which test
     * @param score for that test
     */
    public void setTestScore(int testNumber, int score) {
        
        final int numberOfTest = 3;
        
        // max 3 tests
        if (testNumber < 1 || testNumber > numberOfTest) {
            throw new IllegalArgumentException("The test number "
                    + "between 1 and 3"
                    );
        }
        
        // takes test 
        char testChar = (char) ('A' + testNumber - 1);
        
        switch (testChar) {
            case 'A':
                test1 = score;
                break;
            case 'B':
                test2 = score;
                break;
            case 'C':
                test3 = score;
                break;
            default:
                break;
        }

    }

    /**
     * Gets the test scores. 
     * 
     * @param testNumber 1 - 3 test
     * @return int value the score for that test
     */
    public int getTestScore(int testNumber) {
        
        final int numberOfTest = 3;
        
        
        if (testNumber < 1 || testNumber > numberOfTest) {
            throw new IllegalArgumentException("The test number should be "
                    + "between 1 and 3.");
        }
        
        char testChar = (char) ('A' + testNumber - 1);
        if (testChar == 'A') {
            return test1;
        } else if (testChar == 'B') {
            return test2;
        } else {
            return test3;
        }

    }
    
    /**
     * calculate average of 3 tests.
     * @return double, average of the 3 tests.
     */
    public double average() {
        final double numberOfTest = 3.0;

        final int testOne = 1;
        final int testTwo = 2;
        final int testThree = 3;
        
        DecimalFormat decimal = new DecimalFormat("#.##");
        
        return Double.parseDouble(decimal.format((getTestScore(testOne) 
                + getTestScore(testTwo) 
                + getTestScore(testThree)) 
                / numberOfTest));
        
              
    }
    
    /**
     * Returns a String description of this Student object.
     * @return description a String
     */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address: \n" + schoolAddress + "\n";
        result += "Test Score 1: \n" + test1 + "\n";
        result += "Test Score 2: \n" + test2 + "\n";
        result += "Test Score 3: \n" + test3 + "\n";
        result += "Average:\n" + average() + "%" + "\n";

        return result;
    }
}

