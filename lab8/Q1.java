package lab8;
class DivisionByZeroException extends ArithmeticException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

class Calculator {
    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Error: Division by zero is not allowed.");
        }
        return a / b;
    }
}

public class Q1 {
    public static void main(String[] args) {
        try {
            System.out.println("Result: " + Calculator.divide(10, 2));
            System.out.println("Result: " + Calculator.divide(10, 5));
            System.out.println("Result: " + Calculator.divide(10, 0));
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
