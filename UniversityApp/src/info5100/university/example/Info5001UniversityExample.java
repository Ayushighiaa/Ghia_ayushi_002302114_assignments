package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.HashMap;
import java.util.Map;

/**
 * Main class to simulate a university system where we can manage various entities like 
 * courses, students, faculty, and departments. This program will set up a sample university 
 * department, course catalog, student enrollments, faculty assignments, and generate a report 
 * of student grades and tuition fees for a specific semester.
 * 
 * Author: kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * The main entry point for the simulation.
     * 
     * This method sets up the university system by:
     * 1. Initializing a department (Information Technology).
     * 2. Managing the course catalog to create core and elective courses.
     * 3. Creating a faculty directory and assigning faculty to courses.
     * 4. Managing the course schedule for the Spring 2025 semester.
     * 5. Registering students, assigning them courses, and calculating their tuition.
     * 6. Setting faculty ratings for courses.
     * 7. Generating a semester report with grades and tuition fees for each student.
     * 8. Calculating the total revenue for the department.
     */
    public static void main(String[] args) {
        // Step 1: Initialize the Department
        Department department = new Department("Information Technology");

        // Step 2: Course Catalog Management
        CourseCatalog courseCatalog = department.getCourseCatalog();
        
        // Add core and elective courses to the catalog
        Course mainCourse = courseCatalog.newCourse("Advanced Programming", "IT1010", 4);
        Course electiveA = courseCatalog.newCourse("Human-Computer Interaction", "IT2020", 4);
        Course electiveB = courseCatalog.newCourse("Machine Learning", "IT3030", 4);
        Course electiveC = courseCatalog.newCourse("Cloud Computing", "IT4040", 4);
        Course electiveD = courseCatalog.newCourse("Big Data Analytics", "IT5050", 4);
        Course electiveE = courseCatalog.newCourse("Cybersecurity Essentials", "IT6060", 4);

        // Step 3: Faculty Directory Management
        FacultyDirectory facultyDirectory = department.getFacultyDirectory();

        // Create faculty profiles for teaching the courses
        FacultyProfile prof1 = facultyDirectory.newFacultyProfile(new Person("Dr. Sophia Williams"));
        FacultyProfile prof2 = facultyDirectory.newFacultyProfile(new Person("Dr. Jack Taylor"));
        FacultyProfile prof3 = facultyDirectory.newFacultyProfile(new Person("Dr. Olivia Harris"));
        FacultyProfile prof4 = facultyDirectory.newFacultyProfile(new Person("Dr. Liam Martin"));
        FacultyProfile prof5 = facultyDirectory.newFacultyProfile(new Person("Dr. Noah Clark"));
        FacultyProfile prof6 = facultyDirectory.newFacultyProfile(new Person("Dr. Mia Walker"));

        // Step 4: Course Schedule Management for Spring 2025 Semester
        CourseSchedule courseSchedule = department.newCourseSchedule("Spring2025");

        // Create and assign faculty to course offers for the semester
        createCourseOffers(courseSchedule, mainCourse, electiveA, electiveB, electiveC, electiveD, electiveE, prof1, prof2, prof3, prof4, prof5, prof6);

        // Step 5: Student Directory and Registration
        Map<String, StudentProfile> students = registerStudents(department, courseSchedule, mainCourse, electiveA, electiveB, electiveC, electiveD, electiveE);

        // Step 6: Set Faculty Ratings
        setFacultyRatings(courseSchedule);

        // Step 7: Generate Semester Report
        generateSemesterReport(students, courseSchedule);

        // Step 8: Calculate and display total department revenue for the semester
        int totalRevenue = department.calculateRevenuesBySemester("Spring2025");
        System.out.println("Total Department Earnings for Spring 2025: $" + totalRevenue);
    }

    /**
     * This method creates course offers for the given courses and assigns faculty to each 
     * offer for the Spring 2025 semester. It also generates seat assignments for each 
     * course offer.
     *
     * @param courseSchedule The course schedule for the semester.
     * @param mainCourse The core course to be offered.
     * @param electiveA, electiveB, electiveC, electiveD, electiveE The elective courses to be offered.
     * @param prof1, prof2, prof3, prof4, prof5, prof6 The faculty members assigned to teach each course.
     */
    private static void createCourseOffers(CourseSchedule courseSchedule, Course mainCourse, Course electiveA,
                                            Course electiveB, Course electiveC, Course electiveD, Course electiveE, FacultyProfile prof1,
                                            FacultyProfile prof2, FacultyProfile prof3, FacultyProfile prof4, FacultyProfile prof5, FacultyProfile prof6) {
        // Create course offers and assign faculty members
        CourseOffer offerMain = courseSchedule.newCourseOffer(mainCourse.getCOurseNumber());
        offerMain.AssignAsTeacher(prof1);
        offerMain.generatSeats(12);  // Generate 12 seats for the course

        // Similarly, create offers for each elective course and assign faculty
        CourseOffer offerElectiveA = courseSchedule.newCourseOffer(electiveA.getCOurseNumber());
        offerElectiveA.AssignAsTeacher(prof2);
        offerElectiveA.generatSeats(12);

        CourseOffer offerElectiveB = courseSchedule.newCourseOffer(electiveB.getCOurseNumber());
        offerElectiveB.AssignAsTeacher(prof3);
        offerElectiveB.generatSeats(12);

        CourseOffer offerElectiveC = courseSchedule.newCourseOffer(electiveC.getCOurseNumber());
        offerElectiveC.AssignAsTeacher(prof4);
        offerElectiveC.generatSeats(12);

        CourseOffer offerElectiveD = courseSchedule.newCourseOffer(electiveD.getCOurseNumber());
        offerElectiveD.AssignAsTeacher(prof5);
        offerElectiveD.generatSeats(12);

        CourseOffer offerElectiveE = courseSchedule.newCourseOffer(electiveE.getCOurseNumber());
        offerElectiveE.AssignAsTeacher(prof6);
        offerElectiveE.generatSeats(12);

        // Add all course offers to the schedule
        courseSchedule.addCourseOffer(offerMain);
        courseSchedule.addCourseOffer(offerElectiveA);
        courseSchedule.addCourseOffer(offerElectiveB);
        courseSchedule.addCourseOffer(offerElectiveC);
        courseSchedule.addCourseOffer(offerElectiveD);
        courseSchedule.addCourseOffer(offerElectiveE);
    }

    /**
     * This method registers students in the department and assigns them courses for the 
     * Spring 2025 semester. Each student will be assigned the core course and all elective courses.
     * 
     * @param department The department that the students belong to.
     * @param courseSchedule The course schedule for the semester.
     * @param mainCourse, electiveA, electiveB, electiveC, electiveD, electiveE The courses the students will enroll in.
     * @return A map of student IDs and their respective student profiles.
     */
    private static Map<String, StudentProfile> registerStudents(Department department, CourseSchedule courseSchedule,
                                                                Course mainCourse, Course electiveA, Course electiveB, Course electiveC, Course electiveD, Course electiveE) {
        PersonDirectory personDirectory = department.getPersonDirectory();
        StudentDirectory studentDirectory = department.getStudentDirectory();
        Map<String, StudentProfile> students = new HashMap<>();

        // Register 8 students, assign each student to a unique ID and course load
        for (int i = 1; i <= 8; i++) {
            Person person = personDirectory.newPerson("33333" + i);
            StudentProfile student = studentDirectory.newStudentProfile(person);
            students.put("Student" + i, student);

            // Create a course load for each student for the Spring 2025 semester
            CourseLoad courseLoad = student.newCourseLoad("Spring2025");

            // Assign each student to the courses in the course schedule
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(mainCourse.getCOurseNumber()));
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(electiveA.getCOurseNumber()));
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(electiveB.getCOurseNumber()));
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(electiveC.getCOurseNumber()));
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(electiveD.getCOurseNumber()));
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(electiveE.getCOurseNumber()));
        }
        return students;
    }

    /**
     * This method sets faculty ratings for the courses offered in the Spring 2025 semester.
     * Faculty ratings are based on student feedback or instructor performance metrics.
     * For the simulation, a fixed rating is assigned.
     * 
     * @param courseSchedule The course schedule that contains the course offers.
     */
    private static void setFacultyRatings(CourseSchedule courseSchedule) {
        CourseOffer[] courseOffers = courseSchedule.getAllCourseOffers();

        // Debugging information: print the total available course offers
        System.out.println("Total Available Course Offers: " + courseOffers.length);

        // Assign ratings to faculty if courses exist
        if (courseOffers.length > 0 && courseOffers[0].getFacultyProfile() != null) {
            FacultyAssignment assignment1 = courseOffers[0].getFacultyProfile().getFacultyAssignment();
            if (assignment1 != null) {
                assignment1.setProfRating(4.8); // Rating for the main course
            }
        }

        if (courseOffers.length > 1 && courseOffers[1].getFacultyProfile() != null) {
            FacultyAssignment assignment2 = courseOffers[1].getFacultyProfile().getFacultyAssignment();
            if (assignment2 != null) {
                assignment2.setProfRating(4.2); // Rating for the elective courses
            }
        } else {
            System.out.println("Not enough course offers available.");
        }
    }

    /**
     * This method generates a summary report for the Spring 2025 semester, which includes:
     * 1. The courses each student is enrolled in.
     * 2. Simulated grades for each student.
     * 3. The overall GPA based on the courses and grades.
     * 4. The tuition fees for each student based on the number of credits enrolled.
     * 
     * @param students A map of student IDs and their respective student profiles.
     * @param courseSchedule The course schedule containing course offers and their details.
     */
    private static void generateSemesterReport(Map<String, StudentProfile> students, CourseSchedule courseSchedule) {
        System.out.println("=== Spring 2025 Semester Summary ===");

        // Iterate over each student and generate their semester report
        for (StudentProfile student : students.values()) {
            System.out.println("Student ID: " + student.getPerson().getPersonId());
            System.out.println("Courses Enrolled:");

            CourseLoad courseLoad = student.getCourseLoadBySemester("Spring2025");
            double totalCredits = 0.0;
            double totalGradePoints = 0.0;

            // For each course the student is enrolled in, calculate grades and GPA
            for (CourseOffer courseOffer : courseSchedule.getAllCourseOffers()) {
                System.out.println(" - " + courseOffer.getSubjectCourse().getCourseName());
                System.out.println("   Instructor: " + courseOffer.getFacultyProfile());

                // Simulate a grade for the student (random grade between 0 and 4)
                double grade = Math.random() * 4; 
                System.out.println("   Grade: " + grade);

                totalCredits += courseOffer.getSubjectCourse().getCredits();
                totalGradePoints += grade * courseOffer.getSubjectCourse().getCredits();
            }

            // Calculate GPA (Grade Point Average) for the student
            double gpa = totalCredits == 0 ? 0 : totalGradePoints / totalCredits;
            System.out.println("Overall GPA for Semester: " + gpa);

            // Calculate Tuition Fees based on total credits enrolled (assuming $1500 per credit)
            double tuitionFees = totalCredits * 1500;
            System.out.println("Tuition Fees for Student ID " + student.getPerson().getPersonId() + ": $" + tuitionFees);
        }
    }
}
