package util;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static  Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
        scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a string");
        return scanner.nextLine();
    }
    public  Boolean yesNo(){
        System.out.println("if you enter yes this will return true");
        String userInput= scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }
    public int getInt(int min, int max){
        System.out.println("Enter an Integer between"+min+" & "+ max);
        int userInput=scanner.nextInt();
        if (userInput>min&&userInput<max){
            System.out.println("int is within range");
            return userInput;
        }else {
            return getInt(min, max);
        }
    }
    public int getInt() {
        System.out.println("Enter an integer: ");
        String userInput = scanner.nextLine();
        try {
            return Integer.valueOf(userInput);
        } catch (NumberFormatException nfx){
            System.out.println("Number Format Exception");
        }
        return getInt();
    }
//        try {
//            System.out.println("enter an Integer");
//            int inputInt = input.nextInt();
//        } catch (InputMismatchException imx){
//            System.out.println("Looks like you didn't enter an integer" + imx);
//        }
//        return scanner.nextInt();
//        }
    public double getDouble(double min,double max){
        System.out.println("enter a double between"+min+" & "+max);
        double userInput= scanner.nextDouble();
        if (userInput>min && userInput<max){
            System.out.println("double is within range");
            return userInput;
        }else {
            System.out.println("try again");
            return getDouble(min, max);
        }
    }

        public static double getDouble() {
            System.out.println("enter a double");
            return scanner.nextDouble();
        }
    }