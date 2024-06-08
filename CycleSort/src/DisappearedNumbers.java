import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<Integer>();
        cycleSort(nums);
        for(int i = 0; i<nums.length; i++){
            if(i+1 != nums[i]) disappearedNumbers.add(i+1);
        }
        System.out.println(Arrays.toString(nums));
        return disappearedNumbers;
    }
    public static void cycleSort(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correct=  nums[i] -1;
            if(correct<nums.length){
                if(nums[i] != nums[correct]) swap(nums, i, correct);
                else i++;
            }
            else i++;
        }
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
