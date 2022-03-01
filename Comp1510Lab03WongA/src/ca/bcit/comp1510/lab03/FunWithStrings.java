/**
 * 
 */

package ca.bcit.comp1510.lab03;


import java.util.Scanner;


/**
 * Fun with strings.
 * @author Wong, Alex a.wong555@bcit.ca.
 * @version 01-25-2021
 */
public class FunWithStrings {

    /**
     * stores User inputs.
     * @param args unused
     */
    public static void main(String[] args) {
        String userInput;
        
        // create Scanner
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your title of your favourite book");
        
        // next only works until there's space
        
        
        // read User Input
        userInput = scan.nextLine();
        
        System.out.println(userInput);
        System.out.println("The book is "
                            + userInput.length() + " characters long.");
        
        System.out.println("Does the title of the book start with"
                + " the word  \"The\"? " + userInput.startsWith("The"));
        // should we always cap the first word? to figure out The
        
        userInput.toUpperCase();
        System.out.println("q14 " + userInput);
        
        
        String newUserInput = userInput.toUpperCase();
        System.out.println("q15 " + newUserInput);
        
        
        //q16
        //String is immutable, .toUpperCase method does not change the object
        
        
        System.out.println("Upper case of the book's title " 
                + userInput.toUpperCase());
        
        System.out.println("Lower case of the book's title " 
                + userInput.toLowerCase());
        
        String trimmedUserInput = userInput.trim(); 
        
        System.out.println("The length of trimmedUserInput variable is " 
                            + trimmedUserInput.length());
        
        /*
         * a) The length of trimmedUserInput variable is 0
         * b) The length of trimmedUserInput variable is 0
         * c) counts the word only
         * d) counts the space between the words as length
         */
        
        System.out.println("User typed " + userInput);
        
        System.out.println("Fully trimmed " + userInput.trim());
        
        System.out.println("In lower case " + userInput.toLowerCase());
        
        System.out.println("With the first and last letters capitalized " 
                + userInput.substring(0, 1).toUpperCase()
                + userInput.substring(1, userInput.length() - 1)
                + userInput.substring(userInput.length() - 1,
                userInput.length()).toUpperCase());
        
       
        scan.close();

        
    }

}
