package q3;

/**
 * <p>Student tests.</p>
 *
 * @author Wong Alex a.wong555@bcit.ca.
 * @version March 22, 2021
 */
public class TestStudent {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        // method 1
        // Address takes 4 strings
        // street , city , prov , postal code
        Address student1Add = new Address("420 lol ave",
                "van", "bc", "v1s1s1");
        
        Address student1SchAdd = new Address("6565 lol ave",
                "vancity", "bca", "1c1vs3");
        
        final int testScore1S1 = 79;
        final int testScore2S1 = 80;
        final int testScore3S1 = 69;
        
        Student student1 = new Student("Alex", "Party", 
                student1Add,
                student1SchAdd, 
                testScore1S1,
                testScore2S1, 
                testScore3S1);
        
        
        System.out.println("First student: " + student1.toString());
        
        
        
        
        
        // method 2
        Student student2 = new Student();
        
        
        System.out.println("Before:");
        System.out.println("Second student : " + student2.toString());
        
        final int first = 1;
        final int second = 2;
        final int third = 3;
        
        final int testScore1S2 = 95;
        final int testScore2S2 = 10;
        final int testScore3S2 = 80;
        
        student2.setTestScore(first, testScore1S2);
        student2.setTestScore(second, testScore2S2);
        student2.setTestScore(third, testScore3S2);
        
        System.out.println("After : ");
        System.out.println("Second student : " + student2.toString());
        
        System.out.println("Question three was called and ran sucessfully.");
    }
}




