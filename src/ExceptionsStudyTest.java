public class ExceptionsStudyTest {
    public static void main(String[] args) {
//        try {
        ExceptionsStudy exceptionsStudy = new ExceptionsStudy();
//            exceptionsStudy.subListMaker("this is a sentence");
        try {
            exceptionsStudy.echoWordThrowCustomException();
        } catch (CussWordException cx) {
            System.out.println("How rude " + cx);
        }

//            exceptionsStudy.askForAnInteger();
//            System.out.println(Integer.parseInt(study.maybeAnInteger));
//            System.out.println(Integer.parseInt(study.certainlyNotAnInteger));
//        } catch (NumberFormatException nfx) {
//            System.out.println("Got an exception " + nfx);
//            nfx.printStackTrace();
//        }
//        try {
//            String myTestString = "This is my test string";
//            int myStringLength = myTestString.length();
//            System.out.println(myStringLength);
//            String mySubString = myTestString.substring(5, 24);
//            System.out.println(mySubString);
//
//        } catch (IndexOutOfBoundsException iobx) {;
//            System.out.println("Index out of bounds " + iobx);
//            }
    }
}