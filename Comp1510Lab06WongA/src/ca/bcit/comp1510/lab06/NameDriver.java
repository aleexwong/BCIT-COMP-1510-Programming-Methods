/**
 * 
 */
package ca.bcit.comp1510.lab06;

/**
 * @author Wong Alex a.wong555@bcit.ca.
 * @version Feb 11.2021
 */
public class NameDriver {

    /**
     * <p>Drives the program.</p>
     *
     * @param args unused.
     */
    public static void main(String[] args) {

        Name name = new Name("Alex", "Party", "Wong");
        
        Name noFName = new Name("   ", "PARTYY", "wong");
        Name noMName = new Name("alex", " ", "wong");
        Name noLName = new Name("alex", "PARTY", " ");

        System.out.println(name);        
        System.out.println(noFName);
        System.out.println(noMName);
        System.out.println(noLName);
        
        System.out.println("Original name: " + name); 
        name.setfName(" ");
        name.setmName("  ");
        name.setlName("BOBBY SAGGET");
        System.out.println("New name: " + name); 
                
        
        // RETURNS NTH OF NAME LENGTH
        final int nth1 = 1;        
        System.out.println("nth: " + nth1);
        System.out.println("getNCharacter method return: " 
                + name.getNthChar(nth1));
        
        // MORE NTH THAN NAME LENGTH MEANS RETURNS @
        final int nth2 = 99;
        System.out.println("nth: " + nth2);
        System.out.println("getNthChar method return: " 
                + name.getNthChar(nth2));

    }

}
