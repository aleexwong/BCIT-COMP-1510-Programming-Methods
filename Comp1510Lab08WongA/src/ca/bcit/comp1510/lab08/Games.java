
package ca.bcit.comp1510.lab08;

import java.util.Scanner;
import java.util.Random;

/**
 * Game properties of score.
 * 
 * @author Wong Alex a.wong555@bcit.ca.
 * @version March 22, 2021
 */
public class Games {

    /** User Score.*/
    private int userScore;

    /** Scanner.*/
    private Scanner scan;
    
    /** generate random.*/
    private Random random;

    /**
     * Constructor for Games.
     */
    public Games() {
        userScore = 0;
        scan = new Scanner(System.in);
        random = new Random();

    }

    /**
     * play options from 1 - 4, each with different options.
     */
    public void play() {
        int userOption;

        final int option1 = 1;
        final int option2 = 2;
        final int option3 = 3;
        final int option4 = 4;

        do {
            System.out.println("Welcome to the Games program!");
            System.out.println("Make your choice (enter a number):");
            System.out.println("1. See your score");
            System.out.println("2. Guess a number");
            System.out.println("3. Play Rock, Paper, Scissors");
            System.out.println("4. Quit");
            System.out.println(">");

            userOption = scan.nextInt();

            if (userOption == option1) {
                System.out.println("Your score is " + userScore);
            } else if (userOption == option2) {
                guessANumber();
            } else if (userOption == option3) {
                rockPaperScissors();
            } else if (userOption == option4) {
                System.out.println("Quit.");
            }
        } while (userOption != option4);

    }

    /**
     * Game 1.
     */
    public void guessANumber() {
        final int numberGenerated = 101;
        int generatedNumber = random.nextInt(numberGenerated);
        int guessAmount = 0;
        int guessNumber;

        final int underFive = 5;

        System.out.println("I've picked a random number between 0 and 100\r\n" 
                + "Can you guess it?");

        do {
            System.out.println("Guess the number!");
            guessNumber = scan.nextInt();
            if (guessNumber > generatedNumber) {
                System.out.println("Too high, guess again!");
                guessAmount++;
            } else if (guessNumber < generatedNumber) {
                System.out.println("Too low, guess again!");
                guessAmount++;
            } else {
                guessAmount++;
            }
        } while (guessNumber != generatedNumber);

        System.out.println("Right!");

        if (guessAmount <= underFive) {
            System.out.println("Five Points!");
            userScore += underFive;

        } else {
            System.out.println("More than 5 times. Zero points!");
        }

    }

    /**
     * Game 2.
     */
    public void rockPaperScissors() {
        // 0 1 2
        final int numbers = 3;
        int pickedNumbers = random.nextInt(numbers);
        String userPick = null;
        String userPicked;
        boolean valid;
        final int win = 5;
        final int lose = 3;

        // used switch function
        switch (pickedNumbers) {
            case 0:
                userPick = "rock";
                break;
            case 1:
                userPick = "paper";
                break;
            case 2:
                userPick = "scissors";
                break;
            default:
        }

        /*
         * Rules
         * 
         * 1. A rock smashes scissors, 
         * ties with another rock, but loses to paper. 
         * 2.
         * Paper wraps rock, ties with other paper, but loses to scissors. 
         * 3. Scissors
         * cut paper, tie with other scissors, but lose to rock.
         */

        do {
            System.out.println("I've picked one of rock, paper, and scissors.");
            System.out.println("Which one do you choose?");
            userPicked = scan.next();
            if (userPicked.equalsIgnoreCase("rock") 
                    || userPicked.equalsIgnoreCase("paper")
                    || userPicked.equalsIgnoreCase("scissors")) {
                valid = true;
            } else {
                valid = false;
                System.out.println("That's not a valid choice! Try again!");
            }
        } while (!valid);

        if ((pickedNumbers == 0 
                && userPicked.equalsIgnoreCase("paper"))
                || (pickedNumbers == 1 
                && userPicked.equalsIgnoreCase("scissors"))
                || (pickedNumbers == 2 
                && userPicked.equalsIgnoreCase("rock"))) {

            System.out.println("Winner! " + userPick);
            userScore += win;

        } else if ((pickedNumbers == 0 
                && userPicked.equalsIgnoreCase("scissors"))
                || (pickedNumbers == 1 
                && userPicked.equalsIgnoreCase("rock"))
                || (pickedNumbers == 2 
                && userPicked.equalsIgnoreCase("paper"))) {

            System.out.println("You lose, " + userPick);
            userScore -= lose;

        } else {
            System.out.println("Tied " + userPick);
        }
    }
}
