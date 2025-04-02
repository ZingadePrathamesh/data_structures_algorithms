import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {8, 3, 6, 5, 1, 9};
//        System.out.println(Arrays.toString(mergeSortRev(nums));
        mergeSortRev(nums, 0, 6);
        System.out.println(Arrays.toString(nums));
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

    public static void mergeSortRev(int[] nums, int start, int end){
        if(end - start == 1) return;
        int mid = start + (end - start )/2;

        mergeSortRev(nums, start, mid);
        mergeSortRev(nums, mid, end);

        mergeArr(nums, start, mid, end);
    }

    public static void mergeArr(int[] nums, int start, int mid, int end){
        int i = start;
        int j = mid;
        int r = 0;
        int[] result = new int[end - start];

        while(i < mid && j < end){
            if(nums[i] < nums[j]){
                result[r] = nums[i];
                i++;
            }else{
                result[r] = nums[j];
                j++;
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


    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
