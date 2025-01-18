import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums ={1, 2, 3, 4, 5};
        int[] nums2 = {2, 5, 4 ,4,4, 4 ,1, 6, 3};
        int[] nums3 = {2, 1};
        int[] nums4 = {2, 2, 2, 2};
//        System.out.println(linearSearchUsingRecursion(nums, 0, 1));
//        System.out.println(linearSearchUsingRecursion(nums2, 0, 3));
//        System.out.println(linearSearchUsingRecursion(nums3, 0, 1));
//        System.out.println(linearSearchUsingRecursion(nums4, 0, 2));

        List<Integer> list = linearSearchWithArrayCreation(nums2, 4, 0);
        System.out.println(list);
    }

    public static int linearSearchUsingRecursion(int[] nums, int start, int target){
        if(start >= nums.length ) return -1;
        else {
            if(nums[start] == target) return start;
            return linearSearchUsingRecursion(nums, start + 1, target);
        }
    }

    public static List linearSearchWithList(int[] nums, int target, int index ,List<Integer> list){
        if(index >= nums.length){
            return list;
        }
        if(nums[index] == target)
            list.add(index);
        return linearSearchWithList(nums, target, index+1, list);
    }

    public static ArrayList<Integer> linearSearchWithArrayCreation(int[] nums, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index >= nums.length){
            return list;
        }
        if(nums[index] == target)
            list.add(index);
        list.addAll(linearSearchWithArrayCreation(nums, target, index+1));
        return list;
    }
}
