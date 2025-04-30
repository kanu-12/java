// Abstract class representing an Employee
abstract class Employee {
    String name, role;

    // Abstract methods to be implemented by subclasses
    abstract void calculateSalary();
    abstract void displayDetails();
}

// Manager class extending Employee
class Manager extends Employee {
    double salary;

    // Constructor to initialize Manager's details
    Manager(String name, double salary) {
        this.name = name;
        this.role = "Manager";
        this.salary = salary;
    }

    // Override method to calculate fixed salary
    void calculateSalary() {
        System.out.println("Manager Salary: " + salary);
    }

    // Override method to display manager details
    void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role + ", Salary: " + salary);
    }
}

// Developer class extending Employee
class Developer extends Employee {
    double hourlyRate;
    int hoursWorked;

    // Constructor to initialize Developer's details
    Developer(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.role = "Developer";
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Override method to calculate salary based on hourly rate
    void calculateSalary() {
        System.out.println("Developer Salary: " + (hourlyRate * hoursWorked));
    }

    // Override method to display developer details
    void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role + ", Salary: " + (hourlyRate * hoursWorked));
    }
}

// Main class to test the implementation
public class EmployeeDemo {
    public static void main(String[] args) {
        // Create Manager and Developer objects
        Employee manager = new Manager("Alice", 70000);
        Employee developer = new Developer("Bob", 50, 160);

        // Display details and calculate salary
        manager.displayDetails();
        manager.calculateSalary();

        developer.displayDetails();
        developer.calculateSalary();
    }
}
