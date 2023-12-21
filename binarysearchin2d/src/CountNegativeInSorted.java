public class CountNegativeInSorted {
    //Given a m x n matrix grid which is sorted in non-increasing order
    //both row-wise and column-wise, return the number of negative numbers in grid.

    public static void main(String[] args) {
        int[][] nums = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };

        System.out.println(countNegative(nums));
    }

    public static int countNegative(int[][] nums){
        int row = nums.length;
        int col = nums[0].length;
        int rStart= 0;
        int cEnd = col-1;
        int count = 0;
        while(cEnd>=0 && rStart<row){
            if(nums[rStart][cEnd]<0){
                count+= row-rStart;
                cEnd--;
            }
            else{
                rStart++;
            }
        }
        return count;
    }
}
