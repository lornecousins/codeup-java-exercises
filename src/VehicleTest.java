public class VehicleTest {
    public static void main(String[] args) {
        Tractor tractor  = new Tractor();
        tractor.setName("Tractor");
        //method overwriting
        System.out.println("The " + tractor.getName() + " sounds like ");
        tractor.makeNoise();
    }
}
