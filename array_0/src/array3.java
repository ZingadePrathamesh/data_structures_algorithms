import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class array3 {
    //lets play with arraylist
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>(1);

        //2d arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<Integer>(2));
        list.add(new ArrayList<Integer>(2));
        list.add(new ArrayList<Integer>(2));
        list.add(new ArrayList<Integer>(2));


        for (ArrayList<Integer> li : list ){
            System.out.println("hi");
            if(li.size()<5){li.add(in.nextInt());}
            else break;
        }

        System.out.println(list.toString());


//        for(int i = 0 ; i < 10000000; i++){
//            nums.add(i);
//        }
//
//        System.out.println(nums.contains(99999999));
    }
}
