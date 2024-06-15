import java.util.ArrayList;
import java.util.Arrays;

public class IncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = {5, 1, 1, 1, 2, 2};
        increasingFrequency(nums);
    }
    public static int[] increasingFrequency(int[] nums){
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>(nums.length);
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<arrayList.size(); j++){
                if(arrayList.get(j).contains(nums[i])) arrayList.get(j).set(1, arrayList.get(j).get(1)+1);
                break;
            }
            arrayList.add(new ArrayList<Integer>(Arrays.asList(nums[i], 1)));
        }
        System.out.println(Arrays.toString(arrayList.toArray()));
        return nums;
    }
}
