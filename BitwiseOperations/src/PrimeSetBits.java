public class PrimeSetBits {
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(842, 888));
    }
    public static int countPrimeSetBits(int left, int right) {
        int count = 0;
        while( left <right){
            if(isPrime(hammingWeight(left++))){
                count++;
            }
        }
        return count;
    }
    public static int hammingWeight(int n) {
        int count = 0;
        while(n>0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
    public static boolean isPrime(int num){
        if(num < 2) return false;
        if(num == 2) return true;
        if(num == 3) return true;
        for(int i = 2; i< num; i++ ){
            if(num % i == 0) return false;
        }
        return true;
    }
}
