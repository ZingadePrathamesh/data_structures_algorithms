import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = new int[101];
        for (int i = 0; i<101; i++) {
            nums[i] = i;
        }
        System.out.println(Arrays.toString(nums));
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        linearSearching(nums, target);
    }

    public static int linearSearching(int[] nums, int target){
        if(nums == null || nums.length == 0){
            System.out.println("Empty array");
            return -1;
        }
        for(int i =0; i<nums.length; i++){
            if(nums[i]==target){
                System.out.println("Found at index: " + i);
                return i;
            }
        }
        System.out.println("Target does not exists.");
        return -1;
    }

}
