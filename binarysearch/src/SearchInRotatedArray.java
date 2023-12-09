public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = { 5, 1, 3};
        System.out.println(rotatedArray(nums, 5));
    }

    public static int rotatedArray(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int mid; int high= 0;
        while(start <end){
            mid = start + (end - start)/2;
            if(nums[mid] < nums[mid+1]) start = mid +1;
            else end = mid;
        }
        high = start;
        end = high;
        start = 0;
        System.out.println(nums[high]);
        if(nums[high] == target) return high;

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
}
