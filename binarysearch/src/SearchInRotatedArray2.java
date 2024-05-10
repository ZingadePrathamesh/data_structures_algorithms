public class SearchInRotatedArray2 {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int[] arr = {1, 0, 1, 1 ,1};
        System.out.println(searchPivot(arr));
        System.out.println(searchInRotatedArray(arr, 0));
        int peak = searchPivot(nums);
        System.out.println(peak);

    }

    public static int searchPivot(int[] nums){
        int start = 0;
        int end = nums.length -1;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(mid < end && nums[mid]> nums[mid+1]){
                return mid;
            }
            else if(mid > start && nums[mid]<nums[mid-1]){
                return mid -1;
            }
            else if(nums[start]>= nums[mid]) end = mid -1;
            else if(nums[start]<nums[mid]) start = mid + 1;
        }
        return -1;
    }

    public static boolean searchInRotatedArray(int[] nums, int target){
        int max = searchPivot(nums);
        int start = 0; int end = max;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target) return true;
            else if(nums[mid]> target) end = mid-1;
            else start = mid+1;
        }
        start = max+1; end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target) return true;
            else if(nums[mid]> target) end = mid-1;
            else start = mid+1;
        }
        return false;
    }
}