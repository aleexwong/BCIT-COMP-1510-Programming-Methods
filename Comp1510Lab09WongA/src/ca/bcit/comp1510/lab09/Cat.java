package ca.bcit.comp1510.lab09;

/** Class Cat.
 * @author Wong Alex
 * @version march 31 , 2021.
 */
public class Cat {

    /**
     * defaults name "Cleo".
     */
    private String name;

    /**
     * holds the age of the cat.
     */
    private int age;
    
    /**
     * Constructor for Cat holds name and age.
     * 
     * @param name of the cat
     * @param age  can not be negative
     */
    public Cat(String name, int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
        if (name != null && name.trim().isEmpty()) {
            this.name = "Cleo";
        } else {
            this.name = name;
        }
    }
    
    /**
     * Constructor for Cat holds age.
     * 
     * @param age  can not be negative
     */
    public Cat(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
        this.name = "Cleo";
    }
    
    

    /**
     * Accessor.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * setter.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Accessor.
     * 
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * sets age of cat.
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * String sentence.
     * 
     * @return String rep of cat
     */
    public String toString() {
        return "Cat's name is " + name + ", age is " + age;
    }

}
