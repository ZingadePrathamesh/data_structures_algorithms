public class rotateNumber {
    public static void main(String[] args) {
        System.out.println(rotateNumber.rotateNumber(456,0));
        System.out.println(rotateNumber.rotateNumber(12345,4));
        System.out.println(rotateNumber.rotateNumber(1069,2));
        System.out.println(rotateNumber.rotateNumber(-1069,2));
        System.out.println(countDigit(23040));
    }

    public static int rotateNumber(int number, int rotation){
        int temp = 0;
        int power = rotation;
        if(number>0){
         while(rotation > 0){
             temp = (int) ((number%10) * Math.pow(10,power - rotation) + temp);
             number /=10;
             rotation--;
         }
        }
        else{
            temp = -(rotateNumber(Math.abs(number), rotation - countDigit(number)));
            return temp;
        }


        temp =  (int) (temp* Math.pow(10, countDigit(number)) + number);
        return temp;
    }

    public static int countDigit(int num){
        int count =0;
        while(num>0){
            num /=10;
            count++;
        }
        return count;
    }
}
