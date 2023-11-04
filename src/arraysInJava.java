import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

class customArray{
    Scanner sc = new Scanner(System.in);
    private int[] nums;

    customArray(){
        nums = new int[10];
        initialise(nums);
    }
    customArray(int size){
        nums = new int[size];
        initialise(nums);
    }

    private void initialise(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            arr[i]= Integer.MIN_VALUE;
        }
    }

    public void insert(int index, int value){
        try{
            if (nums[index] != Integer.MIN_VALUE){
                System.out.println("Already a value present! Want to override it?\n1 for yes\n0 for no");
                int choice = sc.nextInt();
                if(choice == 1){
                    nums[index] = value;
                    System.out.println("Successfully inserted!");
                }
                else System.out.println("Not inserted!");
            }
            else {
                nums[index] = value;
                System.out.println("Successfully inserted!");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("Invalid index! Try putting a valid index within (0 and %d)", nums.length);
        }
    }
    public boolean exists(int value){
        int i = 0;
        while(i<nums.length){
            if (nums[i]== value){
                System.out.println("Value: "+ value +", found at index: "+ i);
                return true;
            }
            i++;
        }
        return false;
    }
    public int valueAt(int index){
        try{
            if(nums[index] == Integer.MIN_VALUE) return 0;
            else return nums[index];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        return 0;
    }
    public void deleteAt(int index){
        try{
            nums[index] = Integer.MIN_VALUE;
            System.out.println("Deleted Successfully");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public void printArray(){
        System.out.println(Arrays.toString(this.nums));
    }
}

public class arraysInJava {
    public static void main(String[] args) {
        customArray arr = new customArray(20);
        arr.printArray();
        arr.insert(0, 20);
        arr.insert(1, 2);
        arr.insert(2, 200);
//        arr.insert(2, 60);
        arr.printArray();
        System.out.println(arr.exists(200));
        System.out.println(arr.valueAt(5));
    }
}
