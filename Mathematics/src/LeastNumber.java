public class LeastNumber {
    public static void main(String[] args) {
        long num = 17000;
        boolean count = true;
        while(count){

            if(num % 16 == 4 && num % 18 == 4 && num % 20 == 4 && num % 25 == 4 && num % 7 ==0){
                System.out.println(num);
                count = false;
            }
            num++;
        }
    }
}
