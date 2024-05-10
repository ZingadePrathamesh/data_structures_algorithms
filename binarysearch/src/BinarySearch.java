import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {12, 13, 14, 15, 16, 18, 20 , 22, 25, 27, 29, 32};
        int target = 183;

        System.out.println(binarySearch(nums, target));
        System.out.println(binarySearchRevised(nums, target));
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
        if(nums.length == 0){
            System.out.println("Array is empty");
            return -1;
        }

        int left = 0;
        int right = nums.length-1;
        int mid;

        while(left <= right) {
            mid = left + (right - left)/2;
            if(target == nums[mid]) return mid;
            else if(target < nums[mid]) {
                right = mid - 1;
            }
            else if(target > nums[mid]) {
                left = mid + 1;
            }
            else {
            }
        }
        return -1;
    }

    public static int binarySearchRevised(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;
        if(arr.length == 0||arr == null){
            System.out.println("Invalid Array");
            return Integer.MAX_VALUE;
        }
        else{
            while(start<=end){
                if (arr[mid] == target){
                    System.out.println("Target found at index: " + mid);
                    return mid;
                }
                else if(arr[mid]>target){
                    end = mid;
                }
                else{
                    start = mid+1;
                }
                mid = start + (end -start)/2;
            }
            System.out.println("Target not found!");
            return Integer.MAX_VALUE;
        }
    }
}
