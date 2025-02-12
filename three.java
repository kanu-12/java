
class Vehicle {
    String brand, model;
    
    
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

class Car extends Vehicle {
    int seatingCapacity;


    public Car(String brand, String model, int seatingCapacity) {
        super(brand, model); 
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}

class ElectricCar extends Car {
    int batteryCapacity; 

    public ElectricCar(String brand, String model, int seatingCapacity, int batteryCapacity) {
        super(brand, model, seatingCapacity); 
        this.batteryCapacity = batteryCapacity;
    }


    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}


class Motorcycle extends Vehicle {
    int engineCapacity; 

    public Motorcycle(String brand, String model, int engineCapacity) {
        super(brand, model); 
        this.engineCapacity = engineCapacity;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}

public class three {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 5);
        ElectricCar eCar = new ElectricCar("Tesla", "Model 3", 5, 75);
        Motorcycle bike = new Motorcycle("Yamaha", "MT-07", 689);

        System.out.println("Car Details:");
        car.displayDetails();

        System.out.println("\nElectric Car Details:");
        eCar.displayDetails();

        System.out.println("\nMotorcycle Details:");
        bike.displayDetails();
    }
}
