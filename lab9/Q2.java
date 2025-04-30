import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        
        System.out.print("Enter grade: ");
        char grade = scanner.next().charAt(0);
        
        try (FileWriter writer = new FileWriter("student.txt", true)) {
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            System.out.println("Student data successfully written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
        
        scanner.close();
    }
}
