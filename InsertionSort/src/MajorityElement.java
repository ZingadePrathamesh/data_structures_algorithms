import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {47,47,72,47,72,47,79,47,12,92,13,47,47,83,33,15,18,47,47,47,47,64,47,65,47,47,47,47,70,47,47,55,47,15,60,47,47,47,47,47,46,30,58,59,47,47,47,47,47,90,64,37,20,47,100,84,47,47,47,47,47,89,47,36,47,60,47,18,47,34,47,47,47,47,47,22,47,54,30,11,47,47,86,47,55,40,49,34,19,67,16,47,36,47,41,19,80,47,47,27};
//        optimizedInsertionSort(nums);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(majorityElement(nums));

        int[] nums2 = {3, 2, 3};
        System.out.println(majorityElement2(nums2));
        System.out.println(majorityElement2(nums));
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

    public static int majorityElement2(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        optimizedInsertionSort(nums);

        int majorityNumber = -1;
        int majorityCount = 0;
        int currentNumber = nums[0];
        int currentCount = 0;

        for(int i: nums){
            if(currentNumber == i){
                currentCount++;
            }
            else{
                currentNumber = i;
                currentCount = 1;
            }
            if(currentCount > majorityCount){
                majorityCount = currentCount;
                majorityNumber = currentNumber;
            }
        }
        return majorityNumber;
    }
}
