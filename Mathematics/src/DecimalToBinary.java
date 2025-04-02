public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println(decimalToBinary(16));
    }

    public static int decimalToBinary(int decimal){
        StringBuilder str = new StringBuilder();

        while(decimal >  0){
            str.append(decimal % 2);
            decimal /= 2;
        }
        str.reverse();
        return Integer.parseInt(str.toString());
    }
}
