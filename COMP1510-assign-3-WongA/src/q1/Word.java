


package q1;


/**
 * method used in word counter.
 * @author Wong, Alex a.wong555@bcit.ca.
 * @version 1.0
 */
public class Word implements Comparable<Word> {
    /** Holds the word. */
    private final String word;
    
    /** Holds the frequency. */
    private int frequency;

    /**
     * Constructs a word object by defining the word.
     * @param word string word
     */
    public Word(String word) {
        this.word = word;
        frequency = 1;
    }

    /**
     * accessor the word.
     * @return String as the word
     */
    public String getWord() {
        return word;
    }

    /**
     * accessor for the word frequency.
     * @return int for frequency
     */
    public int getFrequency() {
        return frequency;
    }
    
    /**
     * Adds 1 to freq.
     */
    public void addOne() {
        frequency++;
    }

    /**
     * Returns a String representation of this Word.
     * @return String representation of this Word.
     */
    public String toString() {
        return word + " : " + frequency;
    }
    
    /**
     * Compare word with other word.
     * @param other a string for word
     * @return  an int larger smaller and equals to word frequency
     */
    public int compareTo(Word other) {
        // need place holder for both words to compare to.

        /*
         * Integer firstWord = Integer.valueOf
         * (this.getFrequency()); Integer secondWord
         * = Integer.valueOf(other.getFrequency());
         * 
         * return secondWord.compareTo(firstWord);
         */
        if (this.frequency > other.getFrequency()) {
            return -1;
        } else if (this.frequency < other.getFrequency()) {
            return 1;
        } else {
            return 0;
        }
    }

     
}
    
    
    
    
    
    
    

    
