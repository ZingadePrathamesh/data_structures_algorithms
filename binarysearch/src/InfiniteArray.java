import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int[] nums = {1, 2, 3 ,4,5 ,6,7 ,8, 9, 10};

        for(int i = 0; i<array.length; i++){
            array[i] = i*2;
        }

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        System.out.println(positionOfNumber(array, 300));
        System.out.println(positionInInfiniteArray(array, 500));
        System.out.println(positionInInfiniteArray(nums, 8));
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

    public static int positionInInfiniteArray(int[] nums, int target){
        if(nums == null) return Integer.MIN_VALUE;
        else{
            int start = 0;
            int mid = 0; int end = 1;
            while(nums[end] < target){
                start = end+1;
                end *= 2; 
            }
            while(start <= end){
                mid = start + (end - start)/2;
                if(nums[mid] == target) return mid;
                else if(nums[mid] < target) start = mid + 1;
                else{
                    end = mid - 1;
                }
            }
            return Integer.MIN_VALUE;
        }
    }
}
