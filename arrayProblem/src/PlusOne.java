import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = {8, 9, 9,9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int carry = 1;

        if((digits[i] + carry) > 9){
            while(i >= 0 && (digits[i] + carry) > 9){
                if(i == 0){
                    return newArray(digits, (digits[i] + carry) % 10);
                }else{
                    digits[i] = (digits[i] + carry) % 10;
                    i--;
                }
            }
        }else{
            digits[i]++;
            carry = 0;
        }
        if (carry != 0){
            digits[i] += carry;
        }
        return digits;
    }

    public static int[] newArray(int[] nums, int value){
        int[] result = new int[nums.length + 1];

        System.arraycopy(nums, 0, result, 1, nums.length);
        result[0] = 1;
        result[1] = value;

        return result;
    }
}
