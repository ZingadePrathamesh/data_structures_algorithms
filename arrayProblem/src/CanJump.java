public class CanJump {
    public static boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false; // Can't reach this point
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 1, 1, 4}; // true
        int[] nums2 = {3, 2, 1, 0, 4}; // false
        System.out.println(canJump(nums1));
        System.out.println(canJump(nums2));
    }
}
