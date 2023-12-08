public class TargetInMountain {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println(targetInMountain(arr, 3));

    }

    public static int targetInMountain(int[] nums, int target){
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

        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target) start = mid +1 ;
            else end = mid-1;
        }

        end = nums.length-1;
        start = high;

        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target) end = mid -1;
            else start = mid +1;
        }
        return -1;
    }
}
