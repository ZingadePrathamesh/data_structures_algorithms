import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElements {
    public static void main(String[] args) {

    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i: nums){
            hashMap.merge(i, 1, Integer::sum);
        }
        int max = 0;
        int majorityElement = 0;
        for(Integer key: hashMap.keySet()){
            if(max < hashMap.get(key)){
                max = hashMap.get(key);
                majorityElement = key;
            }
        }
        return majorityElement;
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i: nums){
            hashMap.merge(i, 1, Integer::sum);
        }
        for(Integer val: hashMap.values()){
            if(val>1){
                return true;
            }
        }
        return false;
    }
}
