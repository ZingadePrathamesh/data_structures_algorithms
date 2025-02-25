public class ArithmeticProgression {

    public static void main(String[] args) {
        int[] arr = {1,2,4};
        boolean value = canMakeArithmeticProgression(arr);
        System.out.println(value);
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        quickSort(arr, 0, arr.length-1);
        int currentDiff = 0;
        int prevDiff = 0;
        for(int i = 0; i <= arr.length - 2; i++){
            currentDiff = arr[i+1] - arr[i];
            if(i == 0) prevDiff = currentDiff;
            if(currentDiff != prevDiff) return false;
        }
        return true;
    }

    private static void quickSort(int nums[], int start, int end){
        if(nums == null || nums.length == 0 || end - start < 1) return ;
        int s = start, e = end, mid = start + (end - start)/2, pivot = nums[mid];
        while(s <= e){
            while(nums[s] < pivot) s++;
            while(nums[e] > pivot) e--;
            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(nums, start, e);
        quickSort(nums, s, end);
    }
}
