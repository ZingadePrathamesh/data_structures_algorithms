public class MergeStrings {
    public static void main(String[] args) {

    }

    public static String mergeAlternately(String word1, String word2) {
        int wLen = word1.length();
        int wLen2 = word2.length();
        StringBuilder stringBuilder = new StringBuilder(wLen2+wLen);
        int i = 0;

        while(!word1.isEmpty() && !word2.isEmpty()){
            if(i % 2 == 0){
                stringBuilder.append(word1.charAt(0));
                word1 = word1.substring(1);
            }else{
                stringBuilder.append(word2.charAt(0));
                word2 = word2.substring(1);
            }
            i++;
        }
        if(!word1.isEmpty()){
            stringBuilder.append(word1);
            i += word1.length();
            word1 = "";

        }
        if(!word2.isEmpty()){
            stringBuilder.append(word2);
            i += word2.length();
            word2 = "";
        }
        return stringBuilder.toString();
    }
}
