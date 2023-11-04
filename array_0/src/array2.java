import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
//        int[][] nums = {
//                {1, 2, 3}
//                ,{4, 5}
//                ,{7, 8, 9}
//        };
//        for (int[] num: nums) {
//            for (int n :num) {
//                System.out.print(n + " ");
//            }
//            System.out.println();
//        }

        int[][] nums2 = {
                new int[4],
                new int[2],
                new int[5]
        };
        for (int[] num: nums2) {                    //for(int i = 0; i< nums2.length; i++){
            for (int n: num) {                          //for(int j = 0; j< nums2[i].length; j++){
                System.out.print("Enter: ");            // }
                n = in.nextInt();                       //}
            }
            System.out.println();
        }

    }
}
