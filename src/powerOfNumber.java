public class powerOfNumber {
    public static void main(String[] args) {
        System.out.println(powerOfTwoRecursively(48));
        System.out.println(powerOfTwoIteratively(48));

        System.out.println();

        System.out.println(powerOfNumberRecursively(2, 48));
        System.out.println(powerOfNumberIteratively(2, 48));
    }

    static long powerOfTwoRecursively(int n){
        if (n == 0) return 1L;
        else return 2 * powerOfTwoRecursively(n - 1);
    }

    static long powerOfTwoIteratively(int n){
        int i = 0;
        var a = 0;
        long power = 1;
        while(i<n){
            power = power * 2;
            i++;
        }
        return power;
    }

    static long powerOfNumberRecursively(int number, int power){
        if(power == 0) return 1;
        else return number * powerOfNumberRecursively(number, power - 1);
    }

    static long powerOfNumberIteratively(int number, int power){
        int i = 0;
        long result = 1;
        while(i < power){
            result = result * number;
            i++;
        }
        return result;
    }


}
