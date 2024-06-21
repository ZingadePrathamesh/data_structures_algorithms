public class OddOneOut {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 4, 5, 4, 2, 4, 2};
        //5 appeared only once.
        System.out.println(oddManOut(nums,3));
        System.out.println(oddNumberOut(nums,3));
    }

    public static int oddManOut(int nums[], int n){
        int arrayBit[] = new int[32];
        for(int num: nums){
            for(int i = 0; i<32; i++){
                if((num & (1<<i)) != 0){
                    arrayBit[i]++;
                }
            }
        }
        int result = 0;
        for(int i = 0 ; i<32; i++){
            if(arrayBit[i] % n != 0){
                result |= (1<<i);
            }
        }
        return result;
    }

    public static int oddNumberOut(int nums[], int repetition){
        int[] bitCount = new int[32];
        for(int num: nums){
            for(int i = 0; i<32; i++){
                if((num & (1<<i)) != 0) bitCount[i]++;
            }
        }

        int result = 0;
        for(int i = 0; i<32; i++ ){
            if(bitCount[i]%repetition != 0) result |= 1<<i;
        }
        return result;
    }
}
