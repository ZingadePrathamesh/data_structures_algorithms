public class IthBit {
    public static void main(String[] args) {
        int a = 357;
        System.out.println(Integer.toBinaryString(a));
        System.out.println("The 5th position has the bit value: " + ithBit(a, 5));
        System.out.println();
        System.out.println("Let's set it using the setIthBit function");
        a = setIthBit(a, 5);
        System.out.println("Printing after setting the number: " + a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println();
        System.out.println("Let's reset the 5th position to get the original value");
        a = resetIthBit(a, 5);
        System.out.println("Printing after setting the number: " + a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println();
        System.out.println("Let's find the position of the right most set bit");
        System.out.println("Position is " + positionOfRightMostSetBit(a));
        System.out.println();
        System.out.println("reseting the bit at 1st position");
        a = resetIthBit(a, 1);
        System.out.println(Integer.toBinaryString(a));
        System.out.println();
        System.out.println("Position of right most set bit is " + positionOfRightMostSetBit(a));




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

    public static int resetIthBit(int num, int position){
        int mask =  ~(1<<position-1);
        num = num & mask;
        return  num;
    }

    public static int positionOfRightMostSetBit(int num){
        int position = 1;
        int mask = 1;
        while(mask<=num){
            mask = 1 << position -1;
            if((num & mask) != 0) return position;
            position++;
        }
        return -1;
    }
}
