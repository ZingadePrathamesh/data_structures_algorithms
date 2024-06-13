public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibonacciSeries(40));
    }
    public static long fibonacciSeries(long n){
        if(n == 0 || n == 1) return n;
        else{
            return fibonacciSeries(n-1) + fibonacciSeries(n-2);
        }
    }
}
