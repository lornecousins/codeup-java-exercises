import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //1
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f", pi);

        //1b
        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter your age: ");
//        int age = sc.nextInt();
//        System.out.println(age);

        //2b
//        System.out.print("Please enter your three favorite words: ");
//        String favWords = sc.next();
//        System.out.println(favWords);
//        System.out.println(sc.next());
//        System.out.println(sc.next());

        //3b
//        System.out.print("What' your favorite quote?");
//        String favQuote = sc.nextLine();
//        System.out.println(favQuote);

        //1c
        System.out.print("How many feet long is your classroom?");
        String length = sc.nextLine();
        System.out.print("How many feet wide is your classroom?");
        String width =  sc.nextLine();

        float classLength = Float.parseFloat(length);
        float classWidth = Float.parseFloat(width);
        System.out.println("The area is: " + (classLength * classWidth) + ".");
        System.out.println("The perimeter is: " + (classLength *2 + classWidth * 2) + ".");







    }
}
