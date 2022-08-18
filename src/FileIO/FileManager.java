package FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileManager {
//    String fileName;
//    String directory;
//    List<String> fileData;
//
//    private Path directoryPath;
//    private Path filePath;
//
//    //Read a file
//    public FileManager(String fileName, String directory){
//        this.fileName = fileName;
//        this.directory = directory;
//
//        this.directoryPath = Paths.get(directory);
//        this.filePath = Paths.get(directory, fileName);
//
//        this.fileData = getFile();
//
//    }

//    //create a function called getFile
//    //Return the file data
//    private  List<String> getFile() {
//        //make sure file exists
//        try {
//            if (Files.notExists(directoryPath)) Files.createDirectories(directoryPath);
//        } catch (IOException e) {
//            System.out.println("Error creating directory" + directoryPath.getFileName());
//            e.printStackTrace();
//        }

//        //make sure directory exists
//        try {
//            if(Files.notExists(filePath)) Files.createFile(filePath);
//        } catch (IOException e) {
//            System.out.println("Error creating files" + filePath.getFileName());
//            e.printStackTrace();
//        }
//        //if not, create them (above)
//
//        List<String> data = null;
//
//        try {
//            data = Files.readAllLines(filePath);
//        } catch (IOException e) {
//            System.out.println("Error reading files " + filePath.getFileName());
//            e.printStackTrace();
//        }
//        // Error Handling? added try catch around each potential IOException
//
//        // readAllLines -> returns a List<String>
//        return data;
//    }

//    public boolean writeFile() {
//        try {
//            Files.write(filePath, fileData);
//        } catch (IOException e) {
//            System.out.println("Error writing to file: " + fileName);
//            e.printStackTrace();
//            return false;
//        }
//        return true;
//    }
//
//    public List<String> addLine(String string) {
//        fileData.add(string);
//        writeFile(); //as ssoon as the data is added, we write the file
//        return fileData;
//    }

    // Way to print all the lines of the file so we can see its contents quickly
//    public void printLines() {
//        for (String line : fileData) {
//            System.out.println(line);
//        }


        //mini-exercise 2
    String fileName;
    String directory;
    List<String> fileData;

    private Path directoryPath;
    private Path filePath;

    public FileManager(String fileName, String directory) {
        this.fileName = fileName;
        this.directory = directory;

        this.directoryPath = Paths.get(directory);
        this.filePath = Paths.get(directory, fileName);

        this.fileData = getFile();
    }

    private  List<String> getFile() {
            //make sure file exists
            try {
                if (Files.notExists(directoryPath)) Files.createDirectories(directoryPath);
            } catch (IOException e) {
                System.out.println("Error creating directory" + directoryPath.getFileName());
                e.printStackTrace();
            }

            //make sure directory exists
            try {
                if (Files.notExists(filePath)) Files.createFile(filePath);
            } catch (IOException e) {
                System.out.println("Error creating files" + filePath.getFileName());
                e.printStackTrace();
            }
            //if not, create them (above)

            List<String> fileData = null;

            try {
                fileData = Files.readAllLines(filePath);
            } catch (IOException e) {
                System.out.println("Error reading files " + filePath.getFileName());
                e.printStackTrace();
            }
            return fileData;
        }
//
       public void printLines(){
            for(String line : fileData) {
                System.out.println(line);
            }


        //mini-exercise 3
//           fileData.add("addittional item");
//           fileData.add("additional item2");
//
//           try {
//               Files.write(filePath, fileData);
//           } catch (IOException  e) {
//               e.printStackTrace();
//               System.out.println("error writing to file");
//           }
//
//           List<String> moreDishes = Arrays.asList("dish 1, dish 2, dish 3");
//           System.out.println();

//        public boolean writeFile() {
//        try {
//            Files.write(filePath, fileData);
//        } catch (IOException e) {
//            System.out.println("Error writing to file: " + fileName);
//            e.printStackTrace();
//            return false;
//        }
//        return true;
//    }
//
//        public List<String> addLine(String string) {
//        fileData.add(string);
//        writeFile(); //as ssoon as the data is added, we write the file
//        return fileData;
    }
}


