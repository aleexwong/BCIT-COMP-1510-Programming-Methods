package ca.bcit.comp1510.lab11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * prompts user for number, store into array, reverse add array into arraylist
 * print it out.
 * 
 * @author Alex Wong a.wong555@bcit.ca
 * @version 1.0
 */
public class ReverseArray {

    /**
     * Holds array variable.
     */
    private static int[] array;

    /**
     * Swaps the elements in the Array.
     */
    private static void swap() {

        int a1;
        int a2;

        for (int i = 0; i < array.length / 2; i++) {
            a1 = array[i];
            a2 = array[array.length - i - 1];
            array[i] = a2;
            array[array.length - i - 1] = a1;
        }

    }

    /**
     * Puts ArrayList list reverse.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 0;

        boolean end = false;
        while (!end) {
            scan = new Scanner(System.in);

            try {
                System.out.println("Enter a int number larger than zero");
                number = scan.nextInt();
                end = true;
                if (number <= 0) {
                    System.out.println("Number must be greater than 0");
                    end = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("input wrong");
            }

        }
        array = new int[number];
        
        for (int i = 0; i < number; i++) {
            end = false;
            while (!end) {
                scan = new Scanner(System.in);
                
                try {
                    System.out.println("Please enter # " 
                            + (i + 1) + " value:");
                    array[i] = scan.nextInt();
                    end = true;
                } catch (InputMismatchException e) {
                    System.out.println("Int only.");
                }
                   
            }
      
        }
        
        System.out.println("The array you enter is ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        swap();
        System.out.println("The reverse array ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        scan.close();
        
    }

}
