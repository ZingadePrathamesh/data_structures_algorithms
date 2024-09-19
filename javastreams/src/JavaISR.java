import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaISR {
    public static void main(String[] args) {
//        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in)){
//            System.out.println("Enter a letter");
//
//            char letter = (char) inputStreamReader.read();
//            while(inputStreamReader.ready()){
//                System.out.println(letter);
//                letter = (char) inputStreamReader.read();
//            }
//        }
//        catch(IOException io){
//            System.out.println(io.getMessage());
//        }

        try(FileReader fileReader = new FileReader("output.txt")){
            StringBuilder str = new StringBuilder();
            while(fileReader.ready()){
                str.append((char) fileReader.read());
                System.out.println((char) fileReader.read());
            }
            System.out.println(str);
        }
        catch(IOException io){
            System.out.println(io.getMessage());
        }
    }

}
