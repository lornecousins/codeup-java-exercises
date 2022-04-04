import java.util.Arrays;

public class ArraysExercises {

    public static String[] addPerson(int n, String person[], String add) {
        int i;
        String newArray[] = new String[n + 1];
        for (i = 0; i < n; i++) {
            newArray[i] = person[i];

            newArray[n] = add;
        }
            return newArray;
    }


        public static void main (String[]args){
//        int[] numbers = {1, 2, 3, 4, 5};
            String[] person;
            person = new String[3];
            person[0] = "Lorne";
            person[1] = "Eddie";
            person[2] = "Moe";

            int n = 3;
            int i;

            System.out.println(Arrays.toString(person));

            String add = "Marly";

            person = addPerson(n, person, add);

            System.out.println(Arrays.toString(person));


        }

    }

