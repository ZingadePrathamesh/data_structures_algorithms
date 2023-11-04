import java.util.ArrayList;
import java.util.Arrays;

public class FindingANumber {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i<1000; i++){
            nums.add(i*5);
        }

        System.out.println(Arrays.toString(nums.toArray()));
        System.out.println(nums.get(111));
        nums.remove(111);
        System.out.println(nums.get(111));
        nums.remove(630);
        System.out.println(exists(nums,555));
        System.out.println(exists(nums,550));
    }


    static boolean exists(ArrayList<Integer> nums, int value){
        for(int number: nums){
            if (value == number){
                System.out.println("Found at Index: "+ nums.indexOf(number));
                return true;
            }
        }
        System.out.println("Value not found!");
        return false;
    }
}
