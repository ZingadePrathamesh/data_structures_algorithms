import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(4);
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
    public static void pattern4(int n){
        for(int i = 0; i<2*n; i++){
            int c = i<=n?i:2*n-i;
            for(int j = 0; j<c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i = 0; i<n; i++){
            int c = i<=n?i:2*n-i;
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        int col =  0;
        System.out.println("\n\n\nPattern 6\n");
        for(int i = 0; i<2*n; i++){
            col =  i<n?n-i:i-n+1;
            int spaces = n-col;
            for(int j = 0; j<spaces; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void  pattern7(int n){
        for(int i  = 0; i< n; i++){
            int col = 2*i + 1;
            for(int j=0; j<n-i+1; j++){
                System.out.print(" ");
            }
            for(int j =  i+1; j>0; j--){
                System.out.printf("%d", j);
            }
            for(int j = 2; j<=i+1; j++){
                System.out.printf("%d", j);
            }
            System.out.println();
        }
    }

    public static void pattern8(int n ){
        int N = 2*n-1;
        for(int i = 0 ; i< N; i++){
            for(int j = 0; j< N; j++){
                int value = n-Math.min(Math.min(N-1-i, N-1-j),Math.min(i, j));
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }

}
