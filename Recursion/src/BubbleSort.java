import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 4, 2};
        bubbleSort(nums, 0, 0);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[]nums, int row, int col){
        if(nums.length - row <= 1) return ;
        sort(nums, row, col);
        bubbleSort(nums, ++row, col);
        return;
    }

    public static void sort(int[]nums, int row, int col){
        if(col >= nums.length - row - 1) return;
        if(nums[col] > nums[col+1]) swap(nums, col, col+1);
        sort(nums, row, col+1);
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
