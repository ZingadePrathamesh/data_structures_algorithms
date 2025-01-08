import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 4, 5};
        System.out.println(Arrays.toString(nums1));
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);

        for(int i = 1; i< nums1.length; i++){
            int key = nums1[i];
            int j = i-1;
            while(j >= 0 && key < nums1[j]){
                nums1[j+1] = nums1[j];
                j--;
            }
            nums1[j+1] = key;
        }
    }
}
