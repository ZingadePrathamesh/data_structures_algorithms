import java.util.HashMap;

public class IsLongPressed {
    public static void main(String[] args) {

    }

    public boolean isLongPressedName(String name, String typed) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            map.merge(name.charAt(i), 1, Integer::sum);
        }

        for(int i = 0; i < typed.length(); i++){
            map.merge(typed.charAt(i), -1, Integer::sum);
        }

        for(Integer a: map.values()){
            if(a > 0) return false;
        }

        return true;
    }
}
