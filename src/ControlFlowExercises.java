import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //3
        // Display a table of powers.
        //
        //    Prompt the user to enter an integer.
        //    Display a table of squares and cubes from 1 to the value entered.
        //    Ask if the user wants to continue.
        //    Assume that the user will enter valid data.
        //    Only continue if the user agrees to.
        //
        //Example Output
        //
        //What number would you like to go up to? 5
        //
        //Here is your table!
        //
        //number | squared | cubed
        //------ | ------- | -----
        //1      | 1       | 1
        //2      | 4       | 8
        //3      | 9       | 27
        //4      | 16      | 64
        //5      | 25      | 125

        System.out.println("Welcome to the Squares and Cubes Table");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int number = sc.nextInt();
        System.out.println(("Number" + "  " + "Squared" + "  " + "Cubed"));
        System.out.println("------ |" + " ------ |" + " ------");
        for (int i = 1; i <= number; i++) {
//            i = number;
            int numberSquared = (int) Math.pow(i, 2);
            int numberCubed = (int) Math.pow(i, 3);
        String message = "\n" + i + "        " + numberSquared + "        " + numberCubed;
            System.out.println(message);
            System.out.println();
        }

    }
    }

