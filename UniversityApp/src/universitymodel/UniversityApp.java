/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universitymodel;

/**
 *
 * @author ayushighia
 */
public class UniversityApp {
    
    
    public static void main(String[] args) {
        Department compSciDept = new Department("Computer Science");

        // Adding Instructors
        Instructor instructor1 = new Instructor("Dr. Emma Lewis", "I101");
        Instructor instructor2 = new Instructor("Dr. John Brown", "I102");
        compSciDept.addNewInstructor(instructor1);
        compSciDept.addNewInstructor(instructor2);

        // Adding Courses
        Course dataStructures = new Course("Data Structures", "CS201", 3, 1500);
        Course algorithms = new Course("Algorithms", "CS202", 3, 1500);
        Course machineLearning = new Course("Machine Learning", "CS301", 3, 1800);
        Course databases = new Course("Databases", "CS204", 3, 1500);
        Course computerNetworks = new Course("Computer Networks", "CS205", 3, 1500);
        compSciDept.addNewCourse(dataStructures);
        compSciDept.addNewCourse(algorithms);
        compSciDept.addNewCourse(machineLearning);
        compSciDept.addNewCourse(databases);
        compSciDept.addNewCourse(computerNetworks);

        // Enrolling Students
        Student alice = new Student("Alice Johnson", "S101");
        Student bob = new Student("Bob Smith", "S102");
        compSciDept.enrollStudent(alice);
        compSciDept.enrollStudent(bob);

        // Register Students for Courses
        alice.enrollInCourse(dataStructures, instructor1);
        alice.enrollInCourse(algorithms, instructor2);
        bob.enrollInCourse(dataStructures, instructor1);
        bob.enrollInCourse(computerNetworks, instructor2);

        // Display Course Catalog
        compSciDept.displayCourseCatalog();

        // Print Semester Report
        compSciDept.printSemesterReport();
    }


    
}
