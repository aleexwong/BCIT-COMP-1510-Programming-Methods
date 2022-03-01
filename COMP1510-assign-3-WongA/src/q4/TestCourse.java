package q4;

/**
 * <p>This is where you put your description about what this class does. You
 * don't have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.</p>
 *
 * @author Wong, Alex a.wong555@bcit.ca.
 * @version 1.0
 */
public class TestCourse {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        // create course object
        Course course = new Course("COMP 1510");
        
        Address addressHome = new Address("169 Party Ave",
                "Vancity", "BC", "V1S1S1");
        Address addressSchool = new Address("169 Party Ave",
                "Vancity", "BC", "V1S1S1");
        
        final int s1Score1 = 10;
        final int s1Score2 = 69;
        final int s1Score3 = 42;
        Student student1 = new Student("Alex", "Party", addressHome,
                addressSchool,s1Score1,s1Score2,s1Score3);
        
        final int s2Score1 = 100;
        final int s2Score2 = 69;
        final int s2Score3 = 42;
        Student student2 = new Student("Alex2", "Party", addressHome,
                addressSchool,s2Score1,s2Score2,s2Score3);
        
        final int s3Score1 = 10;
        final int s3Score2 = 69;
        final int s3Score3 = 42;
        Student student3 = new Student("Alex3", "Party", addressHome,
                addressSchool,s3Score1,s3Score2,s3Score3);
        
        final int s4Score1 = 100;
        final int s4Score2 = 69;
        final int s4Score3 = 42;
        Student student4 = new Student("Alex4", "Party", addressHome,
                addressSchool,s4Score1,s4Score2,s4Score3);
        
        final int s5Score1 = 100;
        final int s5Score2 = 69;
        final int s5Score3 = 42;
        Student student5 = new Student("Alex5", "Party", addressHome,
                addressSchool,s5Score1,s5Score2,s5Score3);
        
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        course.addStudent(student4);
        course.addStudent(student5);

        
        course.roll();
        System.out.println("Course Average " + course.average() + "%");
        
        
        

        
        // add several students
        
        
        
        // print a roll
        
        
        
        // print overall course test average
        
        
        
        System.out.println("Question four was called and ran sucessfully.");
    }

};
