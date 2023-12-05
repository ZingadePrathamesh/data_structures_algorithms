public class firstAndLastPosition {
    public static void main(String[] args) {

    }
    public static int[] firstAndLastPosition(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int mid;


        if(nums.length == 0 || target > nums[end]) return new int[]{-1, -1};
        while(start <= end){
            mid = start + (end - start)/2;
            if(target == nums[mid]){
                
            }
            if(nums[mid] > target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return nums[start];
    }

}
