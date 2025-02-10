import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    return new int[]{i, j};
                }
            }
        }
        return new  int[0];
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int complement = target - nums[i];
            if(hashMap.containsKey(complement)){
                return new int[]{i, hashMap.get(complement)};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }
}
