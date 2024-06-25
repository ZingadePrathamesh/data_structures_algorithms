import java.util.Arrays;

public class SortArrayBySetBits {
    private static final int[] BIT_COUNT_TABLE = new int[256];

    static {
        for (int i = 0; i < 256; i++) {
            BIT_COUNT_TABLE[i] = (i & 1) + BIT_COUNT_TABLE[i >> 1];
        }
    }

    public static int countOfSet(int num) {
        // Count the number of set bits using the lookup table
        return BIT_COUNT_TABLE[num & 0xff] +
                BIT_COUNT_TABLE[(num >> 8) & 0xff] +
                BIT_COUNT_TABLE[(num >> 16) & 0xff] +
                BIT_COUNT_TABLE[(num >> 24) & 0xff];
    }

    public static void main(String[] args) {

    }
    public static int[] sortByBits(int[] arr) {

        return arr;
    }


}
