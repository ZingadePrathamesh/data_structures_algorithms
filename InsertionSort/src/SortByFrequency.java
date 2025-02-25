import java.util.ArrayList;

public class SortByFrequency {
    public static void main(String[] args) {

    }

    public static int[] frequencySort(int[] nums) {
        if(nums == null || nums.length == 0) return nums;

        int[] result = new int[nums.length];
        int[] arr = new int[201];

        for(int num: nums){
            arr[num+100]++;
        }
        int r = 0;
        while(r < result.length){
            int max = 0;
            int index = 0;
            for(int i = 0; i< arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                    index = i-100;
                }
            }
            if (max == 0) return result;
            while(max > 0 && r < result.length){
                result[r] = index;
                max--;
                r++;
            }
        }
        return result;
    }
}
