public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(66));
        System.out.println(isPowerOfTwoRecursion(66));
        System.out.println(isPowerOfThreeRecursion(1162261467));
        System.out.println(isPowerOfFour(16));
    }

    public static boolean isPowerOfTwo(int num){
        int start = 0;
        int end = 30;
        int mid = (end - start)/2 + start;

        while(start <= end){
            mid = (end - start)/2 + start;
            if(Math.pow(2, mid) == num ) return true;
            else if(Math.pow(2, mid) < num) start = mid + 1;
            else end = mid-1;
        }

        return false;
    }

    public static boolean isPowerOfTwoRecursion(int num){
        if(num == 1) return true;
        if(num <= 0 || num % 2 != 0) return false;
        return isPowerOfTwoRecursion(num/2);
    }

    public static boolean isPowerOfThree(int n) {
        int start = 0;
        int end = 19;

        int mid = (end - start)/2 + start;

        while(start <= end){
            mid = (end - start)/2 + start;
            if(Math.pow(3, mid) == n ) return true;
            else if(Math.pow(3, mid) < n) start = mid + 1;
            else end = mid-1;
        }

        return false;
    }

    public static boolean isPowerOfThreeRecursion(int num){
        if(num == 1) return true;
        if(num <= 0 || num % 3 != 0 ) return false;
        else return isPowerOfThreeRecursion(num/3);
    }

    public static boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        if(n <= 0 || n % 4 != 0) return false;
        else return isPowerOfFour(n/4);
    }
}
