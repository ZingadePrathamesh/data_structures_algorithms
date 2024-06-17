public class IthBit {
    public static void main(String[] args) {
        int a = 32;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(ithBit(a, 6));

        System.out.println("Setting the 5 position of a");
        a = setIthBit(a, 5);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);

    }
    public static int ithBit(int num, int position){
        int mask = 1<<position-1;
        int ithBit = num & mask;
        return ithBit == 0? 0: 1;
    }

    public static int setIthBit(int num, int position){
        int mask =  1<<position-1;
        num = num | mask;
        return num;
    }
}
