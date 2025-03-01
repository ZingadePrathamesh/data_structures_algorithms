public class ColumnNumber {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int columnNumber) {
        final int X = 26;
        final int ASCII = 65;
        StringBuilder result = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            char c = (char) ((columnNumber % X) + ASCII);
            result.append(c);
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }
}
