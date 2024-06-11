import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
    }

    public static void pattern1(int n){
        for(int i = 0; i<n; i++){
            for(int j = i ; j>=0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i;j++){
                System.out.printf("%d ", j+1);
            }
            System.out.println();
        }
    }
}
