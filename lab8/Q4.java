package lab8;
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

class PasswordValidator {
    public static void validatePassword(String password) throws WeakPasswordException {
        if (password.length() < 8 || !password.matches(".*\\d.*") || !password.matches(".*[a-zA-Z].*")) {
            throw new WeakPasswordException("Password is too weak. It must contain at least 8 characters, including letters and numbers.");
        }
        System.out.println("Password is strong.");
    }
}

public class Q4 {
    public static void main(String[] args) {
        try {
            PasswordValidator.validatePassword("weakpass");
        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            PasswordValidator.validatePassword("StrongPass1");
        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
