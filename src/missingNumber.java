public class missingNumber {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i< 100; i++){
            nums[i] = i+1;
        }

        nums[54] = Integer.MIN_VALUE;
        nums[69] = Integer.MIN_VALUE;

        System.out.print("Missing Numbers: ");
        for (int i = 0; i<nums.length; i++){
            if(nums[i] != i+1) System.out.print(i+1+", ");
        }
    }
}
