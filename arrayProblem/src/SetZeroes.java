import java.util.HashSet;
import java.util.Set;

public class SetZeroes {
    public static void main(String[] args) {


    }

    public void setZeroesOptimized(int[][] matrix){
        if(matrix == null) return;
        if(matrix.length == 0 || matrix[0].length == 0) return;

        boolean zeroRow = false;
        boolean zeroCol = false;

        for(int i = 0; i < matrix.length; i++ ){
            if(matrix[i][0] == 0){
                zeroCol = true;
                break;
            }
        }

        for (int j = 0; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                zeroRow = true;
                break;
            }
        }

        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[i].length; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(zeroRow){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }

        if(zeroCol){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }

    public void setZeroes(int[][] matrix){
        Set<Integer> col = new HashSet<>();
        Set<Integer> row = new HashSet<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    col.add(j);
                    row.add(i);
                }
            }
        }
        //row loop
        for(int i = 0; i < matrix.length; i++ ){
            for(Integer c: col){
                matrix[i][c] = 0;
            }
        }
        //col loop
        for(int j = 0; j < matrix[0].length; j++ ){
            for(Integer r: row){
                matrix[r][j] = 0;
            }
        }
    }
}
