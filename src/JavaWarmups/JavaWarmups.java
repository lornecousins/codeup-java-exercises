package JavaWarmups;

public class JavaWarmups {
    public static char returnFirstCapitalLetter(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toUpperCase(str.charAt(i))) {
                return str.charAt(i);
            }
        }
              return ' ';
}

public static void main(String[] args) {
    System.out.println(returnFirstCapitalLetter("hellO"));
    System.out.println(returnFirstCapitalLetter("hello"));
    System.out.println(returnFirstCapitalLetter("hEllo"));
    System.out.println(returnFirstCapitalLetter("heLlo"));
    System.out.println(returnFirstCapitalLetter("H"));
}
    }
//10. Create an interface named Companion. The Companion interface should specify an instance method named snuggle that has no arguments and returns a String. Change your PetDog class so it implements the Companion interface. The implementation of the snuggle method on the PetDog class should return "name wants to snuggle", where name is the inherited instance property.
//        11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.
//        12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument.
//        12b. In your Pet class, create a static method named allSnuggle. It should accept an ArrayList of PetDog objects and output the result of calling the snuggle method on all of them. Create an ArrayList with at least three PetDog instances in the PetDogTest class. Call the allSnuggle method and pass it the ArrayList. Verify that the allSnuggle method works correctly.
