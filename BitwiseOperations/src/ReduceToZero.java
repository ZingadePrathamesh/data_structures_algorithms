public class ReduceToZero {
    public static void main(String[] args) {

    }
    public static int reduceToZero(int num){
        int steps = 0;
        while(num > 0){
            if((num & 1) != 0){
                num -= 1;
            }
            else num /= 2;
            steps++;
        }
        return steps;
    }
}
