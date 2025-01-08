import java.util.ArrayList;
import java.util.Arrays;

public class MaxProductOfTwoElements {
    public static void main(String[] args) {
        int[] nums ={3,4,5,2};
        int[] nums2 = {-100,-2,-3,1};
        System.out.println(maxProductOptimized(nums));
        System.out.println(maximumProduct(nums2));
    }

    public static int maxProductOptimized(int[] nums){
        int max1 = Integer.MIN_VALUE;
        int max2 = max1;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] > max1){
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i] > max2){
                max2 = nums[i];
            }
        }

        return (max1 - 1 ) * (max2 - 1);
    }
    public static int maxProduct(int[] nums) {
        ArrayList<Integer> numsCopy = new ArrayList<>();
        for (int num : nums) {
            numsCopy.add(num);
        }
        numsCopy.sort(null);
        if(numsCopy.size() ==  0){
            return 0;
        }
        else if(numsCopy.size() == 1){
            return numsCopy.get(0);
        }
        else if(numsCopy.size() == 2){
            return (numsCopy.get(0)-1) * (numsCopy.get(1)-1);
        }
        else{
            int i = numsCopy.size()-1;
            int j = numsCopy.size()-2;
            return (numsCopy.get(i)-1) * (numsCopy.get(j)-1);
        }
    }

    public static int maximumProduct(int[] nums) {
        InsertionSort.optimizedInsertionSort(nums);
         int max1 = nums[0] * nums[1];
         int max2 = nums[nums.length - 1] * nums[nums.length - 2];

         return max1 > max2 ? max1: max2;
    }
}
