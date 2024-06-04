import java.util.ArrayList;

public class SplitTheArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(splitTheArray(nums));
    }
    public static boolean splitTheArray(int[] nums){
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        for(int i: nums){
            if(nums1.size() < nums.length/2 && !nums1.contains(i)){
                nums1.add(i);
            }
            else if(!nums2.contains(i)){
                nums2.add(i);
            }
            else if(!nums1.contains(i)){
                for(int j: nums1){
                    if(!nums2.contains(j)){
                        nums1.remove((Integer) j);
                        nums1.add(i);
                        nums2.add(j);
                        break;
                    }
                }
            }
            else{
                return false;
            }
        }
        if(nums1.size() != nums2.size()) return false;
        else return true;
    }
}
