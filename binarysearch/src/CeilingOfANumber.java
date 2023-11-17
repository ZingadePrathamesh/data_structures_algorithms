public class CeilingOfANumber {
    public static void main(String[] args) {
        int nums[] = {7, 6, 4, 3 ,2, 1};
        int[] nums2 = {1, 3, 5, 7, 9, 11, 13, 15};
//        System.out.println(linearCeilingOfNumber(nums, 3));
        System.out.println(linearCeilingOfNumber(nums2, 8));
        System.out.println(binaryCeilingOfNumber(nums2, 8));

    }

    public static int binaryCeilingOfNumber(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int mid = start + (end -start)/2;
        int ans = -1;
        while(start <= end){
            mid = start + (end -start)/2;
            if(nums[mid] == target) return target;

            if(nums[mid]>target){
                ans = nums[mid];
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return ans;
    }
    public static int linearCeilingOfNumber(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        boolean isAsc = nums[start]< nums[end];

        if(isAsc){
            for(int i = 0; i<nums.length; i++){
                if(nums[i]>=target) return nums[i];
            }
        }
        else{
            for (int i = end; i>=start; i--){
                if(nums[i]>= target) return nums[i];
            }
        }
        return -1;
    }
}
