public class sumOfDigits {
    public static void main(String[] args){
        System.out.println(sumOfDigits(99));
        System.out.println(sumOfDigitsIteratively(99));

        System.out.println(powerOfNumber(-5, -2));

        System.out.println(greatestCommonDivisor(72, 48));
        System.out.println(greatestCommonDivisorIteratively(72, 48));

        System.out.println(decimalToBoolean(15));
        System.out.println(decimalToBoolean(32));
        System.out.println(decimalToBoolean(6));
        System.out.println(decimalToBoolean(-6));

        System.out.println(productOfDigit(45));
        System.out.println(productOfDigit(50));

        System.out.println(reverseNumber(345));
        System.out.println(reverseNumber(100));

        System.out.println(palindrome(9999));
    }

    public static int sumOfDigits(int digit){
        if(digit < 0) return -1;
        else if(digit <10) return digit;
        else{
            return digit%10 + sumOfDigits(digit/10);
        }
    }

    public static int sumOfDigitsIteratively(int digit){
        var temp = digit;
        int sum =0;
        if(temp < 0) return -1;
        while(temp != 0 && temp > 0){
            sum += temp%10;
            temp /= 10;
        }
        return sum;
    }

    public static double powerOfNumber(long number, int power){
        if( power == 0 ) return 1;
        else if(power < 0) return 1/(number * powerOfNumber(number, Math.abs(power) - 1));
        else return number * powerOfNumber(number, power -1);
    }

    public static int greatestCommonDivisor(int a, int b){
        if(a < 0|| b< 0) return -1;
        if(b == 0) return a;
        else return greatestCommonDivisor(b, a % b);
    }

    public static int greatestCommonDivisorIteratively(int a,int b){
        int temp = b;
        if((a < 0|| b<0)) return -1;
        while(temp != 0){
            if(a % temp == 0 && b % temp == 0 ) break;
            temp--;
        }
        return temp;
    }


    public static long decimalToBoolean(int decimal){
        if(decimal == 0) return 0;
        else return 10*decimalToBoolean(decimal/2)+ decimal%2;
    }

    public static int productOfDigit(int num){
        if(num == 0) return 0;
        if(num < 10 ) return num;
        else return num%10 * productOfDigit(num/10);
    }

    public static int reverseNumber(int num) {
    int temp = 0;
    while(num != 0){
        temp = temp * 10 + num %10;
        num /= 10;
    }
    return temp;
    }

    public static boolean palindrome(int num){
        int original = num;
        int temp = 0;
        while(num != 0){
            temp = temp * 10 + num %10;
            num /= 10;
        }
        return original == temp;
    }

    
}


