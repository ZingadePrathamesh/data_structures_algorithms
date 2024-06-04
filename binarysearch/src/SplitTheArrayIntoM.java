import com.sun.jdi.IntegerValue;

public class SplitTheArrayIntoM {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(splitTheArray(nums, 2));
        System.out.println(splitTheArray2(nums, 2));
    }

    public static int splitTheArray(int[] nums, int m){
        int start = largestElement(nums);
        int end = sumOfArray(nums);
        int mid = -1; int sum = 0;
        if(m == 1) return end;
        if(m == nums.length) return start;
        while(start<end){
            sum=0;
            mid = start + (end - start)/2;
            int parts = 1;
            for(int i : nums){
                if((sum+i) <= mid ) sum += i;
                else{
                    sum = i;
                    parts++;
                }
            }
            if(parts <= m) end  =mid;
            else start = mid+1;
        }
        return start;
    }

    private static int sumOfArray(int[] nums) {
        int sum =0;
        for(int i: nums) sum+=i;
        return sum;
    }

    public static int largestElement(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i: nums){
            if(i > max) max = i;
        }
        return max;
    }

    public static int splitTheArray2(int[] nums, int splits){
        int start = largestElement(nums);
        int end = sumOfArray(nums);
        int mid =  0;
        int sum = 0;
        if(splits == nums.length) return largestElement(nums);
        if(splits == 1) return sumOfArray(nums);
        else{
            while(start<end){
                int pieces = 1;
                sum =  0;
                mid = start + (end - start)/2;
                for(int i : nums){
                    if((sum+i) <= mid) sum+=i;
                    else{
                        sum = i;
                        pieces++;
                    }
                }
                if(pieces <= splits) end = mid;
                else start = mid+1;
            }
            return start;
        }
    }
}
