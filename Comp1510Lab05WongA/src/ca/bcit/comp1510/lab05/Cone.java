
package ca.bcit.comp1510.lab05;

/**
 * Cone creation.
 * 
 * @author Wong Alex a.wong555@bcit.ca.
 * @version Feb 11.2021
 */
public class Cone {

    /** Radius. */
    private double radius;

    /** Height. */
    private double height;

    /**
     * Constructs Cone object.
     * 
     * @param radius radius of cone
     * @param height height of cone
     */
    public Cone(double radius, double height) {
        this.height = height;
        this.radius = radius;

    }

    /**
     * get Radius of cone.
     * 
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * set Radius of cone.
     * 
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * get cone height.
     * 
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * set cone height.
     * 
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Slant height calculation.
     * 
     * @return volume
     */
    public double calculateVolume() {

        final double three = 3;

        return (1 / three) * Math.PI * Math.pow(radius, 2) * height;
    }

    /**
     * Slant height calculation.
     * 
     * @return slant height
     */
    public double calculateSlantHeight() {

        return Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));

    }

    /**
     * Slant height calculation.
     * 
     * @return Surface Area of Cone
     */
    public double calculateSurfaceArea() {
        return ((Math.PI * Math.pow(radius, 2)) 
                + ((Math.PI * radius) * calculateSlantHeight()));

    }

    /**
     * Returns a String representation Cone.
     * 
     * @return toString contains radius and height.
     */
    public String toString() {
        return "Radius: " + radius + "\n" + "Height: " + height;

    }
}
