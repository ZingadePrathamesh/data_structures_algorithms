public class ShuffleString {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] indices ={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(str, indices));
    }
    public static String restoreString(String s, int[] indices) {
        StringBuilder result = new StringBuilder(s);
        for(int i = 0; i<indices.length; i++){
            result.setCharAt(indices[i], s.charAt(i));
        }
        return result.toString();
    }
}
