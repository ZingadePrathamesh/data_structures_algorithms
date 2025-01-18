public class Revision {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(binarySearchRev(nums, 9));
//        System.out.println(binarySearchRecursion(nums, 9, 0, nums.length-1));
//        System.out.println(binarySearchRev(nums, 1));
//        System.out.println(binarySearchRecursion(nums, 1, 0, nums.length-1));

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {3, 4, 5, 1, 2};
        int[] nums3 = {5, 1, 2, 3, 4};
        int[] nums4 = {1};
        System.out.println(searchPivot(nums1));
        System.out.println(searchPivot(nums2));
        System.out.println(searchPivot(nums3));
        System.out.println(searchPivot(nums4));
    }

    public static int binarySearchRev(int[] nums, int target){
        if(nums == null || nums.length == 0){
            return -1;
        }
        int start=  0;
        int end = nums.length -1;
        int mid = start + (end - start)/2 ;

        while(start <= end){
            mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] nums, int target, int start, int end){
        if(start > end) return -1;
        else{
            int mid = start + (end - start)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) return binarySearchRecursion(nums, target, mid+1, end);
            else return binarySearchRecursion(nums, target, start, mid - 1);
        }
    }

    public static int searchPivot(int[] nums){
        if(nums == null || nums.length == 0) return -1;
        if(nums.length == 1) return 0;
        if(nums[nums.length-1]>nums[0]) return nums.length-1;
        int start = 0;
        int end = nums.length-1;
        int mid = start + (end - start)/2;

        while(start<=end){
            mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid+1]) return mid;
            else if(mid>start && nums[mid]<nums[mid-1]) return mid-1;
            else if(nums[start] > nums[mid]) end = mid - 1;
            else if(nums[start] <= nums[mid]) start = mid+1;
        }
        return -1;
    }



}
