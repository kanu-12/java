import java.io.*;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        
        File file = new File(fileName);
        int wordCount = 0;
        int charCount = 0;
        
        try (FileReader fileReader = new FileReader(file); BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                wordCount += (line.trim().isEmpty()) ? 0 : words.length;
                charCount += line.replaceAll("\\s", "").length();
            }
            
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding whitespace): " + charCount);
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file does not exist.");
        } catch (IOException e) {
            System.out.println("Error: An error occurred while reading the file.");
        }
        
        scanner.close();
    }
}
