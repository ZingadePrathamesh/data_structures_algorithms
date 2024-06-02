import java.util.Arrays;

public class firstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {2, 2, 4, 5, 6, 7, 8, 8, 9 ,10, 10, 10, 10, 11, 12};

        System.out.println(Arrays.toString(firstAndLastPosition(nums, 2)));
        System.out.println(Arrays.toString(firstAndLastPosition(nums, 8)));
        System.out.println(Arrays.toString(firstAndLastPosition(nums, 10)));
        System.out.println(Arrays.toString(firstAndLastPositionsOfATarget(nums, 10)));
        System.out.println(Arrays.toString(firstAndLastPositionsOfATarget(new int[]{1}, 1)));

    }
    public static int[] firstAndLastPosition(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int mid;
        int s = -1, e = -1;

        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                end = mid -1;
                s = mid;
            }
            else if(nums[mid] > target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        start =0;
        end = nums.length-1;
        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                start = mid +1;
                e = mid;
            }
            else if(nums[mid] > target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }

        return new int[]{s, e};
    }

    public static int[] firstAndLastPositionsOfATarget(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            System.out.println("Invalid Array");
            return new int[]{-1, -1};
        } else {
            int start = 0;
            int end = arr.length - 1;
            int mid = 0;
            int result[] = {-1, -1};
            //finding start
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    result[0] = mid;
                    end = mid - 1;
                } else if (arr[mid] < target) start = mid + 1;
                else end = mid - 1;
            }
            start = 0;
            end = arr.length - 1;
            //finding last
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    result[1] = mid;
                    start = mid + 1;
                } else if (arr[mid] < target) start = mid + 1;
                else end = mid - 1;
            }
            return result;
        }
    }
}
