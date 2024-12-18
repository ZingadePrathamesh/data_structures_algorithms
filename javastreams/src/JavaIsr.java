import java.io.*;
import java.nio.charset.StandardCharsets;

public class JavaIsr {
    public static void main(String[] args) {
        try(OutputStream outputStream = new FileOutputStream("output.txt");){
            outputStream.write("hello".getBytes(StandardCharsets.UTF_8));
        }
        catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }

        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in)){
            System.out.println("Enter some letters to print");
            int letters = inputStreamReader.read();
            while(inputStreamReader.ready()){
                System.out.println((char) letters);
                letters = inputStreamReader.read();
            }
        }
        catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
        File file = new File("output.txt");
        try(FileReader fileReader = new FileReader(file)){
            while(fileReader.ready()){
                System.out.println((char) fileReader.read());
            }
        }
        catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }
}
