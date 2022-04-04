//mini-exercise (VehicleTest and Tractor)
public class Vehicle {
//    Create a Vehicle class with two properties: a name instance variable and a makeNoise() method. The instance variable should be private and have getters and setters (in IntelliJ try cmd-N). The makeNoise method should just sout out a typical vehicle noise. Then create a more specific vehicle subclass, such as Motorcycle, Car, Truck, Tractor, whatever. Make the specific vehicle class extend the Vehicle class. Otherwise, keep it empty. Create a test class, perhaps calling it VehicleTest Instantiate the specific vehicle, assign a value to the name property and run the methods on the specific vehicle. Notice the inherited method works and the inherited name property is assignable on the subclass.

    private String vehicle;

    public String getVehicle() {
        return vehicle;
    }

    public void makeNoise() {
        System.out.println("Vroom Vroom!!");
    }


    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

}
