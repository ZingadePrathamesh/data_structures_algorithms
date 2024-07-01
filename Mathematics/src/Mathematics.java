public class Mathematics {
    public static void main(String[] args) {
        int[] combinedArray = {
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29,  // Prime numbers
                4, 6, 8, 9, 10, 12, 14, 15, 16, 18   // Non-prime numbers
        };

        for(int num: combinedArray){
            String number = isPrimeNumberOptimised((long) num)?"Prime":"Not Prime";
            System.out.println(num + " : " + number);
        }
        System.out.println(Long.MAX_VALUE + " : " + isPrimeNumberOptimised(Long.MAX_VALUE));

        printPrimeNumbersTillN(40);
        printPrimeNumbersInRange(20, 40);
    }

    /**
     * Checks if a given number is prime using an optimized approach.
     *
     * @param number the number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrimeNumberOptimised(long number) {
        // Numbers less than or equal to 1 are not prime
        if (number <= 1) return false;

        // Numbers 2 and 3 are prime
        if (number <= 3) return true;

        // Eliminate even numbers and multiples of 3
        if (number % 2 == 0 || number % 3 == 0) return false;

        // Check for factors from 5 onwards using the 6k ± 1 optimization
        for (long i = 5; (i * i) <= number; i += 6) {
            // Check if the number is divisible by i or (i + 2)
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        // If no factors are found, the number is prime
        return true;
    }

    public static void printPrimeNumbersTillN(int n){
        boolean[] notPrime = new boolean[n + 1];
        for(int i = 2; i*i <= n; i++){
            if(!notPrime[i]) {
                for(int j = 2; i*j <= n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        for(int i = 2; i< notPrime.length ; i++ ){
            if(!notPrime[i]) System.out.println(i);
        }
    }

    public static void printPrimeNumbersInRange(int start, int end){
        boolean[] notPrime = new boolean[end+1];
        notPrime[0] = true;
        notPrime[1] = true;
        int i = start;
        while(start <= end){
            if (start == 2 || start == 3){
                notPrime[2] = false;
                notPrime[3] = false;
            }
            else if(start % 2 == 0 || start % 3 == 0){
                notPrime[start] = true;
            }
            else{
                if(!notPrime[start]){
                    for(int j =  5; j * j <= end; j+=6){
                        if(start % j == 0 || start % (j+2) == 0){
                            notPrime[start] = true;
                        }
                    }
                }
            }
            start++;
        }
        while(i <= end){
            if(!notPrime[i]){
                System.out.println(i);
            }
            i++;
        }
    }


}
