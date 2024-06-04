public class searchInRotatedArray3 {
    public static void main(String[] args) {

        int[] case1 = {1,2,3,4,5,6,7};
        int[] case2 = {6,7,1,2,3,4,5};
        int[] case3 = {7,1,2,3,4,5,6};
        int[] case4 = {3,4,5,6,1,2};


        System.out.println(findPivot(case1));
        System.out.println(findPivot(case2));
        System.out.println(findPivot(case3));

//        System.out.println(rotatedSortedAray(case2, 3));
//        System.out.println(rotatedSortedAray(case1, 3));
//        System.out.println(rotatedSortedAray(case3, 3));
        System.out.println(rotatedSortedAray(case4, 2));



    }

    public static int rotatedSortedAray(int[] nums, int target){
        int result  =-1;
        int start = 0;
        int end = nums.length -1;
        int pivot = findPivot(nums);
        result = binarySearch(nums, target, start , pivot);
        if(result == -1){
            result = binarySearch(nums, target, pivot + 1, end);
        }
        return result;
    }
    public static int findPivot(int[] nums){
        if(nums.length == 0  || nums == null){
            System.out.println("Invalid input array.");
            return -1;
        }
        else{
            int start =  0;
            int end = nums.length-1;
            int mid = 0;
            while(start <= end){
                mid = start + (end - start )/2;
                if(mid !=  start && nums[mid] < nums[mid - 1]) return mid-1;
                else if(mid != end && nums[mid]> nums[mid +1]) return mid;
                else if(nums[start] <= nums[mid]) start = mid + 1;
                else end = mid -1;
            }
            return end;
        }
    }

    public static int binarySearch(int[] nums, int target, int start, int end){
        int mid = 0;
        System.out.println(start + " " +end);
        while(start<=end){
            mid = start + (end - start)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) start = mid +1;
            else end = mid -1;
        }
        return -1;
    }
}
