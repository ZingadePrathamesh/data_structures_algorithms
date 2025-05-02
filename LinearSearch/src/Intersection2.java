import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i]  ==  nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] result1 = new int[result.size()];
        for(int p = 0 ; p < result1.length; p++){
            result1[p] = result.get(p);
        }
        return result1;
    }
}
