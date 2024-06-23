public class XORArray {
    public static void main(String[] args) {
        System.out.println(xorOperationsTillN(10));
        System.out.println(xorOperationInRange(0, 10));
    }
    public static int xorOperation(int n, int start) {
        int result = 0;
        for(int i = 0; i<n; i++){
            result ^= start + 2 * i;
        }
        return result;
    }

    public static int xorOperationsTillN(int  num){
        int a = num % 4 ;
        switch (a){
            case 0:
                return num;
            case 1:
                return 1;
            case 2:
                return num+1;
            case 3:
                return 0;
        }
        return a;
    }

    public static int xorOperationInRange(int start, int end){
        if(start == 0) return xorOperationsTillN(end);
        return xorOperationsTillN(end) ^ xorOperationsTillN(start-1);
    }
}
