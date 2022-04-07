package JavaWarmups;

public class JavaWarmups {
    public static char returnFirstCapitalLetter(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toUpperCase(str.charAt(i))) {
                return str.charAt(i);
            }
        }
              return ' ';
}

public static void main(String[] args) {
    System.out.println(returnFirstCapitalLetter("hellO"));
    System.out.println(returnFirstCapitalLetter("hello"));
    System.out.println(returnFirstCapitalLetter("hEllo"));
    System.out.println(returnFirstCapitalLetter("heLlo"));
    System.out.println(returnFirstCapitalLetter("H"));
}
    }

