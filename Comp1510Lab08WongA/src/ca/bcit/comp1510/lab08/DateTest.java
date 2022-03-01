package ca.bcit.comp1510.lab08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * DateTest
 * 
 * @author alex
 * @version 1.0
 */
public class DateTest {
    
    private Date date;

    /**
     * Creates a new Mathematics objects before each test is executed.
     * 
     * @throws Exception
     *             if a Mathematics object cannot be created.
     */
    @BeforeEach
    public void setUp() throws Exception {
        date = new Date(1,12,2000);
    }
    
    /**
     * Test method for the value of testIsMonthValid.
     * @param expected, if the month is range 1 - 12
     * @param value1 day
     * @param value2 month
     * @param value3 year
     */
    @ParameterizedTest
    @CsvSource({"true, 1, 1, 2000",})
    public void testIsMonthValid(boolean expected, int value1, int value2, int value3) {
        boolean result = Date.isMonthValid(value2);
        assertEquals(expected,result);
    }
    
    /**
     * Test method for the value of testIsMonthValid.
     * @param expected, if the month is range 1 - 12
     * @param value1 day
     * @param value2 month
     * @param value3 year
     */
    @ParameterizedTest
    @CsvSource({"true, 0, 1, 2000",})
    public void testIsYearValid(boolean expected, int value1, int value2, int value3) {
        boolean result = Date.isYearValid(value3);
        assertEquals(expected,result);
    }
    
    /**
     * Test method for the value of isLeapYear.
     * @param expected year needs to be divided by 400 if yes, is a leap year
     * @param value1 day
     * @param value2 month
     * @param value3 year
     */
    @ParameterizedTest
    @CsvSource({"true, 1, 1, 2020",})
    public void testIsLeapYear(boolean expected, int value1, int value2, int value3) {
        boolean result = Date.isLeapYear(value3);
        assertEquals(expected , result);
    }
    
    /**
     * Test method for the value of testIsMonthValid.
     * @param expected, if the month is range 1 - 12
     * @param value1 day
     * @param value2 month
     * @param value3 year
     */
    @ParameterizedTest
    @CsvSource({"true, 0, 1, 2000",})
    public void testDaysInMonth(boolean expected, int value1, int value2, int value3) {
        boolean result = Date.daysInMonth(value1, expected);
        assertEquals(expected,result);
    }
    
    /**
     * Test method for the value of testIsMonthValid.
     * @param expected, if the month is range 1 - 12
     * @param value1 day
     * @param value2 month
     * @param value3 year
     */
    @ParameterizedTest
    @CsvSource({"false, 0, 1, 2000",})
    public void testIsDateValid(boolean expected, int value1, int value2, int value3) {
        boolean result = Date.isDateValid(value1, value2, value3);
        assertEquals(expected,result);
    }

}
