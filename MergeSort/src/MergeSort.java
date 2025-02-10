import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {8, 3, 6, 5, 1, 9};
        System.out.println(Arrays.toString(mergeSort(nums)));
    }

    public static int[] mergeSort(int[] nums){
        if (nums.length == 0) return new int[0];
        if(nums.length == 1) return nums;

        int[] left = copyOfRange(nums, 0, nums.length/2);
        int[] right = copyOfRange(nums, nums.length/2, nums.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[left.length + right.length];
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                result[k] = left[i];
                i++;
            }
            else{
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            result[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }

    public static int[] copyOfRange(int[] nums, int start, int end){
        if(end<start) throw new IllegalArgumentException();

        int[] result = new int[end - start];

        int j = 0;
        for(int i = start; i<end; i++){
            result[j] = nums[i];
            j++;
        }
        return result;
    }
}
