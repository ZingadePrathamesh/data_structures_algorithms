public class PeakElement {
    public static void main(String[] args) {

    }

    public static int findPeakElement(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1) return 0;
        int s = 0; int e = nums.length - 1;
        if(nums[s] > nums[s + 1]) return s;
        if(nums[e] > nums[e - 1]) return e;
        int m = s + (e - s)/2;

        while(s < e){
            m = s + (e - s)/2;
            if(nums[m] < nums[m+1]){
                s = m+1;
            }else{
                e = m;
            }
        }
        return s;
    }

}
