import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[9];
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7,8, 9};
        for(int i = 0; i< 9; i++){
            nums[i] = 10-i;
        }

//        System.out.println(intelligentBinarySearch(nums, 2));
        System.out.println(intelligentBinarySearch(nums2, 9));
    }


    public static int intelligentBinarySearch(int[] nums, int target){
        if(nums.length == 0){
            System.out.println("Array is empty");
            return -1;
        }
        int left = 0;
        int right = nums.length-1;
        boolean isAsc = nums[left]<nums[right];
        int mid;
        while(left<=right){
            mid = left + (right - left) /2;
            System.out.println(nums[mid]);
            System.out.println(target);
            if(nums[mid] == target){
                System.out.println("Element found at index: "+ mid);
                return mid;
            }
            if(isAsc){
                if(nums[mid]< target){
                    left = mid+1;
                }
                else {
                    right = mid - 1;
                }
            }
            else{
                if(nums[mid]< target){
                    right = mid - 1;
                }
                else {
                    left = mid+1;
                }
            }
        }
        return -1;
    }
    public static int binarySearch(int @NotNull [] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int mid= left + (right - left) /2;
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
                    mid= left + (right - left) /2;
                }
                else{
                    right = mid-1;
                    mid= left + (right - left) /2;
                }
            }
        }
        return -3;
    }
}
