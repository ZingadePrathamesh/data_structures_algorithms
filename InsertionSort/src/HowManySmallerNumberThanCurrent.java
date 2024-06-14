import java.util.ArrayList;
import java.util.Arrays;

public class HowManySmallerNumberThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> numsCopy = new ArrayList<Integer>(nums.length);
        for(int i :nums){
            numsCopy.add(i);
        }
        numsCopy.sort(null);
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(nums[i] == numsCopy.get(j)){
                    nums[i]= j;
                    break;
                }
            }
        }
        return nums;
    }
    public static int[] optimizedSolution(int[] nums){
        //create a new array of 101 size;
        int[] arr = new int[101];

        //now increment the value of every nums in arr by 1 each time it appears in num
        for(int i = 0; i<nums.length; i++){
            arr[nums[i]]++;
        }

        //now add the value of the previous value of arr[i] in the current arr
        for(int i = 1; i< arr.length; i++){
            arr[i] += arr[i-1];
        }

        //now swap the nums value with the number of smaller number present in the nums
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0) nums[i] = 0;
            else nums[i] = arr[nums[i] -1];
        }
        return nums;
    }
}
