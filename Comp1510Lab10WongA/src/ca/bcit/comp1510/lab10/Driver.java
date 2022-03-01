package ca.bcit.comp1510.lab10;

import java.util.ArrayList;

/**
 * Driver class to test for Name methods.
 * 
 * @author Wong Alex
 * @version April 8 2021.
 */
public class Driver {

    /**
     * Drives the Program.
     * @param args unused.
     */
    public static void main(String[] args) {
        
        // different middles names.
        Name name1 = new Name("alex", "party", "wong");
        Name name2 = new Name("alex", "party", "wong");
        
        Name name3 = new Name("alex", "part", "wong");
        Name name4 = new Name("alex", "part", "wong");
        
        Name name5 = new Name("alex", "parties", "wong");
        
        // different first names.
        Name name7 = new Name("Talex", "party", "wong");
        Name name8 = new Name("Aalex", "party", "wong");
        
        // different last names.
        Name name10 = new Name("alex", "party", "Bong");
        Name name11 = new Name("alex", "party", "Jong");
        
        // no middle name
        Name name13 = new Name("Aalex", "wong");
        Name name14 = new Name("Balex", "wong");
        
        ArrayList<Name> nameList = new ArrayList<Name>();
        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name3);
        nameList.add(name4);
        nameList.add(name5);
        nameList.add(name7);
        nameList.add(name8);
        nameList.add(name10);
        nameList.add(name11);
        nameList.add(name13);
        nameList.add(name14);


        System.out.println("Before~");
        for (Name names: nameList) {
            System.out.println(names.getFirstName() 
                    + " " + names.getMiddleName() 
                    + " " + names.getLastName());
        }
        
        nameList.sort(null);
        
        
        System.out.println("After~");
        for (Name names: nameList) {
            System.out.println(names.getFirstName() 
                    + " " + names.getMiddleName() 
                    + " " + names.getLastName());
        }
        
        


    }

}
