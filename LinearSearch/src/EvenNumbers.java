import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 23, 14, 556};
        System.out.println(findEvenNumber(nums));
    }

    static public int findEvenNumber(int[] nums){
        int count = 0;
        for(int num: nums){
            String str = Integer.toBinaryString(num);
            if('0' == str.charAt(str.length()-1))
                count++;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int num: nums){
            if( ((int)Math.log10(num) -1)  % 2 == 0) ans++;
        }
        return ans;
    }
}
