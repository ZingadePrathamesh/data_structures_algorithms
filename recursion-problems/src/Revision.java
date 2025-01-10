public class Revision {
    public static void main(String[] args) {
//        printingReverseNumbers(5);
//        System.out.println(factorial(32));
        System.out.println(sumOfDigit(12345));
        System.out.println(revNum(1203,0));
        System.out.println(prodNumber(123));
    }

    public static void printingReverseNumbers(int max){
        if(max == 1 ){
            System.out.println(max);
        }
        else{
            System.out.println(max);
            printingReverseNumbers(max-1);
        }
    }

    public static int factorial(int n){
        if(n < 2) return 1;
        else{
            return n * factorial(n-1);
        }
    }

    public static int sumOfDigit(int num){
        if(num <= 0) return 0;
        else return (num % 10) + sumOfDigit(num/10);
    }

    public static int revNum(int num, int reversed){
        if(num <= 0) return reversed;
        else{
            reversed = reversed * 10 + num%10;
            return revNum(num/10, reversed);
        }
    }

    public static int prodNumber(int num){
        if(num <= 1) return 1;
        else{
            return num%10 * prodNumber(num/10);
        }
    }
}
