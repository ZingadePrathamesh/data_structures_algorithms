import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 0, 1};
        int[] sortedNums = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] bubbleSort(int[] nums){
        boolean swapped;
        for(int  i=  0; i< nums.length; i++){
            swapped=false;
            for(int j = 1; j<nums.length - i;j++){
                if(nums[j-1] > nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) return nums;
        }

        return nums;
    }

}
