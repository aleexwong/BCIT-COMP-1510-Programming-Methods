package ca.bcit.comp1510.lab09;

import java.util.Random;

/**
 * Driver for Cat Hotel.
 * 
 * @author Wong Alex
 * @version March 31 , 2021.
 *
 */
public class Driver {

    /**
     * Drives the program.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        CatHotel catHotel = new CatHotel("Cats Living Life");

        Random random = new Random();

        // Create Cat objects for Cat Hotel.
        final int catsNum = 20;
        final int catAgeLimit = 25;
        for (int i = 1; i <= catsNum; i++) {
            Cat newCat = new Cat(random.nextInt(catAgeLimit));
            catHotel.addCat(newCat);

        }
        System.out.println("Name & List of Cats before methods");
        catHotel.printGuestList();
        System.out.println("Number of Cats " + catHotel.guestCount());

        System.out.println("Sorry, There is an age" 
                + " limit in this hotel (age 21)");
        final int ageLimited = 21;
        catHotel.removeOldGuests(ageLimited);
        catHotel.printGuestList();
        System.out.println("Number of Cats " + catHotel.guestCount());

        System.out.println("Cat Hotel is now Closed Thank you");
        catHotel.removeAllGuests();
        System.out.println("Cat Hotel Cat List");
        catHotel.printGuestList();

        // Testing Cat & Cat Hotel without Random.

        System.out.println("Manually added Cats");
        final int age1 = 24;
        final int age2 = 20;
        final int age3 = 16;
        Cat cat1 = new Cat("Alex", age1);
        Cat cat2 = new Cat("Party", age2);
        Cat cat3 = new Cat("Wong", age3);

        catHotel.addCat(cat1);
        catHotel.addCat(cat2);
        catHotel.addCat(cat3);

        catHotel.printGuestList();

    }
}
