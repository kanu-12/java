final class Logger {

    public void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

public class four {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.logMessage("This is a sample log message.");

    }
}