package OOP_LAB_3;

public class Course {
    String courseCode;
    String courseName;
    int creditHours;

    // Default constructor
    Course(){

    }
    // Parameterized Constructor
    Course(String code, String name, int hours) {
        this.courseCode = code;
        this.courseName = name;
        this.creditHours = hours;
    }

    // Method to display
    void displayCourse() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Course c1 = new Course("CS101", "Programming Fundamentals", 3);
        Course c2 = new Course("C1004", "Object Oriented Programming", 3);

        c1.displayCourse();
        c2.displayCourse();
    }
}