import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,6, 7, 8, 9};
        System.out.println(binarySearch(nums,9));
    }

    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int mid= (left+right) /2;
        if(nums.length == 0) return -1;
        else{
            while(left<=right){
                System.out.println(nums[mid]);
                System.out.println(target);
                if(nums[mid] == target){
                    System.out.println("Element found at index: "+ mid);
                    return mid;
                }
                else if(nums[mid]< target){
                    left = mid+1;
                    mid= (left+right) /2;
                }
                else{
                    right = mid;
                    mid= (left+right) /2;
                }
            }
        }
        return -3;
    }
}
