//class Post {
//    public String author;
//    public String title;
//    public String content;
//    public String creationDate;
//
//
//    public String getPost() {
//        return  "\nTitle: " + title +  "\n"+
//                "Content: " + content + "\n" +
//                "Author: " + author + "\n" +
//                "CreationDate: " + creationDate +"\n";
//    }
//
//    public String updatePost(String title, String author,String content, String creationDate) {
//
//        this.title = title;
//        this.author = author;
//        this.content = content;
//        this.creationDate = creationDate;
//
//        return  this.getPost();
//    }
//
//
//}
//
//
//class Person {
//    public String firstName;
//    public String lastName;
//    private int age;
//    public static long totalPeople = 0;
//
//    public static String description =
//            "Object represents a person.";
//
//    public Person() {}
//
//    public Person(String first, String last) {
//        this.firstName = first;
//        this.lastName = last;
//    }
//
//    public static String getDescription() {
//        return description;
//    }
//
//    public String sayHello() {
//        return String.format("Hello from %s %s!",
//                firstName, lastName);
//    }
//
//    public void setAge(int age) { this.age = age; }
//    public int getAge() { return age; }
//}
//
//
//
//public class OOPLecture {
//    public static void main(String[] args) {
//        // This is where we will do all our work with the class we're creating
//        Post firstPost = new Post();
//
//        System.out.println("firstPost = " + firstPost.getPost());
//
//        firstPost.author = "Dane Miller";
//        firstPost.title = "OOP is a fundamental of many programming langauges";
//        firstPost.creationDate = "2022-03-31";
//        firstPost.content = "OOP allows us to create methods and variables that are encapsulated in a class object.";
//
//        System.out.println("firstPost.getPost() = " + firstPost.getPost());
//
//
//        String updatedPost = firstPost.updatePost(
//                "OOP The 4 Fundamentals: Abstraction",
//                "Dane Miller",
//                "Abstraction is the simplification of complex things to make them easier to work with.",
//                "2022-03-30");
//
//        System.out.println("updatedPost = " + updatedPost);
//
//        Post secondPost = new Post();
//
//        secondPost.updatePost(
//                "OOP The 4 Fundamentals: Encapsulation",
//                "Dane Miller",
//                "The bundling of data and methods into a single unit, a class.",
//                "2022-03-30");
//
//        System.out.println("secondPost.getPost() = " + secondPost.getPost());
//
//        // 1. Created a class called post. Which is responsible for creating new posts.
//        // 2 .We created field in that class with public visibility. meaning that everyone has access to this value
//        // 3. We used encapsulation by storing our data and methods related to the class inside it.
//
//
//        // People class!
//
//        Person firstPerson = new Person("Justin","Reich");
//
//        System.out.println("firstPerson.sayHello() = " + firstPerson.sayHello());
//
//        Person secondPerson = new Person();
//
//        secondPerson.firstName = "Dane";
//        secondPerson.lastName = "Miller";
////        secondPerson.age = 34;
//        secondPerson.setAge(34);
//
//
//        System.out.println("secondPerson.sayHello() = " + secondPerson.sayHello());
//        System.out.println("secondPerson.getAge() = " + secondPerson.getAge());
//
//    }
//}

//mini-exercise:
//
//class Dish {
//    public int costInCents;
//    public String nameOFDish;
//    public boolean wouldRecommend;
//
//    public void printSummary() {
//        System.out.printf("\nCost: " + costInCents + "\n" +
//                "Name: " + nameOFDish + "\n" +
//                "Recommended: " + wouldRecommend + "\n");
//    }


//    public String updateDish(int costInCents, String nameOFDish, Boolean wouldRecommend) {
//        this.costInCents = costInCents;
//        this.nameOFDish = nameOFDish;
//        this.wouldRecommend = wouldRecommend;
//
//        return this.getDish();
//    }
//
//    public void printSummary() {
//        System.out.printf(getDish());
//    }
//}


