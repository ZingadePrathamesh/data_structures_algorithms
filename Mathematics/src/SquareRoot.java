public class SquareRoot {
    public static void main(String[] args) {
        System.out.printf("Square root of 40 is %.3f" ,preciseSquareRoot(40));
    }
    public static double preciseSquareRoot(int number){
        double x = number;
        double root;
        while(true){
            root = 0.5 * (x + (number/x));
            if(Math.abs(x - root) < 0.1){
                break;
            }
            x = root;
        }
        return root;
    }

}
