package q2;

/**
 * Balloon inflating, calculate volume and connects to driver class Blow.
 *
 * @author Wong, Alex a.wong555@bcit.ca
 * @version 1.0
 */
public class Balloon {
    /** Constant. */
    public static final double FOUR = 4;

    /** Constant. */
    public static final double THREE = 3;
    
    /** radius given is zero.*/
    private double radius;
    

    
    
    /**
     * calculates stuff.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        System.out.println("Question two was called and ran sucessfully.");
     
    }

    /** gets radius.
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * set radius.
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }


    /**
     * calculates stuff.
     *
     * @param amount inflates balloon by an amount.
     */
    public void inflate(double amount) {
        radius = amount;
    }
    
    /**
     * calculates stuff.
     *
     * @return volume of balloon calculated.
     */
    public double getVolume() {

        return (FOUR / THREE) * Math.PI * Math.pow(radius, THREE);
    }
    

}
