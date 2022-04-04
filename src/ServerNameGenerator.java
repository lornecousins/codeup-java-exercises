import java.util.Random;

public class ServerNameGenerator {



    public static void main(String[] args) {
        String[] adjective;
        adjective = new String[10];
        adjective[0] = "pretty";
        adjective[1] = "ugly";
        adjective[2] = "smooth";
        adjective[3] = "effective";
        adjective[4] = "noisy";
        adjective[5] = "calm";
        adjective[6] = "collective";
        adjective[7] = "smart";
        adjective[8] = "mean";
        adjective[9] = "precious";

        String[] noun;
        noun = new String[10];
        noun[0] = "stick";
        noun[1] = "water";
        noun[2] = "ball";
        noun[3] = "horseshoe";
        noun[4] = "man";
        noun[5] = "fan";
        noun[6] = "car";
        noun[7] = "broom";
        noun[8] = "building";
        noun[9] = "patch";

        System.out.println("Here is your server name: \n " + randomElement(adjective) + " - " + randomElement(noun));
    }

    public static String randomElement(String[] array) {
        int random = new Random().nextInt(array.length);
        return array[random];
    }


}
