class MathConstants {

    public final double PI = 3.14159;
    public final void displayPI() {
        System.out.println("Value of PI: " + PI);
    }
}

class Circle extends MathConstants {

    public void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

}
public class main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.displayPI();
        circle.calculateArea(5.0);
    }
}