public class BitwiseOps {
    public static void main(String[] args) {
        for (int i = 0; i< 20; i++) {
            System.out.print(i+ " : ");
            System.out.println(isOdd(i));
        }
    }
    public static boolean isOdd(int nums){
        return (nums & 1) == 1;
    }

}
