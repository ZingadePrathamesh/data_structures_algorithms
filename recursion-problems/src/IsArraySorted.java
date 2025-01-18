import java.lang.reflect.Array;
import java.util.Arrays;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] nums ={1, 2, 3, 4, 5};
        int[] nums2 = {2, 5, 1, 6, 3};
        int[] nums3 = {2, 1};
        int[] nums4 = {2, 2, 2, 2};
        System.out.println(isArraySortedOrNot(nums, nums.length-1));
        System.out.println(isArraySortedOrNot(nums2, nums2.length-1));
        System.out.println(isArraySortedOrNot(nums3, nums3.length-1));
        System.out.println(isArraySortedOrNot(nums4, nums4.length-1));

        System.out.println(Arrays.toString(nums4));
        changeArray(nums4);
        System.out.println(Arrays.toString(nums4));

    }

    public static boolean isArraySortedOrNot(int[] nums, int index){
        if(index <= 0){
            return true;
        }
        else{
            if(nums[index] < nums[index - 1 ]) return false;
            return isArraySortedOrNot(nums, index - 1);
        }
    }

    public static void changeArray(int[] nums){
        nums[0] = 5;
    }
}
