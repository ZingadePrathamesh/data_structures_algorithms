import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {-1,0,0,0,0,3,3};
        int a = removeDuplicates(nums);
        System.out.println(a);
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
       int i = 0;
       for(int j = 1; j< nums.length; j++){
           if(nums[i] != nums[j]){
               i++;
               nums[i] = nums[j];
           }
       }
       return ++i;
    }

    public static void mergeSort(int[] nums, int start, int end){

        if(end - start == 1) return;

        int mid = start + (end - start)/2;

        mergeSort(nums, start, mid);
        mergeSort(nums, mid, end);

        merge(nums, start, mid, end);
    }

    public static void merge(int[] nums, int start, int mid, int end){
        int i = start;
        int j = mid;
        int[] result = new int[end - start];
        int r = 0;

        while( i < mid && j < end){
            if(nums[i] > nums[j]){
                result[r] = nums[j];
                j++;
            }else{
                result[r] = nums[i];
                i++;
            }
            r++;
        }

        while(i < mid){
            result[r] = nums[i];
            i++;
            r++;
        }
        while(j < end){
            result[r] = nums[j];
            j++;
            r++;
        }

        System.arraycopy(result, 0, nums, start, result.length);
    }
}
