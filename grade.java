import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in subject 1: ");
        double subject1 = sc.nextDouble();

        System.out.print("Enter marks in subject 2: ");
        double subject2 = sc.nextDouble();

        System.out.print("Enter marks in subject 3: ");
        double subject3 = sc.nextDouble();

        double average = (subject1 + subject2 + subject3) / 3;

        String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Final Grade: " + grade);

        sc.close();
    }
}
