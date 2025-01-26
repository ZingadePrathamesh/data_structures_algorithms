import java.util.ArrayList;
import java.util.List;

public class ArrayForm {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9,9}, 1));
        System.out.println(addToArrayForm(new int[]{1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3}, 516));
        System.out.println(addToArrayForm(new int[]{0}, 516));
        System.out.println(addToArrayForm(new int[]{6}, 809));
        System.out.println("1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,5,7,9");
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arrayForm = new ArrayList<>();
        int i = num.length - 1;
        int sum = 0;
        while(i >= 0 || k > 0){
            if(k > 0 && i >= 0){
                sum = num[i] + k % 10 + sum;
                arrayForm.addFirst(sum % 10);
                k /= 10;
            }
            else if(k>0){
                sum = sum + k % 10;
                arrayForm.addFirst(sum % 10);
                k /= 10;
            }
            else{
                sum = num[i] + sum;
                arrayForm.addFirst(sum % 10);
            }
            sum = sum >= 10 ? 1 : 0;
            i--;
        }
        if(sum > 0) arrayForm.addFirst(sum);
        return arrayForm;
    }
}
