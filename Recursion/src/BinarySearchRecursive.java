public class BinarySearchRecursive {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4 ,5, 6, 7, 8, 9 ,10};
        System.out.println(binarySearchRecursive(nums, 0, nums.length-1, 7));
    }
    public static int binarySearchRecursive(int[] nums, int start, int end, int target){
        int mid = start + (end - start)/2;
        if(start>end){
            return -1;
        }
        else if(nums[mid] == target) return mid;
        else if(nums[mid]> target) return  binarySearchRecursive(nums, start, mid-1, target);
        else return binarySearchRecursive(nums,mid+1, end, target);
    }
}
