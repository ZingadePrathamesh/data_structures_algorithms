public class setMismatch {
    //You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers
    // in s got duplicated to another number in the set, which results in repetition of
    // one number and loss of another number.
    //
    //You are given an integer array nums representing the data status
    // of this set after the error.
    //
    //Find the number that occurs twice and the number that is missing and
    //return them in the form of an array.
    public static void main(String[] args) {

    }
    public static int[] findErrorNums(int[] nums) {
        cycleSort(nums);
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != i+1) return new int[]{nums[i], i+1};
        }
        return new int[]{-1, -1};
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
