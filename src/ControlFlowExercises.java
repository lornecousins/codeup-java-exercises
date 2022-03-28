public class ControlFlowExercises {
    public static void main(String[] args) {
        //1b Do While
        //
        //    Alter your loop to count backwards by 5's from 100 to -10.
        //    Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        //
        // 2
        // 4
        // 16
        // 256
        // 65536
//        int i;
        int i = 100;
        do {
                System.out.print(i + " ");
            i = i - 5;
            } while (i >= -10);
            i--;
    }
}
