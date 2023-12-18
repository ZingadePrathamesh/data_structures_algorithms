import java.util.Arrays;

public class BinarySearchIn2D {
    public static void main(String[] args) {
        int[][] nums ={
                {10, 15, 17, 19},
                {20, 25, 27, 29},
                {30, 35, 37, 39},
                {40, 45, 47, 49}
        };

        System.out.println(Arrays.toString(binarySearch(nums, 37)));

    }

    public static int[] binarySearch(int[][] nums, int target){
        int row = 0; int column = nums[0].length-1;
        while(row<=column){
            if(nums[row][column] == target) return new int[]{row, column};
            else if(nums[row][column] > target) column--;
            else row++;
        }
        return new int[]{-1, -1};
    }
}
