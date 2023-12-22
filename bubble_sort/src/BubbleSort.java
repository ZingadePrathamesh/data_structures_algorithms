import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 4, 2};
        System.out.println(Arrays.toString(nums));
        nums= bubbleSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static int[] bubbleSort(int[] nums){
        int length = nums.length-1;
        while(length>=0){
            for(int i = 0; i< length; i++){
                if(nums[i]>nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
            length--;
        }
        return nums;
    }
}
