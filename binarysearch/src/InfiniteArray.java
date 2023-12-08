import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] array = new int[1000];

        for(int i = 0; i<array.length; i++){
            array[i] = i;
        }

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        System.out.println(positionOfNumber(array, 300));
    }

    public static int positionOfNumber(int[] nums, int target){
        int start = 0;
        int end = 10;
        int mid;
        while(target >= nums[end]){
            if(target > nums[end]){
                start = end+1;
                end = end*2;
            }
        }
        while(start<=end){
            mid = start + (end - start)/2;
            if(target == nums[mid]) return mid;
            else if(target < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
