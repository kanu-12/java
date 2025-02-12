class Worker {
    String name;
    double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double computePay(int hours) {
        return hours * salaryRate;
    }

    public void display() {
        System.out.println("Worker Name: " + name);
        System.out.println("Salary Rate: ₹" + salaryRate + " per hour");
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int daysWorked) {
        return daysWorked * 8 * salaryRate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        return 40 * salaryRate;
    }
}

public class four {
    public static void main(String[] args) {
        DailyWorker dWorker = new DailyWorker("Raj", 200);
        SalariedWorker sWorker = new SalariedWorker("Amit", 300);

        System.out.println("Daily Worker Details:");
        dWorker.display();
        System.out.println("Weekly Pay for 5 days: ₹" + dWorker.computePay(5));

        System.out.println("\nSalaried Worker Details:");
        sWorker.display();
        System.out.println("Weekly Pay (Fixed): ₹" + sWorker.computePay(40));
    }
}
