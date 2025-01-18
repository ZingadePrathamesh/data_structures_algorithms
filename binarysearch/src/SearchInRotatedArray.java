public class SearchInRotatedArray {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int[] arr = {2,5,6,0,0,1,2};
        System.out.println(searchPivot(arr));
        int peak = searchPivot(nums);
        System.out.println(peak);
        System.out.println(searchInRotatedArray(nums, 0, peak, 5));
        System.out.println(searchInRotatedArray(nums, peak+1, nums.length-1, 5));


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
//            else if(nums[end]>nums[start]) return end;
            else if(nums[start]> nums[mid]) end = mid -1;
            else if(nums[start]<= nums[mid]) start = mid + 1;
        }
        return -1;
    }

    public static int searchInRotatedArray(int[] nums, int start , int end, int target){
        int mid;
        while(start<=end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]> target) end = mid -1;
            else start = mid +1;
        }
        return -1;
    }
}