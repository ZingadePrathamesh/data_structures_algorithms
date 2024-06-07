import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        optimizedInsertionSort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int majorityNumber = 0;
        int majorityCount = 0;
        int currentNum= nums[0];
        int currentNumCount = 0;
        for(int i = 0; i<nums.length; i++){
            if(currentNum ==  nums[i]) currentNumCount++;
            else{
                if(majorityCount<currentNumCount){
                    majorityCount = currentNumCount;
                    majorityNumber = currentNum;
                }
                currentNum = nums[i];
                currentNumCount = 1;
            }
        }
        if(majorityCount<currentNumCount){
            majorityCount = currentNumCount;
            majorityNumber = currentNum;
        }
        return majorityNumber;
    }
    public static int[] optimizedInsertionSort(int[] nums){
        if(nums.length == 0) return new int[0];
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
            return nums;
        }
    }
}
