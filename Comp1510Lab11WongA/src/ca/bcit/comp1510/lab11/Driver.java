package ca.bcit.comp1510.lab11;

/**
 * Drives program (Coin, Lockable).
 * @author Alex Wong a.wong555@bcit.ca
 * @version 1.0
 */
public class Driver {

    /**
     * Creates a Coin object and tries to lock and unlock.
     * @param args command line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("Create Coin and flip()");
        Coin coin = new Coin();
        
        
        System.out.println("Set the key.");
        final int key = 1997;
        coin.setKey(key);
        
        System.out.println("Flip again.");
        coin.flip();
        // coin is now locked so won't flip.
        System.out.println("Unlock and flip 10 times.");
        coin.unlock(key);
        
        final int flipNum = 10;
        for (int i = 0; i < flipNum; i++) {
            coin.flip();
            System.out.println(coin.toString());
        }
        
        System.out.println("Lock and flip again.");
        coin.lock(key);
        coin.flip();


    }

}
