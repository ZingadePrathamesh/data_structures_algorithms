public class NandItsDouble {
//    Given an array arr of integers, check if there exist two indices i and j such that :
//    i != j
//    0 <= i, j < arr.length
//    arr[i] == 2 * arr[j]

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 8, 0, 4};
        System.out.println(isDouble(nums));
        System.out.println(isDoubleUnsorted(nums));
    }

    public static boolean isDouble(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int mid= 0; int target = 0;
        for(int i = 0; i<nums.length-1; i++){
            start = i+1; target = 2*nums[i]; end = nums.length-1;
            while(start<=end){
                mid = start + (end - start)/2;
                if(nums[mid] ==  target) return true;
                else if(nums[mid]> target)  end  = mid -1;
                else start= mid + 1;
            }
        }
        return false;
    }
    public static boolean isDoubleUnsorted(int[] nums){
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]*2 == nums[j]) return true;
            }
        }
        for(int i = nums.length -1; i>0; i--){
            for(int j =  i-1; j>=0; j--){
                if(nums[i]*2 == nums[j]) return true;
            }
        }
        return false;
    }
}
