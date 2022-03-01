package ca.bcit.comp1510.lab10;

/**
 * collisions tester.
 * 
 * @author Wong Alex
 * @version April 8 2021.
 */
public class Collisions {

    /** if 2 objects take same cords = collision.
     * @param args unused.
     */
    public static void main(String[] args) {
        
        final int boundary = 2000000;
        final int maxNumberOfSteps = 100000;
        
        final int xCord1 = -3;
        final int yCord1 = 0;
        
        final int xCord2 = 3;
        final int yCord2 = 0;
        
        RandomWalker particle1 = new RandomWalker(xCord1,
                yCord1, maxNumberOfSteps, boundary);
        
        RandomWalker particle2 = new RandomWalker(xCord2,
                yCord2, maxNumberOfSteps, boundary);
        
        int collisions = 0;
        for (int i = 1; i <= maxNumberOfSteps; i++) {
            particle1.takeStep();
            particle2.takeStep();
            if (samePosition(particle1, particle2)) {
                collisions++;
            }
        }
        
        System.out.println("Number of collisions " + collisions);
        
        
    }
    
    /**
     * Checks if particles in same position.
     * 
     * @param random1 first RandomWalker
     * @param random2 second RandomWalker
     * @return boolean if it the same returns true;
     */
    public static boolean samePosition(RandomWalker random1, 
            RandomWalker random2) {
        return random1.getXCord() == random2.getXCord() 
                && random1.getYCord() == random2.getYCord();
    }
        

}


