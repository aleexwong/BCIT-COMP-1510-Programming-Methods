/**
 * 
 */

package q4;

/**
 * Creates box constructor with methods.
 * 
 * @author Wong, Alex a.wong555@bcit.ca
 * @version 1.0 *
 */
public class Box {

    /** height of box. */
    private double height;

    /** width of box. */
    private double width;

    /** depth of box. */
    private double depth;

    /** content of box in cubic centimeters. */
    private double contents;

    /**
     * constructor for box height width depth.
     * 
     * 
     * @param height of box is a double
     * @param width  of box is a double
     * @param depth  of box is a double
     * 
     */
    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.contents = 0.0;

    }

    /**
     * get height as double.
     * 
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * set height as double.
     * 
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * get width as double.
     * 
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * get width as double.
     * 
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * get depth of box as double.
     * 
     * @return the depth
     */
    public double getDepth() {
        return depth;
    }

    /**
     * set depth of box.
     * 
     * @param depth the depth to set
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }

    /**
     * content of box in cubic centimeters.
     * 
     * @return contents of box;
     */
    public double getContents() {
        return contents;
    }

    /**
     * set content of box in cubic centimeters.
     * 
     * @param contents of box
     */
    public void setContents(double contents) {
        this.contents = contents;
    }

    /**
     * Returns double of volume of box.
     * 
     * @return volume of box.
     */
    public double calculateVolumeOfBox() {
        return height * width * depth;

    }

    /**
     * Returns a percentage of box.
     * 
     * @return percent full of box content / volume
     */
    public double percentFull() {

        final double percentage = 100.0;

        return (contents / calculateVolumeOfBox()) * percentage;

    }

    /**
     * Returns a String Box.
     * 
     * @return toString Box height, width and depth
     */
    public String toString() {
        return "The height, width and depth of the box is" 
                + height + ", " + width + ", " + depth;
    }

}
