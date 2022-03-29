import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //4
        //Convert given number grades into letter grades.
        //Prompt the user for a numerical grade from 0 to 100.
        //Display the corresponding letter grade.
        //Prompt the user to continue.
        //Assume that the user will enter valid integers for the grades.
        //The application should only continue if the user agrees to.
        //
        //        Grade Ranges:
        //        A : 100 - 88
        //        B : 87 - 80
        //        C : 79 - 67
        //        D : 66 - 60
        //        F : 59 - 0

        String input;
        do {
        System.out.print("Please enter your grade: ");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();


         if (grade <= 100 && grade >= 88) {
            System.out.println("You're grade is an A");
        } else if (grade < 88 && grade >= 80) {
            System.out.println("You're grade is a B");
        } else if (grade < 80 && grade >= 67) {
            System.out.println("You're grade is a C");
        } else if (grade < 67 && grade >= 60) {
            System.out.println("You're grade is a D");
        } else if (grade < 60) {
            System.out.println("You're grade is an F");
        } else {
            System.out.println("Invalid Input");
        }
        System.out.println("would you like to continue? [y/n] ");
        input = sc.next();
    } while (input.equals("y"));
}
}


