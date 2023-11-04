import java.util.Arrays;
import java.util.Scanner;

public class twoSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {2, 3, 4, 5, 6, 7, 10};
        int target = 9;

        findPair(nums, target);
    }
    public static void findPair(int[] nums, int sum){
        int[] pair = new int[2];
        for (int i = 0; i<nums.length;i++){
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == sum) {
                        pair[0] = i;
                        pair[1] = j;
                        System.out.println(Arrays.toString(pair) + ", ");
                }
            }
        }
    }
}
