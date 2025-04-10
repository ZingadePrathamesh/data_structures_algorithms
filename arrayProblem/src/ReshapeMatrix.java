public class ReshapeMatrix {
    public static void main(String[] args) {

    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat == null && mat.length == 0) return mat;
        if(r * c < mat.length * mat[0].length) return mat;

        int[][] result = new int[r][c];
        int i = 0;
        int j = 0;
        for(int[] row: mat){
            for(int cell : row){
                result[i][j] = cell;
                if(j + 1 >= c){
                    i++;
                    j = 0;
                }else{
                    j++;
                }
            }
        }
        return result;
    }
}
