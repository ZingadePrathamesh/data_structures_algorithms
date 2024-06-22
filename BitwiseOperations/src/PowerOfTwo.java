public class PowerOfTwo {
    public static void main(String[] args) {
        for(int i = 1; i< 10; i++){
            System.out.println(i);
            System.out.println(isPowerOfTwo(i));
            System.out.println(isPowerOfTwoOptimized(i));
        }
        allSet(10);
    }
    static boolean isPowerOfTwo(int num){
        int count = 0;
        while(num>0){
            if((num & 1) != 0) count++;
            num = num>>1;
        }
        return count == 1;
    }
    static void allSet(int term){
        int number =  1 << term-1;
        number = ~number;
        System.out.println(Integer.toBinaryString(number));
    }

    static boolean isPowerOfTwoOptimized(int num){
        int countOfDigit = (int) (Math.log(num)/ Math.log(2));
        int mask = ~(1<<countOfDigit);
        return (num & mask) == 0;
    }
}
