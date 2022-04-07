import java.util.Scanner;

public class ExceptionsStudy {
    public String maybeAnInteger = "42";
    public String certainlyNotAnInteger = "I am NOT an Integer";
//    public String letsTryThisOut = "Looking to see if I can get an exception thrown from a substring method";
public void askForAnInteger() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter an integer");
    String userInput = scanner.nextLine();

    try {
        int userInputInteger = Integer.parseInt(userInput, 2, 10, 15);
        System.out.println("The integer in your string is " + userInputInteger);
    } catch (IndexOutOfBoundsException iox) {
        System.out.println("Dude your index is out of bounds " + iox);
    } catch (NumberFormatException nfx){
        System.out.println("Uh oh, " + nfx.getMessage() + " there is no integer!");
    } catch (Exception ex){
        System.out.println("Dude, exception " + ex);
    } finally {
        System.out.println("Thank you for using this complex and useful application.");
        System.out.println("Please come back and visit.");
    }
}
}
