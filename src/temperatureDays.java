import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class temperatureDays {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int days = 0;
        System.out.printf("How many days of calculation you want? (choose from 1 to %d)\n", Integer.MAX_VALUE);

        try {
            days = sc.nextInt();
            if(days<0){ System.out.println("Cannot be a negative number"); return;}
        }catch(InputMismatchException e){
            System.out.println(e);
            System.out.println("Invalid input");
            return;
        }

        int temperature[] = new int[days];

        getTemperature(temperature);
        System.out.println(Arrays.toString(temperature));

        int avg = calculateAverage(temperature);
        System.out.println(avg);

        int numberOfDaysAboveAvg = calculateAboveAverageDays(temperature, avg);
        System.out.println(numberOfDaysAboveAvg);

    }

    private static void getTemperature(int nums[]){
        for (int i = 0 ; i<nums.length; i++){
            System.out.printf("Day%d temperature: ", i+1);
            nums[i] = sc.nextInt();
        }
    }

    private static int calculateAverage(int nums[]){
        int avg = 0;
        for (int numbers : nums){
            avg+=numbers;
        }
        return avg/nums.length;
    }

    private static int calculateAboveAverageDays(int[] nums, int avg){
        int count =0 ;
        for (int num: nums){
            if(num>=avg)count++;
        }
        return count;
    }
}
