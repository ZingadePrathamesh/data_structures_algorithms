import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums={1,56,98,78,74,25,12,10,-70};
        System.out.println(minimumNumber(nums));
    }

    public static int linearSearching(int[] nums, int target){
        if(nums == null || nums.length == 0){
            System.out.println("Empty array");
            return Integer.MAX_VALUE;
        }
        for(int i =0; i<nums.length; i++){
            if(nums[i]==target){
                System.out.println("Found at index: " + i);
                return i;
            }
        }
        System.out.println("Target does not exists.");
        return Integer.MAX_VALUE;
    }

    public static boolean linearSearchString(String str, char target){
        if(str.length() == 0) return false;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == target){
                System.out.printf("Character %c found at index %d.\n", target, i);
                return true;
            }
        }
        System.out.println("Character does not exist in string!");
        return false;
    }

    public static int minimumNumber(int nums[]){
        int min = Integer.MAX_VALUE;
        for (int num: nums){
            if(min>num) min = num;
        }
        return min;
    }

}
