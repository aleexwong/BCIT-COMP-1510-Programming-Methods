/**
 * 
 */

package q3;


/**
 * Creates the cylinder for multi cylinder.
 * @author Wong, Alex a.wong555@bcit.ca
 * @version 1.0
 */
public class Cylinder {
    
    /** Radius of cylinder. */
    private double radius;
    
    /** height of cylinder. */
    private double height;
      


    /** 
     * Constructor inputs radius and height of the cylinder.
     *  @param radius 
     *          a double for radius
     *  @param height
     *          a double for height
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }



    /**
     * get radius.
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
     * gets height.
     * @return the height
     */
    public double getHeight() {
        return height;
    }



    /**
     * set height.
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    
    /**
     * calculate surface area of cylinder.
     * 
     * @return surface area of cylinder
     */
    public double calculateSA() {

        return  2 * Math.PI * radius * (radius + height);
    }
    
    
    
    
    /**
     * calculate volume of cylinder.
     * 
     * @return volume of cylinder
     */
    public double calculateVolume() {

        return  Math.PI * Math.pow(radius, 2) * height;
    }
    
    /**
     * Returns a String Cylinder.
     * @return toString radius and height.
     */   
    public String toString() {
        return "radius " + radius + "\n" + " and height " + height;
    }
    
}
