package ca.bcit.comp1510.lab09;

/**
 * Runs Coin flips.
 * @author Wong Alex
 * @version March 29,2021.
 */
public class CoinRunner {

    /**
     * Create coin flips 100 times and longest Heads consectitively.
     * 
     * @param args unused
     */
    public static void main(String[] args) {

        // create new coin
        Coin newCoin = new Coin();

        // make for loop flip 100 times
        final int flips = 100;
        int count = 0;
        int counting = 0;

        for (int i = 1; i <= flips; i++) {
            newCoin.flip();
            System.out.println(newCoin.toString());

            if (newCoin.isHeads()) {
                count++;
            }
            if (!newCoin.isHeads() || i == flips) {
                if (count > counting) {
                    counting = count;
                }
                // resets count to continue counting til hitting flip (100).
                count = 0;
            }
        }

        System.out.println("The longest run of heads is " + counting);

    }

}
