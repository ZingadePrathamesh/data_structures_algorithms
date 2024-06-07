import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 5 ,3, 4};
        int[] nums2 = {1, 2, 5};
        System.out.println(Arrays.toString(intersection(nums, nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(int i: nums1){
            for(int j: nums2){
                if(i == j){
                    if(!results.contains(i)) results.add(i);
                }
            }
        }
        int[] result = new int[results.size()];
        for(int i = 0; i<result.length; i++){
            result[i] = results.get(i);
        }
        return  result;
    }
}
