public class D2Array {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40},
                {100, 200, 300, 400}
        };
        searchInTwoDimensionalArray(nums, 400);
    }
    public static int searchInTwoDimensionalArray(int[][] arr, int target){
        if(arr == null || arr.length==0){
            System.out.println("invalid array.");
            return Integer.MAX_VALUE;
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == target) {
                        System.out.printf("Found at index: i= %d, j= %d.", i, j);
                        return target;
                    }
                }
            }
            System.out.println("Target not found!");
            return Integer.MAX_VALUE;
        }
    }
}
