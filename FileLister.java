import java.io.File;

/*
A class file for Java Basics assignment 3 part 1
the listFiles method takes a path and spits out the files and folders inside that folder
the main method calls listFiles for the test folder I made to check if it works
*/

public class FileLister{
    public static void main(String[] args){
        FileLister fileLister = new FileLister();
        fileLister.listFiles("test_folder");
    }
    public void listFiles (String location){
        File folder = new File(location);
        String[] filenames= folder.list();
        for (String filename:filenames){
            System.out.println(filename);
        }
    }
}