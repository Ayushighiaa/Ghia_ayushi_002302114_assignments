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
public class Department {
    
    
   
    private String deptName;
    private List<Course> courseCatalog = new ArrayList<>();
    private List<Instructor> facultyList = new ArrayList<>();
    private List<Student> enrolledStudents = new ArrayList<>();
    private SemesterSchedule semesterSchedule;

    public Department(String deptName) {
        this.deptName = deptName;
        this.semesterSchedule = new SemesterSchedule("Fall 2024");
    }

    public void addNewCourse(Course course) {
        courseCatalog.add(course);
    }

    public void addNewInstructor(Instructor instructor) {
        facultyList.add(instructor);
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayCourseCatalog() {
        System.out.println("Course Catalog for " + deptName + " Department:");
        for (Course course : courseCatalog) {
            System.out.println(course.getCourseDetails());
        }
    }

    public void printSemesterReport() {
        System.out.println("---- Semester Report ----");
        for (Student student : enrolledStudents) {
            System.out.println("Student: " + student.getFullName());
            double totalGrades = 0;
            for (Enrollment enrollment : student.getCoursesEnrolled()) {
                System.out.println("  Course: " + enrollment.getCourse().getCourseTitle() + 
                                   " | Instructor: " + enrollment.getInstructor().getInstructorName() + 
                                   " | Grade: " + enrollment.getGrade());
                totalGrades += enrollment.getGrade();
            }
            double averageGPA = totalGrades / student.getCoursesEnrolled().size();
            System.out.println("  GPA for the Semester: " + averageGPA);
            System.out.println("  Total Tuition: $" + student.calculateTotalTuition());
        }
    }


    
}
