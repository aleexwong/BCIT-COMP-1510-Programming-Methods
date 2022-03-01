package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * Class for testing random walker.
 * @author Wong Alex
 * @version April 8 2021.
 */
public class TestWalker {

    /**
     * Testing RandomWalker.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        final int firstMaximumSteps = 10;
        final int firstBoundarySize = 5;
        RandomWalker firstRandomWalker = 
                new RandomWalker(firstMaximumSteps, firstBoundarySize);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the maximum steps between 10 - 200");
        
        int secondMaxSteps = scan.nextInt();
        System.out.println("Enter the boundary size max 10");
        int secondBoundary = scan.nextInt();
        
        
        RandomWalker secondRandomWalker = 
                new RandomWalker(secondMaxSteps, secondBoundary);
        System.out.println("First:" + firstRandomWalker.toString());
        System.out.println("Second:" + secondRandomWalker.toString());
        
        final int time = 5;
        for (int i = 1; i <= time; i++) {
            firstRandomWalker.takeStep();
            secondRandomWalker.takeStep();
            System.out.println("First maximum distance:" 
            + firstRandomWalker.getMaximumDistance());
            System.out.println("Second maximum distance:" 
            + secondRandomWalker.getMaximumDistance());
        }
        
        System.out.println("after");
        System.out.println("first" + firstRandomWalker.toString());
        System.out.println("second" + secondRandomWalker.toString());
        
        final int thirdMaximumSteps = 200;
        final int thirdBoundarySize = 10;
        
        RandomWalker thirdRandomWalker = 
                new RandomWalker(thirdMaximumSteps, thirdBoundarySize);
        System.out.println("third");
        System.out.println("before" + thirdRandomWalker.toString());
        thirdRandomWalker.walk();
        System.out.println("after" + thirdRandomWalker.toString());
        
        
        
        scan.close();

    }

}
