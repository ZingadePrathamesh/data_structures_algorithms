import java.util.ArrayList;

public class permutation {

    public static void main(String[] args) {
        int[] array = {1, 2 , 3, 4 , 5, 6};
        int[] array2= {1, 3 , 2, 4 , 4, 6};
        System.out.println(isPermutatin(array, array2));
        System.out.println(isPermutation(array, array2));
    }

    public static boolean isPermutatin(int[] nums, int[] nums2){
        for (int i = 0; i < nums.length; i++){
            int flag = 0;
            for(int j = 0; j< nums2.length; j++){
                if(nums[i] == nums2[j]){ flag = 1 ; break;}
            }
            if(flag == 0){ return false;}
        }
        return true;
    }

    public static boolean isPermutation(int[] nums, int[] nums2){
        int sum1 = 0;
        int sum2 = 0;
        int product1 =1;
        int product2 =1;
        if(nums.length == nums2.length) {
            for (int i = 0; i < nums.length; i++) {
                sum1 += nums[i];
                sum2 += nums2[i];
                product1 *= nums[i];
                product2 *= nums2[i];
            }
            return (sum1 == sum2 && product1 == product2);
        }
        else return false;
    }
}
