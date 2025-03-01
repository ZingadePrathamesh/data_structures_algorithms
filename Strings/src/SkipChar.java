public class SkipChar {
    public static void main(String[] args) {
//        String s = skipA("prathamesh");
        String a = skipApple("bcapplecd");
//        System.out.println(s);
        System.out.println(a);
    }

    public static String skipA(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.charAt(0) == 'a' || up.charAt(0) == 'A'){
            return skipA(up.substring(1));
        }else{
            return up.charAt(0) + skipA(up.substring(1));
        }
    }

    public static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipA(up.substring(5));
        }else{
            return up.charAt(0) + skipA(up.substring(1));
        }
    }
}
