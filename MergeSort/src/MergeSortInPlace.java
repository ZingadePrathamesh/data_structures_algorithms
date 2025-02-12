import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] nums = {8, 3, 6, 5, 1};
        System.out.println(Arrays.toString(nums));
        mergeSort(nums, 0, nums.length);
        System.out.println(Arrays.toString(nums));
    }
    public static void mergeSort(int[] nums, int start, int end){
        if(end - start == 1){
            return ;
        }

        int mid = start + (end-start)/2;

        mergeSort(nums, start, mid);
        mergeSort(nums, mid, end);

        merge(nums, start, mid, end);
    }

    public static void merge(int[] nums, int start, int mid, int end){
        int i = start;
        int j = mid;
        int k = 0;

        int[] result = new int[end - start];

        while(i < mid && j < end){
            if(nums[i] < nums[j]){
                result[k] = nums[i];
                i++;
            }else {
                result[k] = nums[j];
                j++;
            }
            k++;
        }
        while(i < mid){
            result[k] = nums[i];
            i++;
            k++;
        }
        while(j < end){
            result[k] = nums[j];
            j++;
            k++;
        }
        System.arraycopy(result, 0, nums, start, result.length);
    }

}
