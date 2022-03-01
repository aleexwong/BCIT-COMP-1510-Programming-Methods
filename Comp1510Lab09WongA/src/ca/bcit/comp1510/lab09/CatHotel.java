package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.Iterator;


/** Cat Hotel.
 * @author Wong Alex
 * @version march 31 , 2021.
 */
public class CatHotel {

    /**
     * Holds the hotel's Name.
     */
    private String hotelName;

    /**
     * ArrayList of cats.
     */
    private ArrayList<Cat> catList;

    /**
     * Construtor for cat hotel.
     * 
     * @param hotelName String name
     */
    public CatHotel(String hotelName) {

        this.catList = new ArrayList<Cat>();

        if (hotelName != null && !hotelName.trim().isEmpty()) {
            this.hotelName = "Cat Hotel";
        } else {
            this.hotelName = hotelName;
        }
    }

    /**
     * Adds cat to catList.
     * 
     * @param newCat cat Object
     */
    public void addCat(Cat newCat) {
        catList.add(newCat);
    }

    /**
     * Removes all from list.
     */
    public void removeAllGuests() {
        catList.clear();

    }

    /**
     * Returns the number of cats in the list.
     * 
     * @return number of cat list.
     */
    public int guestCount() {
        return catList.size();
    }

    /**
     * Removes cats from list above a certain age.
     * 
     * @param ageLimits limit of cat age.
     * @return count of guest to remove
     */
    public int removeOldGuests(int ageLimits) {
        Iterator<Cat> catIterator = catList.iterator();
        int count = 0;
        
        while (catIterator.hasNext()) {
            Cat temp = catIterator.next();
        
            if (temp.getAge() > ageLimits) {
                catIterator.remove();
                count++;
            }
        }
        return count;
        
    }
    
    /**
     * prints the catList of all cats in list.
     */
    public void printGuestList() {
        System.out.println(this.hotelName);
        for (Cat temp : catList) {
            System.out.println(temp.toString());
        }
    }

}
