public class SumOfPower {
    public static void main(String[] args) {
        //4 + 9 =  13
        //25 + 16 =  41
        System.out.println(sumOfPower(41, 2));
    }

    public static int sumOfPower(int target, int pow){
        int count = 0;
        for(int i = 1; (int) Math.pow(i, pow) < target; i++){
            int temp  = target -  (int) Math.pow(i, pow);
            if(isPerfectPower(temp, pow)){
                count++;
            }
        }
        return Math.ceilDiv(count, 2);
    }

    public static boolean isPerfectPower(int temp, int pow){
        for(int i = 1; i < temp ; i++){
            if((int) Math.pow(i, pow) == temp) return true;
        }
        return false;
    }
}
