package lab8;
class InvalidOrderAmountException extends Exception {
    public InvalidOrderAmountException(String message) {
        super(message);
    }
}

class OrderProcessor {
    public static void processOrder(double amount) throws InvalidOrderAmountException {
        if (amount <= 0) {
            throw new InvalidOrderAmountException("Invalid order amount. Order must be greater than zero.");
        }
        System.out.println("Order processed successfully for amount: " + amount);
    }
}

public class Q3 {
    public static void main(String[] args) {
        try {
            OrderProcessor.processOrder(100);
            OrderProcessor.processOrder(-5);
        } catch (InvalidOrderAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
