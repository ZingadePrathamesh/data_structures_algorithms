public class ReachNumber {
    public static void main(String[] args) {
        System.out.println(reachNumber(3)); // Output: 2
        System.out.println(reachNumber(2)); // Output: 3
        System.out.println(reachNumber(5)); // Output: 5

    }

    public static int reachNumber(int target) {
        target = Math.abs(target); // Work with the absolute value of target

        int left = 0, right = target, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Calculate sum of the first `mid` natural numbers
            long sum = (long) mid * (mid + 1) / 2;

            if (sum >= target && (sum - target) % 2 == 0) {
                result = mid;
                right = mid - 1; // Search for a smaller number of steps
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}
