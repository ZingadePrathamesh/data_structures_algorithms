import java.util.Arrays;

public class swapping {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(nums));
        reverse(nums);
        System.out.println(Arrays.toString(nums));
        swap(nums, 0, 9);
        System.out.println(Arrays.toString(nums));
        System.out.println(max(nums));
    }

    public static void reverse(int[] nums){
        for (int i = 0; i<nums.length/2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
    }
    public static void swap(int[] nums, int index1, int index2){
        if(index1<=0 && index2< nums.length) {
            int temp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = temp;
        }
        else throw new IndexOutOfBoundsException();
    }
    public static int max(int[] nums){
        int max = 0;
        for (int n: nums){
            if(n > max) max= n;
        }
        return max;
    }
}
