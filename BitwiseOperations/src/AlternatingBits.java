public class AlternatingBits {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(7));
    }
    public static boolean hasAlternatingBits(int n) {
        System.out.println(Integer.toBinaryString(n));
        int expected = n & 1;
        while(n > 0){
            if((n&1) != expected){
                return false;
            }
           n >>=1;
           expected ^= 1;
        }
        return true;
    }
}
