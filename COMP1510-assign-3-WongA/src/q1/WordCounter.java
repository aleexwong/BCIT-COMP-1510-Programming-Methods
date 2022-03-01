package q1;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * <p>
 * counts word from bible.txt.
 * </p>
 *
 * @author Alex Wong
 * @version 1.0
 */
public class WordCounter {

    /** adds word to a list uses Word class. */
    private ArrayList<Word> wordList = new ArrayList<Word>();

    /**
     * reads file and adds words to a list.
     * @param fileName String of fileName
     * @return int number of specific word.
     * @throws FileNotFoundException if file not found.
     */
    public int parseBook(String fileName) throws FileNotFoundException {

        // Takes bible from bible.txt
        File myFile = new File(fileName);

        // Scanner takes input of only myFile
        Scanner scan = new Scanner(myFile);

        // Word from class Word
        Word words;
        String theWords;
        boolean same;

        // while loop to read all words from text.
        while (scan.hasNext()) {
            theWords = scan.next().toLowerCase();
            same = false;

            for (Word myWord : wordList) {
                if (myWord.getWord().equals(theWords)) {
                    myWord.addOne();
                    same = true;
                    break;
                }
            }
            if (!same) {
                words = new Word(theWords);
                wordList.add(words);
            }
        }
        
        scan.close();
        
        return wordList.size();

    }

    /** return top 10 words of the text.
     * @param n is number of words. 
     */
    public void printTopWords(int n) {
        if (n <= 1 || n > wordList.size()) {
            throw new ArrayIndexOutOfBoundsException("The input for "
                    + "printTopWords must be between 0 and " 
                    + wordList.size());
        }
        
        
        wordList.sort(null);        
        for (int i = 0; i < n; i++) {
            System.out.println(wordList.get(i).toString());
        }
    }  

    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * </p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        WordCounter wordCount = new WordCounter();
        
        
        try {
            System.out.println("The total number of unique words: " 
                    + wordCount.parseBook("src/bible.txt"));
            
            // top 10 words
            final int n = 10;
            
            wordCount.printTopWords(n);
            
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found try again.");
            
        }
        
        // completed 
        System.out.println("Question one was called and ran sucessfully.");
    }

}
