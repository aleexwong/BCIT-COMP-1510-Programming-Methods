/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * Cube creation.
 * 
 * @author Wong Alex a.wong555@bcit.ca.
 * @version Feb 11.2021
 */
public class Cube {

    /** Constant. */
    public static final double THREE = 3;

    /** Constant. */
    public static final double SIX = 6;

    /** X axis of Cube. */
    private double posX;

    /** Y axis of Cube. */
    private double posY;

    /** Z axis of Cube. */
    private double posZ;

    /** Edge of Cube. */
    private double edge;

    /**
     * Constructs Sphere object.
     * 
     * @param axisX posX
     * @param axisY posY
     * @param axisZ posZ
     * @param edge  edge
     */
    public Cube(double axisX, double axisY, double axisZ, double edge) {
        posX = axisX;
        posY = axisY;
        posZ = axisZ;
        this.edge = edge;

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
     * @return the edge
     */
    public double getEdge() {
        return edge;
    }

    /**
     * set radius of sphere.
     * 
     * @param edge the radius to set
     */
    public void setEdge(double edge) {
        this.edge = edge;
    }

    /**
     * Information of Cube.
     * 
     * @return a String.
     */
    public String toString() {
        return "X-coordinate " + posX + "\n" 
                + "Y-coordinate " + posY + "\n" 
                + "Z-coordinate " + posZ + "\n" 
                + "Edge " + edge;

    }

    /**
     * Method for Surface Area of Cube.
     * 
     * @return surface area in a double.
     */
    public double calculateSA() {
        return SIX * Math.pow(edge, 2);
    }

    /**
     * Method for Volume of Cube.
     * 
     * @return Volume in a double.
     */
    public double calculateVolume() {

        return Math.pow(edge, THREE);

    }
    
    /**
     * Method for Face Diagonal of Cube.
     * 
     * @return FaceDiagonal in a double.
     */  
    public double calculateFaceDiagonal() {

        return Math.sqrt(2) * edge;
        
    }
    
    /**
     * Method for Space Diagonal of Cube.
     * 
     * @return Space Diagonal in a double.
     */
    public double calculateSpaceDiagonal() {

        return Math.sqrt(THREE) * edge;
        

    }
    
    
    
    
}
