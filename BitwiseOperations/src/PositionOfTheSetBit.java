public class PositionOfTheSetBit {
    public static void main(String[] args) {
        int num = 28;
        System.out.println(positionOfTheNumber(num));
    }
    public static int positionOfTheNumber(int num){
        int negNum = -1 * num;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toBinaryString(negNum));
        return num & negNum;
    }
}
