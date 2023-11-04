import java.util.Arrays;
import java.util.Scanner;

public class PlayerOfTheSeason {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int scoreBoard[][];
        System.out.println("Enter the number of Player: ");
        int numberOfPlayers = sc.nextInt();
        System.out.println("Enter the number of season: ");
        int numberOfSeasons = sc.nextInt();

        scoreBoard = new int[numberOfPlayers][numberOfSeasons];


        getElements(scoreBoard);
        System.out.println("The ScoreBoard You Provided: ");
        showScoreBoard(scoreBoard);
        System.out.println("According to this the star Player is");

        System.out.println("Player no, : "+starPlayers(scoreBoard));

    }

    private static int starPlayers(int[][] matrix){
        int record[] = new int[matrix.length];
        int index = 0;
        for (int i = 0; i< matrix[0].length; i++){
            int largest = -1;
            for(int j = 0; j < matrix.length; j++){
                if(largest == matrix[j][i]){record[j]++;}
                if(largest < matrix[j][i]){largest = matrix[j][i]; index = j;}
            }
            record[index]++;
        }
        int largest = -1;
        int max =0 ;
        for (int i = 0; i < record.length; i++) {
            if(largest< record[i]){largest = record[i]; max = i;}
        }
        return max;
    }

    private static void getElements(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("Player: %d, Season: %d :: ", i, j);
                matrix[i][j]= sc.nextInt();
            }
        }
    }

    private static void showScoreBoard(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
