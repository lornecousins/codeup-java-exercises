package FileIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIOLectureExercise {

    public static void main(String[] args) {

        // Lecture examples to work out after students
//        String myPath = "/Users/files/this.text";
//        String fileName = "test.txt";
//        String directory = "data";
//        String directory2 = "more-data";

//        // Getting the file full path from this method get
//        Path filePath = Paths.get(directory,fileName);
//
//        System.out.println("filePath.getFileName() = " + filePath.getFileName());
//        System.out.println("filePath.toString() = " + filePath.toString());
//
//        Path fakePath = Paths.get("dir1","dir2","dir3","dir4", "file.text");
//
//        System.out.println("fakePath.toAbsolutePath() = " + fakePath.toAbsolutePath());
//
        //mini-exercise:
        //create path with 1 argument
//        Path fileExample = Paths.get(directory);
//
//        //create path with 3 arguments
//        Path anotherFile = Paths.get(directory, directory2, fileName);
//
//        //create absolute path
//        Path absolutePath = Paths.get("/", "Users/");
//
//        System.out.println("anotherFile.toAbsolutePath(): " + anotherFile.toAbsolutePath());
//        //use "isAbsolute" method to check if Path is absolute path
//        System.out.println(absolutePath.isAbsolute());



//         Person text files -> container a list of people
//        FileManager postsFile = new FileManager("posts.txt", "data");
//        FileManager peopleFile = new FileManager( "persons.txt", "data");
//
//        ArrayList<FileManager> files = new ArrayList<>();
//        files.add(new FileManager());
//
//        postsFile.printLines();
//        peopleFile.printLines();

         //Posts -> contains a number of posts

        //mini-exercise 2
//        create a new Path to a file
        FileManager dishFile = new FileManager("dishes.txt", "data");

        ArrayList<FileManager> fileData = new ArrayList<>();
        fileData.add(new FileManager("dishes.txt", "data"));

        dishFile.printLines();


        //mini-exercise 3



    }

}

