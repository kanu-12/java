import java.util.Scanner;

class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double salary;
    private static int totalEmployees = 0;

    public Employee() {
        this.employeeID = 0;
        this.name = "Unknown";
        this.department = "Not Assigned";
        this.salary = 0.0;
        totalEmployees++; 
    }

    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++; 
    }

    public double calculateSalary() {
        return this.salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }

    public static void displayTotalEmployees() {
        System.out.println("\nTotal Employees: " + totalEmployees);
    }
}

public class emp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee emp1 = new Employee();

        System.out.print("\nEnter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee emp2 = new Employee(id, name, department, salary);

        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();

        Employee.displayTotalEmployees();

        scanner.close();
    }
}
