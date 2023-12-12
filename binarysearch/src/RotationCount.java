public class RotationCount {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 1, 2, 3};

        System.out.println(rotationCount(nums));
    }

    public static int rotationCount(int[] nums){
        int start = 0;
        int end = nums.length -1;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(mid < end && nums[mid]> nums[mid+1]){
                return mid +1;
            }
            else if(mid > start && nums[mid]<nums[mid-1]){
                return mid -1;
            }
            else if(nums[start]> nums[mid]) end = mid -1;
            else if(nums[start]<= nums[mid]) start = mid + 1;
        }
        return 0;
    }
}
