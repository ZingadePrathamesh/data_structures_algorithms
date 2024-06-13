import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] chars = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(chars));
        reverseString(chars, 0, chars.length-1);
        System.out.println(Arrays.toString(chars));


    }

    public static void reverseString(char[] string, int start, int end){
        if(start>=end) return;
        else{
            swapCharacters(string, start, end);
            reverseString(string, start+1, end-1);
        }
    }
    public static void swapCharacters(char[] charArray, int start, int end){
        char temp = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = temp;
    }
}
