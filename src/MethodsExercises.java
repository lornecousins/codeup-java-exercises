import java.util.Scanner;

public class MethodsExercises {
    // TODO: use recursion to print out a given number up through 100
//
//    public static void countTo100(int num) {
//        if (num == 101) {
//            System.out.println("All Done!");
//            return;
//        }
//        System.out.println(num);
//        countTo100(num + 1);
//    }

    // TODO: use recursion to add all numbers up from 1 to a given number

//    public static int addNums(int num) {
//        if (num == 1) {
//            return 1;
//        }
//        return num + addNums(num - 1);
//    }

    public static void main(String[] args) {
//        countTo100(1);
//        System.out.println(addNums(10));

//    Methods Exercises:
        //1

//        int num1, num2, sum, difference, product, division, modulus;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("First Number: ");
//        num1 = sc.nextInt();
//        System.out.print("Second Number: ");
//        num2 = sc.nextInt();
//        sum = addTwo(num1, num2);
//        difference = subtractTwo(num1, num2);
//        product = multiplyTwo(num1, num2);
//        division = divideTwo(num1, num2);
//        modulus = modulateTwo(num1, num2);
//        System.out.println("Sum: " + sum);
//        System.out.println("Difference: " + difference);
//        System.out.println("Product: " + product);
//        System.out.println("Division: " + division);
//        System.out.println("Modulus: " + modulus);
//    }
//        public static int addTwo(int a, int b) {
//            int sum = a + b;
//            return sum;
//        }
//        public static int subtractTwo(int a, int b) {
//            int difference = a - b;
//            return difference;
//    }
//        public static int multiplyTwo(int a, int b) {
//            int product = a * b;
//            return product;
//    }
//        public static int divideTwo(int a, int b) {
//            int division = a / b;
//            return division;
//    }
//        public static int modulateTwo(int a, int b) {
//        int modulus = a % b;
//        return modulus;


        //2
//        int validNumber = getInteger(1, 10);
//        }
//
//        public static int getInteger(int min, int max) {
//            int userInput;
//            Scanner sc = new Scanner(System.in);
//            do {
//                System.out.print("Enter a number between " + min + " and " + max + ": ");
//                userInput = sc.nextInt();
//            } while (userInput < min || userInput > max);
//            return userInput;


        //3
        long n, fact = 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter a number between 1 and 10: ");
            n = sc.nextLong();
            if (n >= 1 && n <= 10) {
                break;
            }
        System.out.println("Your number is out of range");
        }

       for(int i = 1; i <= n; i++) {
           fact = fact * i;

        }
        System.out.println("factorial = " + fact);


        //4

//    public static void diceRoll(){
//        Scanner sc = new Scanner(System.in);
//        String choice = "y";
//
//        do {
//            System.out.println("How many sides does your dice have, between 4-20?");
//            int diceSides = getInteger(4, 20);
//            int min = 1;
//            int range = diceSides - min + 1;
//
//            //random numbers
//            for (int i = 0; i < diceSides; i++) {
//                int random1 = (int) (Math.random() * range) + min;
//                int random2 = (int) (Math.random() * range + min);
//
//                System.out.println("First Dice Rolls: " + random1);
//                System.out.println("Second Dice Rolls: " + random2);
//
//                System.out.println("Would you loike to roll again? (y/n): ");
//                choice = sc.next();
//                System.out.println();
//                sc.nextLine();
//            }
//            while (!choice.equalsIgnoreCase("n")) ;
//        }
//        }

        //5

    }
}






