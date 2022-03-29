public class ControlFlowExercises {
    public static void main(String[] args) {
        //1c For
        //
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

        int i;
        for (i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
