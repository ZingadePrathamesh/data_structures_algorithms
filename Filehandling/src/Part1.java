import java.io.*;
import java.util.ArrayList;

public class Part1 {
    public static void main(String[] args) throws IOException {
//        inputStreamReaderEx();
//        fileInputStreamEx();
//        fileReaderEx();
        bufferReaderEx();
    }

    public static void fileReaderEx(){
        File file = new File("Filehandling/src/note.txt");
        try(FileReader reader = new FileReader(file)){
            while (reader.ready()){
                System.out.print((char) reader.read());
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    public static void fileInputStreamEx(){
        File file = new File("Filehandling/src/note.txt");
        try(FileInputStream reader = new FileInputStream(file)){
            while(reader.available() != 0){
                System.out.print((char) reader.read());
            }
//            byte[] str = reader.readAllBytes();
//            System.out.println(Arrays.toString(str));
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    public static void bufferReaderEx(){
        File file = new File("Filehandling/src/note.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter some words which can be read.");
            int letter = bufferedReader.read();
            while (bufferedReader.ready()){
                System.out.println((char) letter);
                letter = bufferedReader.read();
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            while(bufferedReader.ready()){
                System.out.print((char) bufferedReader.read());
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    public static void inputStreamReaderEx(){
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            ArrayList<Character> chars = new ArrayList<>();
            System.out.println(chars);
            System.out.println("Enter some letters: ");
            int letter = isr.read();
            chars.add((char) letter);
            while(isr.ready()){
                System.out.println((char) letter);
                letter  = isr.read();
                chars.add((char) letter);
                System.out.println(chars);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
