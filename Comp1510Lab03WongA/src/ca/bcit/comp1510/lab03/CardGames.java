/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * Card Games.
 * @author Wong, Alex a.wong555@bcit.ca.
 * @version 01-25-2021
 */

public class CardGames {
    
    /** 
     * Rank enumeration Ace to King.
     */
    enum Rank {
        /** Ace. */
        ACE,
        
        /** Two. */
        TWO,
        
        /** Three. */
        THREE,
        
        /** Four. */
        FOUR,
        
        /** Five. */
        FIVE,
        
        /** Six. */
        SIX, 
        
        /** Seven. */
        SEVEN,
        
        /** Eight. */
        EIGHT,
        
        /** Nine. */
        NINE,
        
        /** Ten. */
        TEN,
        
        /** Jack. */
        JACK,
        
        /** Queen. */
        QUEEN,
        
        /** King. */
        KING
    }
    
    /** 
    * Suits Enumeration Hearts Diamond Club Spades.
    */
    enum Suit { 
        /** Hearts. */
        HEARTS,
        /** Diamonds. */
        DIAMONDS,
        /** Clubs. */
        CLUBS,
        /** Spades. */
        SPADES 
    }
    
    
    /**
     * Random cards selector.
     * @param args unused
     */
    public static void main(String[] args) {
        
        Random generator = new Random();
        
        int randomRankChoice = generator.nextInt(Rank.values().length);
        
        int randomSuitChoice = generator.nextInt(Suit.values().length);
        
        Rank randomRank = Rank.values()[randomRankChoice];
        
        Suit randomSuit = Suit.values()[randomSuitChoice];
        
        System.out.println("The random card is " 
                + randomRank + " of " + randomSuit);
        
        
    }

}
