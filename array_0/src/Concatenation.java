public class Concatenation {
    public static void main(String[] args) {
        System.out.println();
    }
}
class SolutionC {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 *  nums.length];
        for(int i = 0; i< nums.length ; i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}

