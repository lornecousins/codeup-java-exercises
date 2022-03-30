import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("What's up?");
        do {
        String conversation = sc.nextLine();
        if (conversation.endsWith("?")) {
            System.out.println("Sure");
        } else if (conversation.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (conversation.isEmpty()) {
                System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }
        } while (true);
    }
}