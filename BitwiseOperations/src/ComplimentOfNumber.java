public class ComplimentOfNumber {
    public static void main(String[] args) {
        System.out.println(compliment(5));
    }
    public static int compliment(int nums){
        int numberLength = Integer.toBinaryString(nums).length();
        int mask =  (1<<numberLength);
        return nums ^ mask;
    }
}
