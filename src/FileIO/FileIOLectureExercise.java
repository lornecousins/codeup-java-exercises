package FileIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOLectureExercise {

    public static void main(String[] args) {

//        // Lecture examples to work out after students
        String myPath = "/Users/files/this.text";
        String fileName = "test.txt";
        String directory = "data";
        String directory2 = "more-data";

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
        Path fileExample = Paths.get(directory);

        Path anotherFile = Paths.get(directory, directory2, fileName);

        Path absolutePath = Paths.get("/Users/lornecousins/IdeaProjects/Codeup-java-exercises/data/test.txt");

        System.out.println("anotherFile.toAbsolutePath(): " + anotherFile.toAbsolutePath());
        System.out.println(absolutePath.isAbsolute());

    }

}

