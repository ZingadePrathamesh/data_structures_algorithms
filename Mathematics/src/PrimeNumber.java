public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(18));
    }

    public static boolean isPrime(int num){
        if(num < 1) return false;
        if(num == 2 || num == 3) return true;

        if(num % 2 == 0 ) return false;

        for(int i = 3; i * i < num; i += 2 ){
            if(num % i == 0) return false;
        }

        return true;
    }
}
