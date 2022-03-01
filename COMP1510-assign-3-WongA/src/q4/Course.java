
package q4;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Create courses for students.
 * @author Wong, Alex a.wong555@bcit.ca.
 * @version 1.0
 */
public class Course {
    
    /**
     *  holds the name of the course.
     */
    private String courseName;
    
    /** holds student object in an ArrayList.
     */
    private ArrayList<Student> studentList = new ArrayList<Student>();
    
    /** constuctor for Course.
     * 
     * @param name for courseName
     */
    public Course(String name) {
        this.courseName = name;
        
    }
    
    
    /**
     * Adds student object to courseList max 5.
     * @param students student added to List
     */
    public void addStudent(Student students) {
        final int maxStudentList = 6;
        
        if (studentList.size() > maxStudentList) {
            throw new IllegalArgumentException("max 5 students per Course");
            
        } else {
            
            studentList.add(students);
        }
    }
    
    /** adds all grades from studentList and then pass it.
     * @return average score for the course
     */
    public double average() {
        DecimalFormat decimal = new DecimalFormat("#.##");

        final double numberOfStudents = studentList.size();
        double totalGrade = 0.0;
        
        for (Student grades: studentList) {
            totalGrade += grades.average();
        }
        if (studentList.size() == 0) {
            return 0.0;   
        } else {
            return Double.parseDouble(
                    (decimal.format(totalGrade / numberOfStudents)));
        }
                             
    }
    
    /**
     * Prints out all students enrolled in course.
     */
    public void roll() {
        if (studentList.size() > 0) {
            System.out.println("Students enrolled in: " + courseName);
            for (Student list: studentList) {
                
                System.out.println("Student Name " + (studentList.indexOf(list)
                    + 1));

                System.out.println(list.toString());
                
            } 
        } else {
            System.out.println("Course has 0 students");
        }
    }
    
    
    
    
    
    
    
    
    

}
