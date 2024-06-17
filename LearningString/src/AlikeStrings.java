public class AlikeStrings {
    public static void main(String[] args) {
        String a = "book";
        System.out.println(halvesAreAlike(a));
        System.out.println(optimizedHalveAlikeString(a));
    }
    public static boolean halvesAreAlike(String s) {
        int firstHalf = 0;
        int secondHalf = 0;
        String newString = s.toLowerCase();

        for(int i = 0; i<newString.length()/2; i++){
            char a = newString.charAt(i);
            char b = newString.charAt(newString.length()/2+i);
            if(a == 'a' || a == 'e'|| a == 'i'|| a == 'o'|| a == 'u'){
                firstHalf++;
            }
            if(b == 'a' || b == 'e'|| b == 'i'|| b == 'o'|| b == 'u'){
                secondHalf++;
            }
        }
        return firstHalf ==  secondHalf;
    }

    public static boolean optimizedHalveAlikeString(String s){
        int[] a = new int[123];
        int[] b = new int[123];
        return check(0, s.length()/2, a, s) == check(s.length()/2, s.length(), b, s);
    }

    public static int check(int start, int end, int[] arr, String s){
        while(start<end){
            arr[s.charAt(start++)]++;
        }
        return arr['a']+arr['e']+arr['i']+arr['o']+arr['u']+arr['A']+arr['E']+arr['I']+arr['O']+arr['U'];
    }
}
