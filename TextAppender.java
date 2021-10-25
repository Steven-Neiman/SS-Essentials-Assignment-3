import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.StandardOpenOption;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

/*
A class file for JB assignment 3 part 2
I can't get it to work. it says "Unhandled exception type IOException" and I have no idea why. I carefully checked the file name, but it isn't a FileNotFound error anyways
*/ 

public class TextAppender {
    public static void main(String[] args){
        TextAppender textAppender = new TextAppender();
        textAppender.appendToFile("test_folder/text_file1.txt");
    }
    public void appendToFile(String location){
        String toAppend="This string was added to the file using java";
        byte[] bytesToAppend= toAppend.getBytes();
        Path path = Paths.get(location);
        Files.write(path, bytesToAppend, StandardOpenOption.APPEND);
    }
}
