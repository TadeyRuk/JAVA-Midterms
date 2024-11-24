package TransportSystem;
public class Vehicle {
    String name;
    double fuelCapacity;
    int numWheels;


    Vehicle(String name) {
        this.name = name;
    }

    Vehicle(String name, double fuelCapacity) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
    }

    Vehicle(String name, double fuelCapacity, int numWheels) {
        this.name = name;
        this.fuelCapacity = fuelCapacity;
        this.numWheels = numWheels;
    }

    public void startEngine() {
        System.out.println(name + " engine started.");
    }

    public void fuelEfficiency() {
        System.out.println("Fuel efficiency for " + name + " is not defined.");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Fuel Capacity: " + fuelCapacity +" Liters");
        System.out.println("Number of Wheels: " + numWheels);  
    }
}
    