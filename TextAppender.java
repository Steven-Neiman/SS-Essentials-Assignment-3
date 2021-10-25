import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.StandardOpenOption;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
A class file for JB assignment 3 part 2
I can't get it to work. it says "Path cannot be resolved to a type"
*/ 

public class TextAppender {
    public static void main(String[] args){
        TextAppender textAppender = new TextAppender();
        textAppender.appendToFile("test_folder/text_file1");
    }
    public void appendToFile(String location){
        String toAppend="This string was added to the file using java";
        byte[] bytesToAppend= toAppend.getBytes();
        Path path = Paths.get(location);
        Files.write(path, bytesToAppend, StandardOpenOption.APPEND);
    }
}
