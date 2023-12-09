public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(rotatedArray(nums, 1));
    }

    public static int rotatedArray(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int mid;
        int high = findPivot(nums);

        end = high;
        start = 0;

        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target) start = mid +1 ;
            else end = mid-1;
        }

        end = nums.length-1;
        start = high+1;

        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target)start = mid +1;
            else end = mid -1 ;
        }
        return -1;
    }

    public static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int mid;
        while(start  <end){
            mid = start + (end - start)/2;
            if(mid < end && nums[mid]>nums[mid+1]) return mid;
            if(mid > start && nums[mid]< nums[mid -1]) return mid-1;
            if(nums[start]<=nums[mid]) start = mid + 1;
            else end = mid -1;
        }
        return -1;
    }


}
