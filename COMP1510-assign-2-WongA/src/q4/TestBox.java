package q4;

/**
 * <p>
 * Creates two Box objects to test Box class.
 * </p>
 *
 * @author Wong, Alex a.wong555@bcit.ca
 * @version 1.0
 */
public class TestBox {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // int as 0.0 to begin
        Box box1 = new Box(0.0, 0.0, 0.0);
        Box box2 = new Box(0.0, 0.0, 0.0);

        final double height1 = 1.0;
        final double width1 = 2.0;
        final double depth1 = 3.0;

        final double height2 = 2.0;
        final double width2 = 4.0;
        final double depth2 = 6.0;

        System.out.println("Before Box1 inputs height" + box1.getHeight());
        System.out.println("Before Box1 inputs width" + box1.getWidth());
        System.out.println("Before Box1 inputs depth" + box1.getDepth());

        System.out.println("Before Box2 inputs height" + box2.getHeight());
        System.out.println("Before Box2 inputs width" + box2.getWidth());
        System.out.println("Before Box2 inputs depth" + box2.getDepth());

        box1.setHeight(height1);
        box1.setWidth(width1);
        box1.setDepth(depth1);

        box2.setHeight(height2);
        box2.setWidth(width2);
        box2.setDepth(depth2);

        System.out.println("After Box1 inputs height width and depth");
        System.out.println(box1.getHeight() 
                + box1.getWidth() 
                + box1.getDepth());

        System.out.println("After Box2 inputs height width and depth");
        System.out.println(box2.getHeight() 
                + box2.getWidth() 
                + box2.getWidth());

        System.out.println("percent 1 full methods " + box1.percentFull());
        System.out.println("percent 2 full methods " + box2.percentFull());

        System.out.println(box1.calculateVolumeOfBox());
        System.out.println(box2.calculateVolumeOfBox());
        System.out.println(box1.toString());
        System.out.println(box2.toString());

    }

}
