package ca.bcit.comp1510.lab11;

/**
 * Represents a two-sided coin that can be flipped.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Coin {
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;

    /** Coin's current face showing. */
    private int face;
    
    /** key for the lock. */
    private int key;
    
    /** coin locked. */
    private boolean locked = true;

    /**
     * Constructs a Coin object and flips it to give it a starting value.
     */
    public Coin() {
        flip();
    }

    /**
     * Flips this Coin by randomly choosing a face value.
     */
    public void flip() {
        face = (int) (Math.random() * 2);
    }

    /**
     * Returns true if the current face of the Coin is heads.
     * @return true if current face is heads, else false.
     */
    public boolean isHeads() {
        return face == HEADS;
    }

    /**
     * Returns the current face value of this Coin as a String.
     * @return toString description
     */
    public String toString() {
        String faceName;

        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }
        
        return faceName;
    }
    
    
    /**
     * Set the key.
     * @param key a integer for the key
     */
    public void setKey(int key) {
        this.key = key;
    }

    
    /**
     * Locks this coin.
     * @param theKey a int for the key
     * @return boolean if coin is locked
     */
    public boolean lock(int theKey) {
        if (theKey == this.key) {
            locked = true;
            return true;
        }
        return false;
    }

    /**
     * Unlocks this coin.
     * @param theKey a integer for the key
     * @return boolean if coin is unlocked
     */
    public boolean unlock(int theKey) {
        if (theKey == this.key) {
            locked = false;
            return true;
        }
        return false;
    }

    
    /**
     * coin is locked.
     * @return boolean if this coin is locked.
     */
    public boolean locked() {
        return locked;

    }
    
}

