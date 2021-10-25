import java.io.FileReader;
import java.util.Scanner;

/*
A class for JB assignment 3 part 3.
It's refusing to acknowledge any of the files I made to test it, whether I use relative or absolute path.
I don't know why
*/

public class CharacterCounter {
    public static void main(String[] args){
        Scanner charactergetter = new Scanner(System.in);
        Scanner readfile=new Scanner(new FileReader("text_file.txt"));
        Character character= charactergetter.nextLine().charAt(0);
        Integer characterCount=0;
        while ( readfile.hasNextLine() ){
            String line = readfile.nextLine();

            for( int i=0; i<line.length(); i++ ) {
                if( line.charAt(i) == character ) {
                    characterCount++; 
                }
            }
        }
        charactergetter.close();
        System.out.println(characterCount);
    }
}
