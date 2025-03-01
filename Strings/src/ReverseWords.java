public class ReverseWords {

    public static void main(String[] args) {

    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

         for(int i = 0; i < words.length; i++){
             StringBuilder word = new StringBuilder(words[i]);
             result.append(word.reverse());
             if(words.length - i > 2){
                 result.append(" ");
             }
         }
         return result.toString();
    }
}
