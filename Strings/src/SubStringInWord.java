public class SubStringInWord {
    public static void main(String[] args) {

    }

    public static int numOfStrings(String[] patterns, String word) {
        int counter = 0;
        for(String str: patterns){
            if(word.contains(str)){
                counter++;
            }
        }
        return counter;
    }
}
