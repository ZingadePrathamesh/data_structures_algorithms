public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(power(2, 2));
    }
    public static long power(long number, int power){
        long answer = 1;
        long base = number;
        while(power > 0){
            if((power & 1) != 0){
                answer = answer * base;
            }
            base *=  base;
            power = power>>1;
        }
        return answer;
    }
}
