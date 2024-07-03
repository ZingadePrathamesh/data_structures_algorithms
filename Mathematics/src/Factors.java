import java.util.ArrayList;
import java.util.Arrays;

public class Factors {
    public static void main(String[] args) {
//        factorsOfANumber(37);
//        factorsOfANumber(40);
        factorsOfANumberOptimised(40);
    }
//    public static void factorsOfANumber(long number){
//        for(int i = 1 ; i< number; i++){
//            if(number % i == 0){
//                System.out.print(i+ " ,");
//            }
//        }
//    }
    public static void factorsOfANumberOptimised(long number){
        ArrayList<Long> factorsDescending = new ArrayList<>();
        for(int i = 1; ((long) i * i) <= number; i++){
            if(number % i == 0){
                if(number/i == i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " ");
                    factorsDescending.add( number/i);
                }
            }
        }
        for(int i = factorsDescending.size()-1; i>=0 ; i--){
            System.out.print(factorsDescending.get(i) + " ");
        }

        System.out.println();
    }

}
