import java.util.Arrays;

public class BinarySearch2d {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(Arrays.toString(binarySearchIn2d(nums, 13)));
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
        int row = nums.length-1;
        int col = nums[0].length-1;
        int rStart = 0, rEnd = row;
        int cStart = 0, cEnd = col;
        int cMid = cStart + (cEnd-cStart)/2;
        if(row == 1){
            return binarySearchIn1D(nums, 0, 0, col, target);
        }

        while(rStart<(rEnd-1)){
            int rMid= rStart + (rEnd-rStart)/2;
            if(target == nums[rStart][cMid]) return new int[]{rStart, cMid};
            if(target < nums[rStart][cMid]){
                rEnd = rMid;
            }
            else {
                rStart = rMid;
            }
        }

        if(target == nums[rStart][cMid]) return new int[]{rStart, cMid};
        if(target == nums[rStart+1][cMid]) return new int[]{rStart+1, cMid};

        if(target<nums[rStart][cMid] && target>=nums[rStart][0]) return binarySearchIn1D(nums, rStart, 0, cMid-1, target);
        if(target>nums[rStart][cMid] && target<=nums[rStart][col]) return binarySearchIn1D(nums, rStart, cMid+1, col, target);
        if(target<nums[rStart+1][cMid] && target>=nums[rStart+1][0]) return binarySearchIn1D(nums, rStart+1, 0, cMid-1, target);
        else return binarySearchIn1D(nums, rStart+1, cMid+1, col, target);
    }
}
