/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitymodel;

/**
 *
 * @author ayushighia
 */
public class Course {
    
   
    private String courseTitle;
    private String courseCode;
    private int creditHours;
    private double tuitionFee;

    public Course(String title, String code, int credits, double fee) {
        this.courseTitle = title;
        this.courseCode = code;
        this.creditHours = credits;
        this.tuitionFee = fee;
    }

    public String getCourseTitle() { return courseTitle; }

    public double getTuitionFee() { return tuitionFee; }

    public String getCourseDetails() {
        return courseCode + ": " + courseTitle + " (" + creditHours + " credits) - $" + tuitionFee;
    }
}

    

