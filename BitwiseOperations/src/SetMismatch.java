import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
        System.out.println(Arrays.toString(bestApproach(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int length = nums.length;
        int xor = 0;

        for(int num: nums){
            xor ^= num;
        }
        for(int i = 1; i<=length; i++){
            xor^=i;
        }

        int rightMostSetBit =  xor & -xor;

        int group1 = 0; int group2 = 0;

        for(int num: nums){
            if((num & rightMostSetBit) != 0){
                group1 ^= num;
            }
            else{
                group2 ^= num;
            }
        }
        for(int i = 1; i<=length; i++){
            if((i&rightMostSetBit)!=0){
                group1 ^= i;
            }
            else{
                group2 ^= i;
            }
        }
        for(int num: nums){
            if(group1 ==  num){
                return new int[]{group1, group2};
            }
        }
        return new int[]{group2, group1};
    }

    public static int[] bestApproach(int[] nums){
        int result[] = new int[]{0, 0};
        boolean[] arr = new boolean[nums.length +1];
        for(int num: nums){
            if(arr[num]){
                result[0] = num;
            }
            else arr[num] = true;
        }
        for(int i = 1; i<=nums.length;i++){
            if(!arr[i]) result[1] = i;
        }
        return result;
    }
}
