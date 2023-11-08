import java.util.ArrayList;
import java.util.List;

public class createTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ans = new ArrayList<Integer>();
        int res[] = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            int idx = index[i];
            ans.add(idx, nums[i]);
        }
        for(int i = 0; i<nums.length; i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}
