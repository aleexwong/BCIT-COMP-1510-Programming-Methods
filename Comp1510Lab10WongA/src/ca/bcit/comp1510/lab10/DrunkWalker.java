package ca.bcit.comp1510.lab10;

import java.util.Random;
import java.util.Scanner;

/**
 * RandomWalker is now "drunk".
 * 
 * @author Wong Alex
 * @version April 8 2021.
 */
public class DrunkWalker {

    /** drunk walkers.
     * @param args unsed
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the boundary");
        int boundary = scan.nextInt();

        System.out.println("Enter the number of steps");
        int maxSteps = scan.nextInt();

        System.out.println("Enter number of drunks");
        int drunk = scan.nextInt();

        int falls = 0;

        for (int i = 1; i <= drunk; i++) {
            int xCord = 0;
            int yCord = 0;
            int steps = 0;
            
            // taken from RandomWAlker.
            while ((xCord <= boundary 
                    && xCord >= -boundary 
                    && yCord <= boundary 
                    && yCord >= -boundary)
                    && steps <= maxSteps) {
                
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
                steps++;

            }
            if (steps <= maxSteps) {
                falls++;
            }

        }
        
        System.out.println("number of tests " + drunk);
        
        
        System.out.println("number of falls " + falls);
        
        
        scan.close();
    }

}
