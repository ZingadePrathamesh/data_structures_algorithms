public class GuessGame {
    static int picked = 2;

    public static void main(String[] args) {

    }



    public static int guessNumber(int n) {
        int start  = 1;
        int end = n;
        int mid = -1;
        while(start<=end){
            mid = start + (end - start)/2;
            if(guess(mid) == 0) return mid;
            else if(guess(mid) == -1) end = mid-1;
            else start = mid +1;
        }
        return -1;
    }

    private static int guess(int mid) {
        if(mid == picked) return 0;
        else if(mid > picked) return -1;
        else return -1;
    }
}
