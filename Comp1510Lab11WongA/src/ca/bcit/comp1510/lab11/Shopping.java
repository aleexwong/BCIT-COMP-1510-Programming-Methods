package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/** 
 * Driver class for Transaction.
 * @author Alex Wong a.wong555@bcit.ca
 * @version 1.0
 */
public class Shopping {

    /** Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        // create 1 transaction. 
        for (int i = 0; i < 2; i++) {
            Transaction transaction = new Transaction(1);
            
            String name;
            double price;
            int quantity;
            
            boolean end = false;
            
            if (i == 0) {
                System.out.println("fill in the following fields"
                        + "name, price, quanity"
                        + " to addToCart method");
            } else {
                System.out.println("Item of addToCart method");
            }
            do {                
                System.out.println("Enter the name of item ");                
                name = scan.next();
                System.out.println("price:");
                price = scan.nextDouble();
                System.out.println("quantity:");
                quantity = scan.nextInt();
                
                if (i == 0) {
                    transaction.addToCart(name, price, quantity);
                } else {
                    transaction.addToCart(new Item(name, price, quantity));
                }
                               
                boolean validation = false;
                String answer = "";
                while (!validation) {
                    System.out.println("Buy other item?(y/n)");
                    answer = scan.next();
                    
                    if (!answer.equalsIgnoreCase("y") 
                            && !answer.equalsIgnoreCase("n")) {
                        System.out.println("Enter y or n only.");
                    } else {
                        validation = true;
                    }
                }
                if (answer.equals("n")) {
                    end = true;
                }

                
            } while (!end);
            
            System.out.println(transaction.toString());
        }
        
        scan.close();

    }
    
}


