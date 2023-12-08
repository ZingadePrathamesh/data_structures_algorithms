import org.jetbrains.annotations.NotNull;

public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println(peakMountain(arr));
        System.out.println(peakMountainLinear(arr));

    }


    public static int peakMountain(int @NotNull [] nums){
        int start = 0;
        int end = nums.length-1;
        int mid;
        while(start < end){
            mid = start + (end - start)/2;
            if(nums[mid]> nums[mid + 1]) end = mid;
            else start = mid + 1;
        }
        return start;
    }

    public static int peakMountainLinear(int nums[]){
        for(int i = 1; i < nums.length; i++){

            if(nums[i]<nums[i-1]) return i-1;
        }
        return -1;
    }
}
