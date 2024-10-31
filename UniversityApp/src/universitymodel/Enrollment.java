/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitymodel;

/**
 *
 * @author ayushighia
 */
public class Enrollment {
    
    private Student student;
    private Course course;
    private Instructor instructor;
    private double grade;

    public Enrollment(Student student, Course course, Instructor instructor) {
        this.student = student;
        this.course = course;
        this.instructor = instructor;
        this.grade = Math.random() * 4; // Assigns a random GPA for demonstration
    }

    public Student getStudent() { return student; }
    public Course getCourse() { return course; }
    public Instructor getInstructor() { return instructor; }
    public double getGrade() { return grade; }
    
}
