import java.util.Arrays;

public class rotateMatrix {
    public static void main(String[] args) {
        int[][] nums = new int[3][3];
        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[0][2] = 3;
        nums[1][0] = 4;
        nums[1][1] = 5;
        nums[1][2] = 6;
        nums[2][0] = 7;
        nums[2][1] = 8;
        nums[2][2] = 9;
//        System.out.println(Arrays.deepToString(nums));
//        rotate(nums);

        System.out.println(Arrays.deepToString(nums));
        System.out.println(rotateMatrix(nums));
        System.out.println(Arrays.deepToString(nums));

    }
    public static boolean rotate(int[][] matrix){
        int temp[][] =new int[matrix.length][matrix[0].length];
        if(matrix.length == 0 || matrix[0].length != matrix.length){return false;}
        else{
            int n = matrix.length-1;
            for (int i = 0; i< matrix.length; i++){
                for (int j = 0; j< matrix[0].length; j++){
                    temp[j][n-i] = matrix[i][j];
                }
            }
            System.out.println(Arrays.deepToString(temp));
            return true;
        }
    }

    public static boolean rotateMatrix(int[][] matrix){
        if(matrix.length == 0 || matrix.length!= matrix[0].length)return false;
        else{
            for (int i= 0; i< matrix.length/2; i++){
                for (int j = 0; j<matrix[0].length; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            for (int i= 0; i< matrix.length; i++){
                for (int j = 0; j<matrix[0].length/2; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix[0].length-1-j];
                    matrix[i][matrix[0].length-1-j] = temp;
                }
            }
            return true;
        }
    }
}
