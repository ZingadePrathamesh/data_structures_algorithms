import java.io.*;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        tableWriter();
    }

    public static void tableWriter(){
        File file = new File("table");
        try(FileWriter writer = new FileWriter(file)){
            Scanner sc = new Scanner(System.in);
            System.out.println("Insert a number");
            int number = sc.nextInt();
            for(int i = 1; i< 1100; i++){
                writer.append(number + " x " + i + " = " + number*i + "\n");
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
