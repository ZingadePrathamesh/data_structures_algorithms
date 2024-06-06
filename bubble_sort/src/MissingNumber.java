public class MissingNumber {
    public static void main(String[] args) {
        //which number is missing in the range
        //Given an array nums containing n distinct numbers in the range [0, n], return the
        // only number in the range that is missing from the array.
        int[] nums = {0, 1, 3, 2, 4, 5, 7, 8, 9};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums){
        int expectedSum = nums.length*(nums.length+1)/2;
        int actualSum = 0 ;
        for(int i: nums){
            actualSum+=i;
        }
        return expectedSum - actualSum;
    }
}
