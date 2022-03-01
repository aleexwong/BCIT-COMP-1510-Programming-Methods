/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * Sphere creation.
 * 
 * @author Wong Alex a.wong555@bcit.ca.
 * @version Feb 11.2021
 */
public class Sphere {

    /** Constant. */
    public static final double FOUR = 4;

    /** Constant. */
    public static final double THREE = 3;

    /** X axis of Sphere. */
    private double posX;

    /** Y axis of Sphere. */
    private double posY;

    /** Z axis of Sphere. */
    private double posZ;

    /** Radius of sphere. */
    private double radius;

    /**
     * Constructs Sphere object.
     * 
     * @param axisX  posX
     * @param axisY  posY
     * @param axisZ  posZ
     * @param radius radius
     */
    public Sphere(double axisX, double axisY, double axisZ, double radius) {
        posX = axisX;
        posY = axisY;
        posZ = axisZ;
        this.radius = radius;

    }

    /**
     * Return X pos.
     * 
     * @return the posX
     */
    public double getPosX() {
        return posX;
    }

    /**
     * Set X pos.
     * 
     * @param posX the posX to set
     */
    public void setPosX(double posX) {
        this.posX = posX;
    }

    /**
     * get pos Y.
     * 
     * @return the posY
     */
    public double getPosY() {
        return posY;
    }

    /**
     * Set y pos.
     * 
     * @param posY the posY to set
     */
    public void setPosY(double posY) {
        this.posY = posY;
    }

    /**
     * Set z pos.
     * 
     * @return the posZ
     */
    public double getPosZ() {
        return posZ;
    }

    /**
     * Set Z pos.
     * 
     * @param posZ the posZ to set
     */
    public void setPosZ(double posZ) {
        this.posZ = posZ;
    }

    /**
     * returns radius of sphere.
     * 
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * set radius of sphere.
     * 
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Method for Surface Area of Sphere.
     * 
     * @return surface area in a double.
     */
    public double calculateSA() {
        return FOUR * Math.PI * Math.pow(radius, 2);
    }

    /**
     * Method for Volume of Sphere.
     * 
     * @return Volume in a double.
     */
    public double calculateVolume() {

        return (FOUR / THREE) * Math.PI * Math.pow(radius, THREE);

    }

    /**
     * Information of Sphere.
     * 
     * @return a String.
     */
    public String toString() {
        return "X-coordinate " + posX + "\n" 
                + "Y-coordinate " + posY + "\n" 
                + "Z-coordinate " + posZ + "\n" 
                + "Radius " + radius;

    }

}
