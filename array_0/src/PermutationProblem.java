class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            int index = nums[i];
            ans[i] = nums[index];
        }
        return ans;
    }
}

public class PermutationProblem {
    public static void main(String[] args) {
        System.out.println("solved");
    }
}
