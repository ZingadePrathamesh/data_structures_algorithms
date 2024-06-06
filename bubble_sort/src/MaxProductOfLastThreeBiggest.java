public class MaxProductOfLastThreeBiggest {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        int[] nums2 = {-1, -2, -3};
        System.out.println(maximumProduct(nums));
        System.out.println(maximumProduct(nums2));
    }

    public static int maximumProduct(int[] nums) {
        bubbleSort(nums);
        return nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
    }

    public static int[] bubbleSort(int[] nums){
        boolean swapped;
        for(int  i=  0; i< 3; i++){
            swapped=false;
            for(int j = 1; j<nums.length - i;j++){
                if(Math.pow(nums[j-1], 2) > Math.pow(nums[j], 2) ){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) return nums;
        }

        return nums;
    }
}
