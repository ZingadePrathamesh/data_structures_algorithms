public class kthMissing {

    public static void main(String[] args) {
        int[] numbs = {2,3,4,7,11}; int k = 5;
        System.out.println(findKthPositive(numbs, k));
        System.out.println(find(numbs, k));
    }

    public static int findKthPositive(int[] arr, int k) {
        int number = 1; int i = 0; int missingCount = 0;
        while(missingCount<k){
            if(i<arr.length && arr[i]==number) i++;
            else missingCount++;
            if(missingCount == k) return number;
            number++;
        }
        return -1;
    }

    public static int find(int[] arr, int k){
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int missingCount = arr[mid] - (mid + 1);

            if (missingCount < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left + k;
    }
}
