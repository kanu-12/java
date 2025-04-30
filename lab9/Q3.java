import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q3 {
    public static void main(String[] args) {
        File file = new File("student.txt");
        
        try (FileReader fileReader = new FileReader(file); BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file 'student.txt' was not found.");
        } catch (IOException e) {
            System.out.println("Error: An error occurred while reading the file.");
        }
    }
}
