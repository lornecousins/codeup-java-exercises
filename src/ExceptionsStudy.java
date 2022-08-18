import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionsStudy {
//    public String maybeAnInteger = "42";
//    public String certainlyNotAnInteger = "I am NOT an Integer";
//    public String letsTryThisOut = "Looking to see if I can get an exception thrown from a substring method";
//public void askForAnInteger() {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Please enter an integer");
//    String userInput = scanner.nextLine();
//
//    try {
//        int userInputInteger = Integer.parseInt(userInput, 2, 10, 15);
//        System.out.println("The integer in your string is " + userInputInteger);
//    } catch (IndexOutOfBoundsException iox) {
//        System.out.println("Dude your index is out of bounds " + iox);
//    } catch (NumberFormatException nfx){
//        System.out.println("Uh oh, " + nfx.getMessage() + " there is no integer!");
//    } catch (Exception ex){
//        System.out.println("Dude, exception " + ex);
//    } finally {
//        System.out.println("Thank you for using this complex and useful application.");
//        System.out.println("Please come back and visit.");
//    }

    //mini-exercise
    public void subListMaker(String sentence){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);
        ArrayList<String> wordArrayList = new ArrayList<>();
        String[] stringArray = sentence.split(" ");
        for (String word : stringArray){
            wordArrayList.add(word);
        }
        try {
            List<String> shorterList = wordArrayList.subList(firstInt, secondInt);
            String newSentence = String.join(" ", shorterList);
            System.out.println(newSentence);
        } catch (InputMismatchException imx){
            System.out.println("Dude, your input is mismatched " + imx);
        } catch (IllegalArgumentException iax){
            System.out.println("seriously, your endpoint indicies out of order");
        } catch (IndexOutOfBoundsException iox){
            System.out.println("Index out of bounds");
        }
    }

        public void echoWordThrowCustomException() throws CussWordException {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Say Something");
            String whatYouSaid = scanner.nextLine();
            if (whatYouSaid.equals(("curses"))) {
                throw new IllegalArgumentException();
            }
    }

}

