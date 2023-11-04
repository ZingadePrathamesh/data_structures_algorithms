import java.util.ArrayList;
import java.util.Arrays;

public class maxProduct {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(6);
        nums.add(8);
        nums.add(7);
        nums.add(9);
        System.out.println(maxProduct(nums));
    }
    static int maxProduct(ArrayList<Integer> nums){
        int largest = 0;
        int m=0; int o = 0;
        for(int i = 0 ;  i<nums.size(); i++){
            for (int j = 0; j<nums.size(); j++){
                if(i == j) {break;}
                if(largest < nums.get(i)*  nums.get(j)){ largest = nums.get(i)*  nums.get(j); m= i; o = j;}
            }
        }
        System.out.println("Maximum product made from: "+ nums.get(m)+" & " + nums.get(o));
        return largest;
    }
}
