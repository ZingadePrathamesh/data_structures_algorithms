public class FindDuplicateNumbers {
    public static void main(String[] args) {
        int nums[] = {3,3,3,3,3};
        System.out.println(duplicateNumber(nums));
    }
    public static int duplicateNumber(int[] nums){
        cycleSort(nums);
        return nums[nums.length-1];
    }
    public static void cycleSort(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correct =  nums[i] -1;
            if(nums[correct] != nums[i]) swap(nums, i, correct);
            else i++;
        }
    }
    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}

