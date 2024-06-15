public class AverageSalary {
    public static void main(String[] args) {
        int[] nums = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println(averageSalary(nums));
    }
    public static double averageSalary(int[] nums){
        int max = 0;
        int min = 0;
        double sum = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[max] < nums[i]) max = i;
            if(nums[min] > nums[i]) min = i;
        }
        for(int i = 0; i<nums.length; i++) {
            if (i != max && i != min) {
                sum += nums[i];
            }
        }
        double average =  sum / (nums.length-2);
        return average ;
    }
}
