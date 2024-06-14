public class PowerOfTwo {
    public static void main(String[] args) {

    }
    public static boolean powerOfTwo(int n){
        if(n%2 != 0) return false;
        else if(n%2 == 0) return true;
        else{
            return powerOfTwo(n/2);
        }
    }
}
