import org.jetbrains.annotations.NotNull;

public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println(peakMountain(arr));

    }


    public static int peakMountain(int @NotNull [] nums){
        int start = 0;
        int end = nums.length-1;
        int mid;
        while(start <= end) {
            mid = start + (end - start)/2;
            if(nums[mid-1] < nums[mid] && nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid-1] < nums[mid] && nums[mid]<nums[mid+1]) {
                start = mid + 1;
            }
            else if(nums[mid-1] > nums[mid] && nums[mid]>nums[mid+1]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
