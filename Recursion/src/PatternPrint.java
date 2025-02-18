public class PatternPrint {
    public static void main(String[] args) {
//        rightAngledTriangle(10);
        printTriangle(4, 0);
    }

    public static void rightAngledTriangle(int row){
        if(row < 1) return;
        printCol(row);
        System.out.println();
        rightAngledTriangle(row - 1);
    }

    public static void printCol(int col){
        if(col < 1) return;
        printCol(col - 1);
        System.out.print("*");
    }

    public static void normalTriangle(int row, int spaces){
        if(row < 1) return;
        normalTriangle(row - 1, spaces);
        printSpaces(spaces - row + 1);
        printCol(row);
        System.out.println();
    }

    public static void printSpaces(int col){
        if(col < 1) return;
        printSpaces(col - 1);
        System.out.print(" ");
    }

    public static void printTriangle(int row, int col){
        if(row < 1) return ;
        printStar(row, col);
        System.out.println();
        printTriangle(row-1, 0);
        return;
    }
    public static void printStar(int row, int col){
        if(col >= row) return ;
        System.out.print("*");
        printStar(row, ++col);
        return;
    }
}
