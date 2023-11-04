import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        int[] nums =  new int[10];
        int[] nullArray = {1, 2, 3, 4, 5};
        boolean[] STD = new boolean[10];
        String[] str = new String[10];
        for (int i =0; i <10;i++){
            nums[i] = i;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(STD));
        System.out.println(Arrays.toString(nullArray));
        System.out.println(Arrays.toString(str));

        Integer a = 20; Integer b = 30;
        System.out.println(a +" " + b);
        swap(a, b);
        System.out.println(a +" " + b);
    }

    public static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a +" " + b);
    }
}
