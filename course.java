import java.util.Scanner;

class Course {
    private String courseName;
    private String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void displayCourseDetails() {
        System.out.println("\nCourse Details:");
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}

public class course {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Course Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course Code: ");
        String code = sc.nextLine();

        Course course = new Course(name, code);

        course.displayCourseDetails();

        sc.close();
    }
}
