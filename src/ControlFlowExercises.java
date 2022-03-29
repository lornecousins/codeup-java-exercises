public class ControlFlowExercises {
    public static void main(String[] args) {
        //2 Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.

        for (int i = 1; i <= 100; i++)
        {
            if (((i % 3) == 0) && ((i % 5) == 0)) // Is it a multiple of 3 & 5?
                System.out.print("fizzbuzz" + " ");
            else if ((i % 3) == 0) // Is it a multiple of 3?
                System.out.print("fizz" + " ");
            else if ((i % 5) == 0) // Is it a multiple of 5?
                System.out.print("buzz" + " ");
            else
                System.out.print(i + " "); // Not a multiple of 3 or 5
        }
    }
    }

