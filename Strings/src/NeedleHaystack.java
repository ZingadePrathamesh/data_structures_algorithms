public class NeedleHaystack {
    public static void main(String[] args) {

    }
    public int strStr(String haystack, String needle) {
        int last = haystack.length() - needle.length();
        for(int i = 0; i <= last; i++){
            if(haystack.startsWith(needle)) return i;
            haystack = haystack.substring(1);
        }
        return -1;
    }
}
