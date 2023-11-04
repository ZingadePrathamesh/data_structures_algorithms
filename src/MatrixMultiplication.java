import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the number of rows of Matrix A");
        int rowA = sc.nextInt();
        System.out.println("Enter the number of columns of Matrix A");
        int columnA = sc.nextInt();
        int matrixA[][] = new int[rowA][columnA];

        System.out.println("Enter the number of rows of Matrix B");
        int rowB = sc.nextInt();
        System.out.println("Enter the number of columns of Matrix B");
        int columnB = sc.nextInt();
        int matrixB[][] = new int[rowB][columnB];

        int matrixC[][] = new int[rowA][columnB];


        System.out.println("Enter the elements of matrix A");
        getElements(rowA , columnA , matrixA);
        System.out.println("Enter the elements of matrix B");
        getElements(rowB , columnB , matrixB);

        multiplyMatrix(matrixA, matrixB, matrixC);

        System.out.println(Arrays.deepToString(matrixC));

    }

    private static void multiplyMatrix(int[][] matrixA, int[][] matrixB, int[][] matrixC) {
        if(matrixA[0].length != matrixB.length){
            System.out.println("Not possible!");
        }
        else{
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j< matrixB[0].length; j++){
                    for(int  o = 0; o<matrixA[0].length; o++){
                        matrixC[i][j] += matrixA[i][o] * matrixB[o][j];
                    }
                }
            }
        }
    }

    private static void getElements(int r, int c ,int[][] matrixA) {
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++) {
                System.out.printf("%d %d :", i, j);
                matrixA[i][j]= sc.nextInt();
            }
        }
    }
}
