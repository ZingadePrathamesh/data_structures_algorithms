public class PascalTriangle {
    public static void main(String[] args) {
        for (int i = 1; i< 11; i++){
            System.out.println(sumOfThePascalTriangle(i));
            System.out.println(sumOfThePascalTriangleOptimized(i));
        }
    }
    public static long sumOfThePascalTriangle(int term){
        return (long) Math.pow(2, term -1);
    }
    public static long sumOfThePascalTriangleOptimized(int term){
        return 1<< (term-1);
    }
}
