public class Conversions {
    public static void main(String[] args) {
        System.out.println(decimalToBaseB(17, 2));
        System.out.println(baseTodecimal(10001, 2));
    }

    public static int decimalToBaseB(int num, int base){
        int result = 0;
        int pow = 0;

        while(num > 0){
            result = (int) ((num % base) * Math.pow(10, pow++)) + result;
//            result = result * 10 + num % base;
            num /= base;
        }
        return result;
    }

    public static int baseTodecimal(int num, int base){
        int digit = 0;
        int result = 0;

        while(num > 0){
            result += (int) ( (num % 10) * Math.pow(base, digit++));
            num /= 10;
        }
        return result;
    }
}
