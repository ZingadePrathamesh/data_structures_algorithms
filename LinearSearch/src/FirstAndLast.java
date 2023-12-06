import java.util.Arrays;

public class FirstAndLast {

    public static void main(String[] args) {
        int[] nums = {2, 2, 4, 5, 6, 7, 8, 8, 9 ,10, 10, 10, 10, 11, 12};
        System.out.println(Arrays.toString(firstAndLast(nums, 2)));
        System.out.println(Arrays.toString(firstAndLast(nums, 8)));
        System.out.println(Arrays.toString(firstAndLast(nums, 10)));

    }

    public static int[] firstAndLast(int[] nums, int target){
        int start =-1 , end = -1;
        for(int i = 0; i< nums.length; i++){
            if(target == nums[i] && start == -1){
                start = i;
                end = i;
            }
            else if(target == nums[i] && start != -1){
                end = i;
            }
        }
        return new int[]{start, end};
    }
}
