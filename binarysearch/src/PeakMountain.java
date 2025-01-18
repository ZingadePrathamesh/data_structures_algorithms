public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        int[] arr2 = {3,5,5,2,0};
        int[] arr3 = {3,5,5,5,5,8,2,0};
        System.out.println(peakMountain(arr));
        System.out.println(peakMountainLinear(arr));
        System.out.println(peakMountainBinary(arr));
        System.out.println(peakMountainBinary(arr2));
        System.out.println(peakMountainBinary(arr3));
        System.out.println(peakMountain(arr3));
    }


    public static int peakMountain(int [] nums){
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

    public static int peakMountainBinary(int[] nums){
        int start = 0; int end = nums.length-1;
        int mid = 0;
        while(start<end){
            mid = start + (end - start)/2;
            if(nums[mid] < nums[mid+1]) start = mid +1;
            else if(nums[mid] ==  nums[mid+1]) start = mid+1;
            else end = mid;
        }
        return end;
    }
}
