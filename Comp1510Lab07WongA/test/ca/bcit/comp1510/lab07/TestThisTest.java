package ca.bcit.comp1510.lab07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class TestThisTest {
    
    private TestThis test;

    /**
     * Creates a new TestThis objects before each test is executed.
     * 
     * @throws Exception
     *             if a TestThis object cannot be created.
     */
    @BeforeEach
    public void setUp() throws Exception {
        test = new TestThis();
    }
    
    @Test
    void testLargestIntIntInt1() {
        assertEquals(3454, test.largest(1,2,3454));
    }

    @Test
    void testLargestListOfInteger1() {
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);
        testArray.add(-1);
        testArray.add(4);
        assertEquals(4, test.largest(testArray));
    }
    
    @Test
    void testLargestIntIntInt2() {
        assertEquals(6, test.largest(-1,5,6));
    }
    
    @Test
    void testLargestIntIntInt3() {
        assertEquals(15, test.largest(15,6,9));
    }
    
    @Test
    void testLargestIntIntInt4() {
        assertEquals(-1, test.largest(-1,-2,-565));
    }
    
    @Test
    void testLargestIntIntInt5() {
        assertEquals(2000, test.largest(-1,2000,565));
    }
    
    @Test
    void testLargestListOfInteger2() {
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        testArray.add(5);
        testArray.add(9);
        testArray.add(9999);
        testArray.add(4);
        assertEquals(9999, test.largest(testArray));
    }
    
    @Test
    void testLargestListOfInteger3() {
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        testArray.add(-2);
        testArray.add(9);
        testArray.add(209);
        testArray.add(1010);
        assertEquals(1010, test.largest(testArray));
    }
    
    @Test
    void testLargestListOfInteger4() {
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        testArray.add(-15);
        testArray.add(-10000);
        testArray.add(9999);
        testArray.add(4454);
        assertEquals(9999, test.largest(testArray));
    }
    
    
    @Test
    void testLargestListOfInteger5() {
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        testArray.add(-15);
        testArray.add(-10000);
        testArray.add(9999);
        testArray.add(4454);
        testArray.add(454);
        testArray.add(44);
        testArray.add(4);
        assertEquals(9999, test.largest(testArray));
    }


}
