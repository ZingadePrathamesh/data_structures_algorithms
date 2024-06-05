import java.util.Arrays;

public class BinarySearch2d {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] nums2= {
            {10, 20, 30, 40},
                {12, 22, 32, 42},
                {14, 24, 34, 44},
        };
        for (int i = 0; i< 17; i++){
            System.out.println(Arrays.toString(binarySearchIn2d(nums, i)));
        }

//        System.out.println(Arrays.toString(binarySearchIn2DArrays(nums, 8, 0, nums[0].length-1)));
//        System.out.println(Arrays.toString(binarySearchIn2DArrays(nums2, 12, 0, nums2[0].length-1)));
    }


    public static int[] binarySearchIn1D(int[][] nums, int row, int cStart, int cEnd, int target){
        while(cStart<=cEnd){
            int cMid = cStart+ (cEnd-cStart)/2;
            if(target == nums[row][cMid]) return new int[]{row, cMid};
            else if(target < nums[row][cMid]) cEnd = cMid-1;
            else cStart = cMid+1;
        }
        return new int[]{-1, -1};
    }

    public static int[] binarySearchIn2d(int[][] nums, int target){
        int rowStart = 0; int rowEnd = nums.length-1;
        int colStart = 0; int colEnd = nums[0].length-1;
        int rowMid =  0; int colMid =0;
        int[] result = {-1, -1};

        //until we get to only two remaining rows
        while(rowStart<rowEnd-1){
            colMid = colStart + (colEnd - colStart)/2;
            rowMid = rowStart + (rowEnd - rowStart)/2;
            if(nums[rowMid][colMid] == target){
                return new int[]{rowMid, colMid};
            }
            else if(nums[rowMid][colMid] > target) rowEnd--;
            else rowStart++;
        }

        //now we have two remaining rows so we will perform searches in five areas
        //middle column, top left, top right, bottom left, bottom right

        //middle column
        if(nums[rowStart][colMid] == target){
            return new int[]{rowStart, colMid};
        }
        if(nums[rowEnd][colMid] == target){
            return new int[]{rowEnd, colMid};
        }

        //searching in other four spaces horizontally
        result = binarySearchIn1DArray(nums, target, rowStart, 0, colMid-1);
        if(result[0] == -1){
            result = binarySearchIn1DArray(nums, target, rowEnd, 0, colMid-1);
        }if(result[0] == -1){
            result = binarySearchIn1DArray(nums, target, rowStart, colMid+1, colEnd);
        }if(result[0] == -1){
            result = binarySearchIn1DArray(nums, target, rowEnd, colMid+1, colEnd);
        }

        return result;
     }

     public static int[] binarySearchIn1DArray(int[][] nums, int target, int row, int colStart, int colEnd){
        int colMid = 0;
        while(colStart<=colEnd){
            colMid = colStart + (colEnd - colStart)/2;
            if(nums[row][colMid] == target){
                return new int[]{row, colMid};
            }
            else if(nums[row][colMid] > target) colEnd = colMid-1;
            else colStart = colMid+1;
        }
        return new int[]{-1, -1};
     }

    public static int[] binarySearchIn2DArrays(int[][] nums, int target, int rowStart, int colStart){
        if(nums.length == 0 || nums== null){
            System.out.println("Invalid Array");
            return new int[]{-1,-1};
        }
        else{
            while(rowStart <= nums.length-1 && colStart >= 0 ){
                if(nums[rowStart][colStart] == target) return new int[]{rowStart, colStart};
                else if(nums[rowStart][colStart] > target) colStart--;
                else rowStart++;
            }
            System.out.println("Target not found");
            return new int[]{-1,-1};
        }
    }
}
