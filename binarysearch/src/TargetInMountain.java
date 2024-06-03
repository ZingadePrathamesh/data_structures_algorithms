public class TargetInMountain {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println(targetInMountain(arr, 3));
        MountainArray mountainArray = new MountainArray();
        System.out.println(findInMountainArray(2, mountainArray));

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
    /**
     * // This is MountainArray's API interface.
     * // You should not implement it, or speculate about its implementation
     * interface MountainArray {
     *     public int get(int index) {}
     *     public int length() {}
     * }
     */
     public static int findInMountainArray(int target, MountainArray mountainArr) {
            int start = 0;
            int end = mountainArr.length()-1;
            int mid = 0;
            int peak = 0;
            while(start<end){
                mid = start + (end - start)/2;
                int value1 = mountainArr.get(mid);
                int value2 = mountainArr.get(mid+1);
                if(value1 <= value2) start = mid+1;
                else end = mid;
            }
            peak = end;
            System.out.println(peak);
            start = 0;
            while(start <= end){
                mid = start+ (end - start)/2;
                int value1 = mountainArr.get(mid);
                if(value1 == target) return mid;
                else if(value1<target) start = mid+1;
                else end = mid-1;
            }
            start = peak;
            end = mountainArr.length()-1;
            while(start <= end){
                mid = start + (end - start)/2;
                int value1 = mountainArr.get(mid);
                if(value1 == target) return mid;
                else if(value1<target) end = mid-1;
                else start  = mid+1;
            }
            return -1;
     }

}
class MountainArray{
    int[] arr ={1, 2, 3, 4, 5, 3, 1};
    public int get(int index){
        return arr[index];
    }
    public int length(){
        return arr.length;
    }
}