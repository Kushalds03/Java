public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;
    String[] enrolledStudents;

    // Constructor
    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    // Static method to set max capacity
    static void setMaxCapacity(int maxCap) {
        Course.maxCapacity = maxCap;
    }

    // Enroll a student (method renamed to avoid conflict)
    void enrollStudent(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
            System.out.println(studentName + " enrolled successfully.");
        } else {
            System.out.println("Course is full. Cannot enroll " + studentName);
        }
    }

    // Unenroll a student (basic version)
    void unenrollStudent(String studentName) {
        System.out.println(studentName + " removed from course.");
        enrollments--;
        // To fully remove from array: you'd have to search and shift, which can be added if needed
    }

    // Main method
    public static void main(String[] args) {
        Course myCourse = new Course("DBMS");
        myCourse.enrollStudent("Kushal");
        myCourse.enrollStudent("Ram");

        myCourse.unenrollStudent("Ram");

        System.out.println("Total Enrolled: " + myCourse.enrollments);
    }
}