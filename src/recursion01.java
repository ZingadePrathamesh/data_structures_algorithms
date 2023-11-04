import java.util.*;

public class recursion01 {
    public static void main(String[] args) {

        int[] arr = {45, 67, 80, 20, 45, 69, 99};
        System.out.println(getMaxNumber(arr, arr.length));
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(-5));
        System.out.println(fibonacciSeriesRecursively(0));
    }

    static int sum(int a){
        if(a == 1){
            return 1;
        }
        else {
            return a + sum(a-1);
        }
    }

    //for the factorial
    static int factorial(int a){
        if(a ==1 || a == 0) return 1;
        else if (a < 0) {
            System.out.println("Cannot calculate factorial of negative integers");
            return 1;
        } else{
            return a*factorial(a-1);
        }
    }

    static int fibonacciSeriesRecursively(int term){
        if(term == 1) return 1;
        else if (term == 0) return  0 ;
        else if (term < 0) return -1;
        else{
            return (fibonacciSeriesRecursively(term -1 )+ fibonacciSeriesRecursively(term -2));
        }
    }

    static int getMaxNumber(int[] arr, int n){
        if(n==0) return arr[0];
        else{
            return Math.max(arr[n-1], getMaxNumber(arr, n-1));
        }
    }
}
