public class VehicleTest {
    public static void main(String[] args) {
        Tractor tractor  = new Tractor();
        tractor.setVehicle("Tractor");
        //method overwriting
        System.out.println("The " + tractor.getVehicle() + " sounds like ");
        tractor.makeNoise();
    }
}
