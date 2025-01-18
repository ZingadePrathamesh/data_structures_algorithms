public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(9));
        System.out.println(squareRoot(4));
        System.out.println(squareRoot(109));
        System.out.println(isPerfectSquare(8));
        System.out.println(isPerfectSquare(5));
        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(196));
//        System.out.println(isPerfectSquare(2147483647));
        System.out.println(isPerfectSquare(808201));
    }

    public static int squareRoot(int target){
        int start =1 ;
        int end = target;
        int mid;

        while(start <= end){
            mid = start + (end - start)/2;
            if(mid == target/mid) return mid;
            else if(mid < target/mid) start = mid + 1;
            else end = mid-1;
        }
        return end;
    }

    public static int mySqrt(int x){
        int start = 0;
        int end = x;
        int mid = start + (end - start)/2;

        if(x == 0 || x == 1) return x;

        while(start <= end){
            mid = start+(end - start)/2;
            if(mid== x/mid) return mid;
            else if(mid > x/mid) end = mid - 1;
            else start = mid + 1;
        }
        return end;
    }

    public static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num/2;
        long mid = start + (end - start)/2;
        long square;

        if(num == 0 || num == 1) return true;

        while(start <= end){
            mid = start + (end - start) / 2;
            square = mid*mid;
            if(square == num) return true;
            else if(square > num) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
}
