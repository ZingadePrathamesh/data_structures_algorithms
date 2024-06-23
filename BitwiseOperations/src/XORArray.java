public class XORArray {
    public static void main(String[] args) {

    }
    public static int xorOperation(int n, int start) {
        int result = 0;
        for(int i = 0; i<n; i++){
            result ^= start + 2 * i;
        }
        return result;
    }
}
