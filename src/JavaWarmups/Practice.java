package JavaWarmups;
//    //4/7/22
//    //# Java Assessment Practice Problems
//    //
//    //1. Create a class called Practice with a main method.
//
public class Practice {
//
//    //2. Create a public static method in main called *subtractTen* that takes one integer argument and returns that number minus 10.
//        public static int subtractTen(int num) {
//            this.num = num;
//            return num - 10;
//        }
    //3. Create a public static method *average* that takes an array of integers and returns their average as a double.
//        public static double average(){
//            int[] integers;
//            int sum = 0;
//            for (int i = 0, i < integers.length; i++ ){
//
//        }
//        }
    //4. Create a class called Pet with two String instance variables, name and type.
    //5. Create getters and setters for the properties as well as a constructor that takes two strings and sets the name and type.
    //6. Create a PetDog class that inherits from Pet.
    //7. In PetDog, create a boolean instance variable, trained.
    //8. Write a constructor for PetDog that sets its name, type, and trained properties.
    //9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property
//    public static void main(String[] args) {
//    }
//    }

    // Arithmetic Expressions
    public static void main(String[] args) {
        int result = 10 + 3;
        System.out.println(result);

        double result1 = 10 / 3;
        System.out.println(result1);

        result1 = (double)10/(double)3;
        System.out.println(result1);

//        int x = 1;
//        x++;
//        x--;
//        ++x;
//        --x;
//        int y = x++;
//        int y = ++x;
//        x += 2;
//        System.out.println(x);
//        System.out.println(y);

//        int x = 10 + 3 * 2;
//        int x = (10 + 3) * 2;
//        System.out.println(x);

        //implicit casting
        //byte > short > int > long
//        short x = 1;
//        int y = x + 2;

//        double x = 1.1;
//        double y = x + 2;

        //explicit casting
//        double x = 1.1;
//        int y = (int)x + 2;

        //String + integer incompatible?
//        String x = "1";
//        int y = Integer.parseInt(x) + 2;

        //or casting to a decimal from a string
        String x = "1.1";
        double y = Double.parseDouble(x) + 2;
        System.out.println(y);
    }



}
