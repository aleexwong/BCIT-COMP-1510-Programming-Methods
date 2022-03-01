package q3;

/**
 * instantiate and updates 2 cylinders printing radius and height.
 *
 * @author Wong, Alex a.wong555@bcit.ca
 * @version 1.0
 */
public class MultiCylinder {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        // before mod

        final double radius1 = 10.0;
        final double height1 = 12.0;

        final double radius2 = 5.0;
        final double height2 = 4.5;

        Cylinder cylinder1 = new Cylinder(radius1, height1);
        Cylinder cylinder2 = new Cylinder(radius2, height2);
        System.out.println("Before mod " + "Cylinder 1 Radius " 
                + cylinder1.getRadius() + "Cylinder 1 Height "
                + cylinder1.getHeight());
        System.out.println("Before mod " + "Cylinder 2 Radius " 
                + cylinder2.getRadius() + "Cylinder 2 Height "
                + cylinder2.getHeight());
        // after mod

        cylinder1.setHeight(height2);
        cylinder1.setRadius(radius2);

        cylinder2.setHeight(height1);
        cylinder2.setRadius(radius1);

        System.out.println("After mod " + "Cylinder 1 Radius " 
                + cylinder1.getRadius() + "Cylinder 1 Height "
                + cylinder1.getHeight());
        System.out.println("after mod " + "Cylinder 2 Radius " 
                + cylinder2.getRadius() + "Cylinder 2 Height "
                + cylinder2.getHeight());

        // after mod

        System.out.println("Final Volume and Surface area after mod is:");
        System.out.println("volume1 " + cylinder1.calculateVolume() 
            + "SA1 " + cylinder1.calculateSA());
        System.out.println("volume2 " + cylinder2.calculateVolume() 
            + "SA2 " + cylinder2.calculateSA());

        System.out.println("Question three was called and ran sucessfully.");
    }

}
