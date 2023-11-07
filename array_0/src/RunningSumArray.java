public class RunningSumArray {
    public static void main(String[] args) {
        System.out.println("100%beat");
    }
}

class SolutionR {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] ans = new int[nums.length];
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}
