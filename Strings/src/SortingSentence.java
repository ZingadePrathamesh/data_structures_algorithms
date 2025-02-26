public class SortingSentence {
    public static void main(String[] args) {

    }

    public static String sortSentence(String s) {
        String[] strings = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int i = 1;
        while(i <= strings.length){
            for(String str: strings){
                if(str.charAt(str.length()-1) == getChar(i)){
                    str = str.replace(String.valueOf(i), "");
                    stringBuilder.append(str);
                    if(i != strings.length) stringBuilder.append(" ");
                    i++;
                }
            }
        }
        return stringBuilder.toString();
    }

    public static char getChar(int num){
        return switch (num){
            case 1 -> '1';
            case 2 -> '2';
            case 3 -> '3';
            case 4 -> '4';
            case 5 -> '5';
            case 6 -> '6';
            case 7 -> '7';
            case 8 -> '8';
            case 9 -> '9';
            default -> '0';
        };
    }
}
