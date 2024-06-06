import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 4,3, 2, 1};
        System.out.println(Arrays.toString(nums));
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] selectionSort(int[] nums){
        if(nums.length == 0 || nums== null){
            System.out.println("Invalid array.");
            return new int[0];
        }
        for(int  i = 0; i< nums.length; i++) {
            int max = 0;
            for(int j = 0; j<nums.length - i; j++){
                if(nums[j] > nums[max]) max = j;
            }
            int temp = nums[nums.length - i -1];
            nums[nums.length - i -1] = nums[max];
            nums[max] = temp;
        }
        return nums;
    }
}
