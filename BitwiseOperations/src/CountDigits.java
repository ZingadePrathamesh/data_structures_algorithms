public class CountDigits {
    public static void main(String[] args) {
        for (int i = 0; i<11; i++) {
            System.out.println(Integer.toBinaryString(i));
            System.out.println(countDigitsInNumber(i));
        }
    }
    public static int countDigitsInNumber(int num){
        if(num == 0) return 0;
        return 1 + (int) (Math.log(num)/Math.log(2));
    }
}
