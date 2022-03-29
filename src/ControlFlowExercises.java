public class ControlFlowExercises {
    public static void main(String[] args) {
        //1c For
        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536

        long i;
        for (i = 2; i < 1000000; i *= i)
            System.out.println(i + " ");
    }
}
