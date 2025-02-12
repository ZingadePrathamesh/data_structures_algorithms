import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {8, 3, 6, 1, 4, 2};
        int[] nums2 = {8, 3, 2, 4, 5, 1};
        quickSort(nums, 0, nums.length-1);
        quickSort(nums2, 0, nums2.length-1);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
    }

    public static void quickSort(int[] nums, int low, int high){
        if(nums == null || nums.length == 0) return;
        if(low >= high) return ;

        int start = low;
        int end = high;

        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while(start <= end){
            while(nums[start] < pivot){
                start++;
            }
            while(nums[end] > pivot){
                end--;
            }
            if(start <= end){
                swap(nums, start++, end--);
            }
        }

        quickSort(nums, low, end);
        quickSort(nums, start, end);
    }

    public static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
