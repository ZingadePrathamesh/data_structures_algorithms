public class SQRT {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.mySqrt(50);
        System.out.println(ans);
    }
}
class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x==1){
            return x;
        }
        else{
            int sqrt = 1;
            while((long)sqrt * sqrt <=x){
                sqrt++;
            }
            return sqrt -1;
        }
    }
}
