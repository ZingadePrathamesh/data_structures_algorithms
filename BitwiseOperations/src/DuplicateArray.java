public class DuplicateArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        System.out.println(notDuplicateElement(nums));
    }
    public static int notDuplicateElement(int[] nums){
        int notDuplicate = 0;
        for (int i = 0; i< nums.length; i++){
            notDuplicate = notDuplicate ^ nums[i];
        }
        return notDuplicate;
    }
}
