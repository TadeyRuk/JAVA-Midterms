package TransportSystem;
public class Car extends Vehicle {

    Car(String name, double fuelCapacity, int numWheels) {
        super(name, fuelCapacity, numWheels);
    }

    Car(String name, double fuelCapacity) {
        super(name, fuelCapacity);
    }
    
    Car(String name){
        super(name);
    }

    @Override
    public void fuelEfficiency() {
        System.out.println("Car " + name + " fuel efficiency: 15 km/l");
    }
}