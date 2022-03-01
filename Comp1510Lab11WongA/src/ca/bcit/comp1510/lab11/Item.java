package ca.bcit.comp1510.lab11;


/**
 * Item in the store.
 * @author Alex Wong a.wong555@bcit.ca
 * @version 1.0
 */
public class Item {
    
    /**
     * hold String name of item. 
     */
    private String nameOfItem;
    
    /**
     * hold prices  of item.
     */
    private double price;
    
    /**
     * holds int quantity purscahsed.
     */
    private int quantityPurchased;
    
    
    /** Constructor 1 for item.
     * @param item String name of item
     * @param priceOfitem price of it
     * @param quantity int how many bought
     */
    public Item(String item, double priceOfitem, int quantity) {
        this.nameOfItem = item;
        this.price = priceOfitem;
        this.quantityPurchased = quantity;
    }
    
    /** Constructor 2 for item.
     * @param item String name of item
     * @param priceOfitem price of it.
     */
    public Item(String item, double priceOfitem) {
        this.nameOfItem = item;
        this.price = priceOfitem;
        this.quantityPurchased = 1;
    }
        
    /** accessor for name.
     * @return the nameOfItem
     */
    public String getNameOfItem() {
        return nameOfItem;
    }

    /** accessor for price.
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /** accessor for quantity of items purchased.
     * @return the quantityPurchased
     */
    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    /**
     * Returns a String representation of this item.
     * @return String representation of this item.
     */
    public String toString() {
        return "The item name is " + nameOfItem + ". " 
                + "The price is " + price + ". " 
                + "The quantity is " + quantityPurchased + ". ";
    }
    
}
