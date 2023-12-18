public class SpecialArray {

    public static void main(String[] args) {
        int[] candidate = {3,5};
        System.out.println(specialInt(candidate));
        System.out.println(specialArrayBinary(candidate));
    }

    public static int specialInt(int[] nums){
        int max = max(nums); int count = 0;
        while(max > 0){
            count = 0;
            if(max <= (nums.length)) {
                for(int i: nums) if(i>=max) count++;
                if(count == max) return count;
            }
            max--;
        }
        return -1;
    }


    public static int specialArrayBinary(int[] nums){
        int start = 1;
        int end = max(nums);
        int mid;
        while(start <= end){
            int count = 0;
            mid = start + (end - start)/2;
            for(int num: nums) if(mid <= num) count++;
            if(count == mid) return count;
            else if(count > mid) start = mid + 1;
            else end = mid -1;
        }
        return -1;
    }

    public static int max(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int  i: nums) if(i>max) max = i;
        return max;
    }

}
