import java.util.Scanner;

class University {
    static String universityName;  
    String studentName;            

    public University(String studentName) {
        this.studentName = studentName;
    }

    static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
    }
}

public class uni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter university name: ");
        University.universityName = sc.nextLine();

        System.out.print("Enter the number of students: ");
        int num = sc.nextInt();
        sc.nextLine();  

        University[] students = new University[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            String studentName = sc.nextLine();
            students[i] = new University(studentName);
        }

        University.displayUniversityName();

        System.out.println("\nStudent List:");
        for (University student : students) {
            student.displayStudentInfo();
        }
    }
}