// Abstract class representing a Shape
abstract class Shape {
    // Abstract method to calculate area (must be implemented in subclasses)
    abstract void calculateArea();
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    double length, width;

    // Constructor to initialize length and width
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override method to calculate area of a rectangle
    void calculateArea() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

// Circle class extending Shape
class Circle extends Shape {
    double radius;

    // Constructor to initialize radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Override method to calculate area of a circle
    void calculateArea() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

// Main class to test the implementation
public class ShapeDemo {
    public static void main(String[] args) {
        // Create objects of Rectangle and Circle
        Shape rect = new Rectangle(5, 4);
        Shape circle = new Circle(3);

        // Call calculateArea() on both objects
        rect.calculateArea();
        circle.calculateArea();
    }
}
