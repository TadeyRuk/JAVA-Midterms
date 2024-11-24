package TransportSystem;
import java.util.Scanner;

public class TransportSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean valid = false;

        System.out.println("-----TYPES OF VEHICLES-----");
        System.out.println("1 - Car");
        System.out.println("2 - Truck");
        System.out.print("Enter type of vehicle: ");
        int type = sc.nextInt();
        sc.nextLine(); 

        switch (type) { 
            case 1:
            do{
                System.out.print("Enter name of vehicle: ");
                String carName = sc.nextLine();
                System.out.print("Enter fuel capacity: ");
                double carFuel = sc.nextDouble();

                int carWheels = 4;

                    if (carFuel <= 999){
                        Car car1 = new Car(carName);
                        System.out.println("--------------------------------------");
                        car1.startEngine();
                        car1.fuelEfficiency();
                        car1.displayDetails();
                        
                        Car car2 = new Car(carName, carFuel);
                        System.out.println("--------------------------------------");
                        car2.startEngine();
                        car2.fuelEfficiency();
                        car2.displayDetails();
                        
                        Car car3 = new Car(carName, carFuel, carWheels);
                        System.out.println("--------------------------------------");
                        car3.startEngine();
                        car3.fuelEfficiency();
                        car3.displayDetails();
                        System.out.println("--------------------------------------");
                        valid = true;
                    }
                    else{
                        System.out.println("You have inputed an invalid fuel capacity");
                        valid = false;
                        System.out.println("--------------------------------------");
                        sc.nextLine();
                    }
                
            } while (!valid);

                break;

            case 2:
            do{
                System.out.print("Enter name of vehicle: ");
                String truckName = sc.nextLine();
                System.out.print("Enter fuel capacity: ");
                double truckFuel = sc.nextDouble();
                int truckWheels = 6;

                if (truckFuel <= 999){

                    Truck truck1 = new Truck(truckName);
                    System.out.println("--------------------------------------");
                    truck1.startEngine();
                    truck1.fuelEfficiency();
                    truck1.displayDetails();

                    Truck truck2= new Truck(truckName, truckFuel);
                    System.out.println("--------------------------------------");
                    truck2.startEngine();
                    truck2.fuelEfficiency();
                    truck2.displayDetails();

                    Truck truck3 = new Truck(truckName, truckFuel, truckWheels);
                    System.out.println("--------------------------------------");
                    truck3.startEngine();
                    truck3.fuelEfficiency();
                    truck3.displayDetails();
                    valid = true;
                }
                else{
                    System.out.println("You have inputed an invalid fuel capacity");
                    valid = false;
                    System.out.println("--------------------------------------");
                    sc.nextLine();
                }

            } while (!valid);

            break;

            default:
                System.out.println("Invalid type of vehicle selected");
                break;
        }
        sc.close();
}
