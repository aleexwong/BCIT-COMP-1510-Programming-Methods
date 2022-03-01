package ca.bcit.comp1510.lab11;

/**
 * Transaction of items.
 * @author Alex Wong a.wong555@bcit.ca
 * @version 1.0
 */
public class Transaction {
    
    /** Holds Item Array. */
    private Item[] cart;
    
    /** Holds the total price. */
    private double totalPrice;
    
    /** Holds the total number of items. */
    private int itemCount;
    
    /** Constructor 1.
     * @param n int rep of x items.
     */
    public Transaction(int n) {
        cart = new Item[n];
        totalPrice = 0.0;
        itemCount = 0;
    }
    
    /**
     * Accessor for total price.
     * @return double as total price
     */
    public double getTotalPrice() {
        return totalPrice;
    }
    
    /**
     * Add params to cart.
     * @param name String of item
     * @param price double of item
     * @param quantity int of item.
     */
    public void addToCart(String name, double price, int quantity) {
        Item item = new Item(name, price, quantity);
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = item;
        totalPrice += price * quantity;
        itemCount++;
    }
    
    /**
     * Adds an item to the cart.
     * @param item a Item object
     */
    public void addToCart(Item item) {
        if (itemCount == cart.length) {
            increaseSize();
        }
        cart[itemCount] = item;
        totalPrice += item.getPrice() * item.getQuantityPurchased();
        itemCount++;
    }
    
    /**
     * Increases the size of the cart array.
     */
    public void increaseSize() {
        final int addItems = 3;
        Item[] temp = new Item[cart.length + addItems];
        for (int i = 0; i < cart.length; i++) {
            temp[i] = cart[i];
        }
        cart = temp;
    }
    

    
    /**
     * Returns the total of all items.
     * @return double as total number of all items
     */
    public double getCount() {
        double sum = 0;
        for (Item item: cart) {
            sum += item.getQuantityPurchased();
        }
        return sum;
    }
    
    
    
    
    /**
     * Returns a String representation of this transaction.
     * @return String representation of this transaction.
     */
    public String toString() {
        String result = "";
        
        for (Item item: cart) {
            
            if (item != null) {
                result += item.getNameOfItem() + "\t" + item.getPrice() 
                    + "\t" + item.getQuantityPurchased() + "\n";
            }
            
        }
        result += "The total price is: " + getTotalPrice();
        
        return result;
    }
    
    
    
}
