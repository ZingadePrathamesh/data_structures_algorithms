public class HCF {

    public static void main(String[] args) {
        System.out.println(findHCFUsingEuclidean(16*16, 64*64));
        System.out.println(findHCF(16*16, 64*64));
    }

    public static int findHCF(int num1, int num2){
        if(num1 < 0 || num2 < 0) return -1;
        int result = Math.min(num1, num2);

        while(result > 0){
            if(num1 % result == 0 && num2 % result == 0){
                return result;
            }
            result--;
        }
        return -1;
    }

    public static int findHCFUsingEuclidean(int num1, int num2){
        if(num1 < 0 || num2 < 0) return -1;
        if(num1 == 0) return num2;
        if(num2 == 0) return num1;

        while(num2 != 0){
            int temp =  num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
