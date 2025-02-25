import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
//        int[] nums = {8, 3, 6, 1, 4, 2};
//        int[] nums2 = {8, 3, 2, 4, 5, 1};
//        quickSortRevisino(nums, 0, nums.length-1);
//        quickSortRevisino(nums2, 0, nums2.length-1);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(nums2));

        testQuickSort();
    }

    public static void testQuickSort() {
        int[][] testCases = {
                {8, 3, 6, 1, 4, 2},          // Random order
                {3,5,1},          // Random order
                {8, 3, 2, 4, 5, 1},          // Another random order
                {1, 2, 3, 4, 5, 6},          // Already sorted array
                {6, 5, 4, 3, 2, 1},          // Reverse sorted array
                {5, 3, 8, 3, 2, 5, 7, 5},    // Array with duplicates
                {1},                         // Single-element array
                {}                           // Empty array
        };

        for (int i = 0; i < testCases.length; i++) {
            int[] arr = testCases[i];
            quickSortRevision(arr, 0, arr.length - 1);
            System.out.println("Sorted Array " + (i + 1) + ": " + Arrays.toString(arr));
        }
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

    public static void quickSortRevision(int[] nums, int s, int e){
        int start = s;
        int end = e;
        if(end - start < 1) return ;
        if(nums == null || nums.length == 0) return ;
        int mid = start + (end - start)/2;
        int pivot = nums[mid];

        while( start <= end ){
            while(nums[start] < pivot) start++;
            while(nums[end] > pivot) end--;
            if(start <= end){
                swap(nums, start++, end--);
            }
        }

        quickSortRevision(nums, s, end);
        quickSortRevision(nums, start, e);
    }
}
