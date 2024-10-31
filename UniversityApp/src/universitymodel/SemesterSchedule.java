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
public class SemesterSchedule {
    
    
    
    private String semesterName;
    private List<Enrollment> classSchedule = new ArrayList<>();

    public SemesterSchedule(String semesterName) {
        this.semesterName = semesterName;
    }

    public void addClass(Enrollment enrollment) {
        classSchedule.add(enrollment);
    }

    public List<Enrollment> getClassSchedule() {
        return classSchedule;
    }

    public String getSemesterName() { return semesterName; }
}

    

