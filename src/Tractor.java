public class Tractor extends Vehicle{
    public void makeNoise() {
        //super is new keyword to run method from superclass, followed by the overwrite
        super.makeNoise();
        System.out.println("Brrrah Brrrah");
    }
}
