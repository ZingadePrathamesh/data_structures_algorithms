import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int[] nums2 = {5,4,3,2,1};
//        System.out.println(Arrays.toString(nums));
//        optimizedInsertionSort(nums);
//        System.out.println(Arrays.toString(nums));
        insertionSortRev(nums2);
        System.out.println(Arrays.toString(nums2));
    }
    public static int[] insertionSort(int[] nums){
        for(int i = 0; i<nums.length -1; i++){
            int j = i+1;
            while(j>0){
                if(nums[j]<nums[j-1]){
                    swapFunction(nums, j, j-1);
                    j--;
                }
                else break;
            }
        }
        return nums;
    }

    public static void swapFunction(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void revisionInsertionSort(int[] arr){
        if(arr == null || arr.length == 0) return ;
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j =  i-1;
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void optimizedInsertionSort(int[] nums){
        if(nums.length == 0) {
            return;
        }
        else{
            for (int i = 1; i< nums.length; i++){
                int key = nums[i];
                int j = i- 1;
                while(j>=0 && nums[j] > key){
                    nums[j+1] = nums[j];
                    j--;
                }
                nums[j+1] = key;
            }
        }
    }

    public static void insertionSortRev(int[] nums){
        if(nums == null || nums.length == 0){
            return ;
        }
        boolean flag = true;
        for(int i = 0 ; i< nums.length - 1 ; i++){
            if(nums[i] > nums[i+1]){
                flag  = false;
                break;
            }
        }
        if(flag) return;

        for(int i = 1; i < nums.length; i++){
            int key = nums[i];
            int j = i-1;
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }
}
