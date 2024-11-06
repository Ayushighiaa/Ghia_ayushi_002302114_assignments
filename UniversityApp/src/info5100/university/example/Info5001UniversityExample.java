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
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    public static void main(String[] args) {
        // Initialize the Department
        Department department = new Department("Information Technology");

        // Course Catalog Management
        CourseCatalog courseCatalog = department.getCourseCatalog();
        Course mainCourse = courseCatalog.newCourse("Advanced Programming", "IT1010", 4);
        Course electiveA = courseCatalog.newCourse("Human-Computer Interaction", "IT2020", 4);
        Course electiveB = courseCatalog.newCourse("Machine Learning", "IT3030", 4);
        Course electiveC = courseCatalog.newCourse("Cloud Computing", "IT4040", 4);
        Course electiveD = courseCatalog.newCourse("Big Data Analytics", "IT5050", 4);
        Course electiveE = courseCatalog.newCourse("Cybersecurity Essentials", "IT6060", 4);

        // Faculty Directory Management
        FacultyDirectory facultyDirectory = department.getFacultyDirectory();
        FacultyProfile prof1 = facultyDirectory.newFacultyProfile(new Person("Dr. Sophia Williams"));
        FacultyProfile prof2 = facultyDirectory.newFacultyProfile(new Person("Dr. Jack Taylor"));
        FacultyProfile prof3 = facultyDirectory.newFacultyProfile(new Person("Dr. Olivia Harris"));
        FacultyProfile prof4 = facultyDirectory.newFacultyProfile(new Person("Dr. Liam Martin"));
        FacultyProfile prof5 = facultyDirectory.newFacultyProfile(new Person("Dr. Noah Clark"));
        FacultyProfile prof6 = facultyDirectory.newFacultyProfile(new Person("Dr. Mia Walker"));

        // Course Schedule Management for Spring 2025 Semester
        CourseSchedule courseSchedule = department.newCourseSchedule("Spring2025");
        createCourseOffers(courseSchedule, mainCourse, electiveA, electiveB, electiveC, electiveD, electiveE, prof1, prof2, prof3, prof4, prof5, prof6);

        // Student Directory and Registration
        Map<String, StudentProfile> students = registerStudents(department, courseSchedule, mainCourse, electiveA, electiveB, electiveC, electiveD, electiveE);

        // Set Faculty Ratings
        setFacultyRatings(courseSchedule);

        // Generate Semester Report
        generateSemesterReport(students, courseSchedule);

        // Calculate and display total department revenue
        int totalRevenue = department.calculateRevenuesBySemester("Spring2025");
        System.out.println("Total Department Earnings for Spring 2025: $" + totalRevenue);
    }

    private static void createCourseOffers(CourseSchedule courseSchedule, Course mainCourse, Course electiveA,
                                            Course electiveB, Course electiveC, Course electiveD, Course electiveE, FacultyProfile prof1,
                                            FacultyProfile prof2, FacultyProfile prof3, FacultyProfile prof4, FacultyProfile prof5, FacultyProfile prof6) {
        // Create course offers and assign faculty members
        CourseOffer offerMain = courseSchedule.newCourseOffer(mainCourse.getCOurseNumber());
        offerMain.AssignAsTeacher(prof1);
        offerMain.generatSeats(12);

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

        // Add course offers to the schedule
        courseSchedule.addCourseOffer(offerMain);
        courseSchedule.addCourseOffer(offerElectiveA);
        courseSchedule.addCourseOffer(offerElectiveB);
        courseSchedule.addCourseOffer(offerElectiveC);
        courseSchedule.addCourseOffer(offerElectiveD);
        courseSchedule.addCourseOffer(offerElectiveE);
    }

    private static Map<String, StudentProfile> registerStudents(Department department, CourseSchedule courseSchedule,
                                                                Course mainCourse, Course electiveA, Course electiveB, Course electiveC, Course electiveD, Course electiveE) {
        PersonDirectory personDirectory = department.getPersonDirectory();
        StudentDirectory studentDirectory = department.getStudentDirectory();
        Map<String, StudentProfile> students = new HashMap<>();

        for (int i = 1; i <= 8; i++) {
            Person person = personDirectory.newPerson("33333" + i);
            StudentProfile student = studentDirectory.newStudentProfile(person);
            students.put("Student" + i, student);

            // Course load for Spring 2025 semester
            CourseLoad courseLoad = student.newCourseLoad("Spring2025");

            // Assign courses to students
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(mainCourse.getCOurseNumber()));
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(electiveA.getCOurseNumber()));
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(electiveB.getCOurseNumber()));
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(electiveC.getCOurseNumber()));
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(electiveD.getCOurseNumber()));
            courseLoad.newSeatAssignment(courseSchedule.getCourseOfferByNumber(electiveE.getCOurseNumber()));
        }
        return students;
    }

    private static void setFacultyRatings(CourseSchedule courseSchedule) {
        CourseOffer[] courseOffers = courseSchedule.getAllCourseOffers();

        // Debugging information
        System.out.println("Total Available Course Offers: " + courseOffers.length);

        if (courseOffers.length > 0 && courseOffers[0].getFacultyProfile() != null) {
            FacultyAssignment assignment1 = courseOffers[0].getFacultyProfile().getFacultyAssignment();
            if (assignment1 != null) {
                assignment1.setProfRating(4.8); // For main course
            }
        }

        if (courseOffers.length > 1 && courseOffers[1].getFacultyProfile() != null) {
            FacultyAssignment assignment2 = courseOffers[1].getFacultyProfile().getFacultyAssignment();
            if (assignment2 != null) {
                assignment2.setProfRating(4.2); // For elective courses
            }
        } else {
            System.out.println("Not enough course offers available.");
        }
    }

    private static void generateSemesterReport(Map<String, StudentProfile> students, CourseSchedule courseSchedule) {
        System.out.println("=== Spring 2025 Semester Summary ===");

        for (StudentProfile student : students.values()) {
            System.out.println("Student ID: " + student.getPerson().getPersonId());
            System.out.println("Courses Enrolled:");
            CourseLoad courseLoad = student.getCourseLoadBySemester("Spring2025");
            double totalCredits = 0.0;
            double totalGradePoints = 0.0;

            // Calculate grades and GPA
            for (CourseOffer courseOffer : courseSchedule.getAllCourseOffers()) {
                System.out.println(" - " + courseOffer.getSubjectCourse().getCourseName());
                System.out.println("   Instructor: " + courseOffer.getFacultyProfile());

                // Simulating grade calculation
                double grade = Math.random() * 4; // Random grade between 0 and 4
                System.out.println("   Grade: " + grade);
                totalCredits += courseOffer.getSubjectCourse().getCredits();
                totalGradePoints += grade * courseOffer.getSubjectCourse().getCredits();
            }

            double gpa = totalCredits == 0 ? 0 : totalGradePoints / totalCredits;
            System.out.println("Overall GPA for Semester: " + gpa);

            // Calculate Tuition Fees (Assume $1500 per credit)
            double tuitionFees = totalCredits * 1500;
            System.out.println("Tuition Fees for Student ID " + student.getPerson().getPersonId() + ": $" + tuitionFees);
        }
    }
}
