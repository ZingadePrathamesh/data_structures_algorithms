import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};

        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] arr = new int[2];
        Arrays.sort(bobSizes);

        int sumA = Arrays.stream(aliceSizes).sum();
        int sumB = Arrays.stream(bobSizes).sum();
        int delta = (sumA - sumB)/2;

        for(int x : aliceSizes){
            int y = x-delta;
            if(binarySearch(bobSizes, y)){
                arr[0] = x;
                arr[1] = y;
                return arr;
            }
        }
        return arr;
    }

    public  static boolean binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int mid;

        while(start<=end){
            mid = start + (end - start) / 2 ;
            if(nums[mid] == target) return true;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
}
