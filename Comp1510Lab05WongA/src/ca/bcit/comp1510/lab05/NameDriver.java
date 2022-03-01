/**
 * 
 */

package ca.bcit.comp1510.lab05;

/**
 * method of Name.
 * 
 * @author Wong Alex a.wong555@bcit.ca.
 * @version Feb 11.2021
 */
public class NameDriver {

    /**
     * Drives program.
     * 
     * @param args unused.
     */
    public static void main(String[] args) {

        Name name = new Name("Alex", "Party", "Wong");
        
        System.out.println(name.nameCount());
        
        System.out.println(name.stringIntitialFirstLetterOfName());
        
        System.out.println(name.getNthChar(1));
        
        System.out.println(name.fullName());
        
        System.out.println(name.isEquals("Alex"));
        
        System.out.println(name.isEqualstoName(name));
        
        


    }

}
