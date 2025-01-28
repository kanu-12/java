import java.util.Scanner;

public class method {

    public static double area(double side) {
       
        return side * side;
    }

    public static double area(double length, double width) {
       
        return length * width;
    }

    public static double area(double radius) {
       
        return Math.PI * radius * radius;
    }

    public static double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose shape:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter side of square: ");
                double side = scanner.nextDouble();
                System.out.println("Area of square: " + area(side));
                break;
            case 2:
                System.out.print("Enter length of rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of rectangle: ");
                double width = scanner.nextDouble();
                System.out.println("Area of rectangle: " + area(length, width));
                break;
            case 3:
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of circle: " + area(radius));
                break;
            case 4:
                System.out.print("Enter base of triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = scanner.nextDouble();
                System.out.println("Area of triangle: " + area(base, height));
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}