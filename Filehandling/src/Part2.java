import java.io.*;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
//        tableWriter();
//        outputStreamEx();
//        outputStreamWriterEx();
        bufferedWriter();
    }

    public static void tableWriter(){
        File file = new File("table");
        try(FileWriter writer = new FileWriter(file)){
            Scanner sc = new Scanner(System.in);
            System.out.println("Insert a number");
            int number = sc.nextInt();
            for(int i = 1; i< 1100; i++){
                writer.append(String.valueOf(number)).append(" x ").append(String.valueOf(i)).append(" = ").append(String.valueOf(number * i)).append("\n");
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    public static void outputStreamEx(){
        try(OutputStream os = System.out;){
            for (int i = 32; i<=126; i++){
                os.write(i);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    public static void outputStreamWriterEx(){
        try(OutputStreamWriter oSW = new OutputStreamWriter(System.out)){
            System.out.println(oSW.getEncoding());
            for (int i = 32; i<=10000; i++){
                oSW.write(i);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    public static void bufferedWriter(){
        try(BufferedWriter oSW = new BufferedWriter(new FileWriter(new File("symbols.txt")))){
            for (int i = 32; i<=10000; i++){
                if(i%10 == 0) oSW.write('\n');
                oSW.write(i);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

}
