public class ControlFlowExercises {
    public static void main(String[] args) {
        //1b Do While
        //
        //    Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        //
        // 2
        // 4
        // 16
        // 256
        // 65536

        long i = 2;
        do {
                System.out.println(i + " ");
            i *= i;
            } while (i < 1000000);
    }
}
