public class SingleElementInSortedArray {
    //You are given a sorted array consisting of only integers where every element appears exactly twice,
    //except for one element which appears exactly once.
    //Return the single element that appears only once.
    //Your solution must run in O(log n) time and O(1) space.

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleElement(nums));
    }

    public static int singleElement(int[] nums){
        int start = 0; int end =nums.length-1;
        int mid;
        while(start < end){
            mid = start + (end - start)/2;
            if(mid % 2 == 1) mid--;
            if(nums[mid] != nums[mid+1]) end = mid;
            else start = mid+2;
        }
        return nums[start];
    }
}
