package ca.bcit.comp1510.lab09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplexTest {
    /** 3 + 4 I real part. */
    private static final int TEST1R = 3;

    /** 3 + 4 I imaginary part. */
    private static final int TEST1I = 4;

    /** 1 + I real part. */
    private static final int TEST2R = 1;

    /** 1 + I imaginary part. */
    private static final int TEST2I = 1;
    
    Complex z1 = new Complex(TEST1R, TEST1I);
    Complex z2 = new Complex(TEST2R, TEST2I);
    Complex z3 = z1.reciprocal();
    Complex z4 = z1.add(z2);
    Complex z5 = z1.subtract(z2);
    Complex z6 = z1.multiply(z2);
    Complex z7 = z1.divide(z2);

    
    final double piDiv4 = Math.PI / 4.0;
    final Complex minusOne = Complex.ZERO.subtract(Complex.ONE);
    final Complex πi = new Complex(0.0, Math.PI);
    
    @Test
    public void absTest() {
        z1.abs();
        assertEquals(5.0,z1.abs());
    }
    
    @Test
    public void nabsTest() {
        Complex.I.abs();
        assertEquals(1.0,Complex.I.abs());
    }
    
    @Test
    public void nargTest() {
        z2.arg();
        assertEquals(0.7853981633974483,z2.arg());
    }
    
    @Test
    public void npiTest() {
        assertEquals(Math.PI / 4.0, piDiv4);
    }
    
    @Test 
    public void nargTest2() {
        assertEquals(1.5707963267948966,Complex.I.arg());
    }
    
    @Test 
    public void nargTest3() {
        double results = minusOne.arg();
        assertEquals(results,Math.PI);
    }
    
    @Test 
    public void reciprocalTest() {
        
        Complex results = z1.reciprocal();
        assertEquals(results,z3);

    }
    
    @Test
    public void addTest() {
        Complex results = z4;
        Complex help = z1.add(z2);
        assertEquals(results, help);
    }
    
    @Test
    public void subtractTest() {
        Complex help = z1.subtract(z2);
        assertEquals(z5,help);
    }
    
    @Test
    public void multiplyTest() {
        Complex help = z1.multiply(z2);
        assertEquals(z6,help);

    }
    
    @Test
    public void divideTest2() {
        Complex help = z1.divide(z2);
        assertEquals(z7,help);

    }
    
}
