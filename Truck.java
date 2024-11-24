package TransportSystem;
public class Truck extends Vehicle {

    Truck(String name, double fuelCapacity, int numWheels) {
        super(name, fuelCapacity, numWheels);
    }

    Truck(String name, double fuelCapacity) {
        super(name, fuelCapacity);
    }

    Truck(String name) {
        super(name);
    }

    @Override
    public void fuelEfficiency() {
        System.out.println("Truck " + name + " fuel efficiency: 8 km/l");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();

    }
}