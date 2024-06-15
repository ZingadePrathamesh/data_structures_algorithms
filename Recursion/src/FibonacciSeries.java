public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(fibonacciSeries(40));
        System.out.println(fibonacciSeriesUsingMaths(40));
        System.out.println(fibonacciSeriesUsingMaths(0));
        System.out.println(fibonacciSeriesUsingMaths(1));
        System.out.println(fibonacciSeriesUsingMaths(2));
        System.out.println(fibonacciSeriesUsingMaths(3));
        System.out.println(fibonacciSeriesUsingMaths(4));
    }
    public static long fibonacciSeries(long n){
        if(n == 0 || n == 1) return n;
        else{
            return fibonacciSeries(n-1) + fibonacciSeries(n-2);
        }
    }

    public static long fibonacciSeriesUsingMaths(int n){
        double result = 0;
        double a =  Math.sqrt(5);
        double b =  Math.pow(((1+Math.sqrt(5))/2),n);
        double c =  Math.pow(((1-Math.sqrt(5))/2),n);

        result = (b-c)/a;
        return (long) result;
    }
}
