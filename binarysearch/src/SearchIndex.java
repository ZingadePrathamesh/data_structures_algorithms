public class SearchIndex {
    public static void main(String[] args) {
        int[] nums ={1,3,5,6};
        int target = 5;
        System.out.println(searchIndex(nums, target));
    }
    public static int searchIndex(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] ==  target) return mid;
            else if(nums[mid]> target)  end  = mid -1;
            else start= mid + 1;
            System.out.println(mid);
            System.out.println(end);
            System.out.println(start);
        }
        return start;
    }
}
