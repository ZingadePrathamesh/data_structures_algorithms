public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(9));
        System.out.println(squareRoot(4));
        System.out.println(squareRoot(109));
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
}
