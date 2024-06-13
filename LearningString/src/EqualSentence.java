public class EqualSentence {
    public static void main(String[] args) {
        String[] word1 = {"a", "bc"};
        String[] word2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(String a: word1){
            str1.append(a);
        }
        for(String a: word2){
            str2.append(a);
        }
        System.out.println(str1.toString());
        System.out.println(str2.toString());
        return str1.toString().equals(str2.toString());
    }
}
