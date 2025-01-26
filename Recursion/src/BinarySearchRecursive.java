public class BinarySearchRecursive {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4 ,5, 6, 7, 8, 9 ,10};
        System.out.println(binarySearchRecursive(nums, 0, nums.length-1, 7));

        int nums1[] = {5, 6, 7, 1, 2, 4};
        System.out.println(rotatedArray(nums1, 0, nums1.length, 5));
        System.out.println(rotatedArray(nums1, 0, nums1.length, 4));
        System.out.println(rotatedArray(nums1, 0, nums1.length, 1));
    }
    public static int binarySearchRecursive(int[] nums, int start, int end, int target){
        int mid = start + (end - start)/2;
        if(start>end){
            return -1;
        }
        else if(nums[mid] == target) return mid;
        else if(nums[mid]> target) return  binarySearchRecursive(nums, start, mid-1, target);
        else return binarySearchRecursive(nums,mid+1, end, target);
    }

    public static int rotatedArray(int[] nums, int start, int end, int target){
        if(start > end) return -1 ;
        int mid =  start + (end - start) / 2 ;
        if(nums[start] <= nums[mid]){
            if(nums[mid] > target && nums[start] <= target) return rotatedArray(nums, start, mid - 1, target);
            else return rotatedArray(nums, mid+1, end, target);
        }
        else{
            if(nums[mid] < target && nums[end] > target ) return rotatedArray(nums, mid+1, end, target);
            else return rotatedArray(nums, start, mid - 1, target);
        }
    }
}
