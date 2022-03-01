package ca.bcit.comp1510.lab10;

import java.util.Random;


/**
 * Random Walker methods.
 * 
 * @author Wong Alex
 * @version April 8 2021.
 */
public class RandomWalker {
    
    
    /**
     * x cordinate.
     */
    private int xCord;
    
    /**
     * y cordinate.
     */
    private int yCord;
    
    /**
     * max steps.
     */
    private int maxNumberOfSteps;
    
    /**
     * number of current steps.
     */
    private int currentSteps;
    
    /**
     * bounds of the walker.
     */
    private int boundary;

    /**
     * max distance walker can walk.
     */
    private int maximumDistance;
    
    
    /**
     * Constructor for random Walker.
     * @param max int max steps
     * @param boundary int boundary
     */
    public RandomWalker(int max, int boundary) {
        this.xCord = 0;
        this.yCord = 0;
        this.maxNumberOfSteps = max;
        this.boundary = boundary;
        this.currentSteps = 0;
    }
    
    /**
     * Constructor for random walker.
     * @param xCords x cord of the walker
     * @param yCords y cord of the walker
     * @param max max steps
     * @param boundary boundary set.
     */
    public RandomWalker(int xCords, int yCords,
            int max, int boundary) {
        this.xCord = xCords;
        this.yCord = yCords;
        this.maxNumberOfSteps = max;
        this.boundary = boundary;
        this.currentSteps = 0;
        this.maximumDistance = 0;
    }
    
    /**
     * String rep of Random Walker.
     * @return String of random walker
     */
    public String toString() {
        return "X cord = " + xCord 
                + " y Cord " 
                + yCord 
                + " current Steps = " 
                + currentSteps;
    }
    
    /**
     * Moves a random direction using break statements.
     */
    public void takeStep() {
        Random random = new Random();
        final int direct = 4;
        char move = (char) ('A' + random.nextInt(direct));             
        switch (move) {
            case 'A':
                xCord++;
                break;
            case 'B':
                yCord++;
                break;
            case 'C':
                xCord--;
                break;
            case 'D':
                yCord--;
                break;
            default:
        }
        currentSteps++;
        
        maximumDistance = max(maximumDistance,
                max(Math.abs(xCord), Math.abs(yCord)));
                
    }
    
    /**
     * Returns if the current steps less than max steps.
     * @return boolean if current less than max
     */
    public boolean moreSteps() {
        return currentSteps < maxNumberOfSteps;
    }
    
    /**
     * Returns if the current position is in the boundary.
     * 
     * @return boolean represents if the current position is in boundary..
     */
    public boolean inBounds() {
        return xCord <= boundary 
                && xCord >= -boundary 
                && yCord <= boundary 
                && yCord >= -boundary;
    }
    
    /**
     * Loops walk.
     */
    public void walk() {
        while (this.moreSteps() && this.inBounds()) {
            this.takeStep();
        }
    }
    
    /**
     * Returns the larger int between a and b.
     * 
     * @param a int number
     * @param b int for b
     * @return integer is larger.
     */
    private int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    /**
     * Accessor for maximum distance.
     * 
     * @return int maximum distance.
     */
    public int getMaximumDistance() {
        return maximumDistance;
    }
    
    /**
     * Accessor for x-coordinate.
     * @return int for x-coordinate.
     */
    public int getXCord() {
        return xCord;
    }
    
    /**
     * Accessor for y-coordinate.
     * @return int for y-coordinate.
     */
    public int getYCord() {
        return yCord;
    }
    
    
    

}
