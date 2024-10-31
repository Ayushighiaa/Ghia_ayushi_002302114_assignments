/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitymodel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ayushighia
 */
public class Student {
    


    private String fullName;
    private String studentID;
    private List<Enrollment> coursesEnrolled = new ArrayList<>();

    public Student(String name, String id) {
        this.fullName = name;
        this.studentID = id;
    }

    public void enrollInCourse(Course course, Instructor instructor) {
        coursesEnrolled.add(new Enrollment(this, course, instructor));
    }

    public List<Enrollment> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public double calculateTotalTuition() {
        double total = 0;
        for (Enrollment enrollment : coursesEnrolled) {
            total += enrollment.getCourse().getTuitionFee();
        }
        return total;
    }

    public String getFullName() { return fullName; }
}

    

