import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class CompressedString {
    public static void main(String[] args) {
        System.out.println(compress("prathamesh"));
    }

    public static String compressedString(String str){
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(Character c: str.toCharArray()){
            hashMap.merge(c, 1, Integer::sum);
        }

        char[] arr = new char[hashMap.size()*2];
        int r = 0;
        StringBuilder result = new StringBuilder();

        for(Character c: hashMap.keySet()){
//            arr[r++] = c;
//            arr[r++] = (char) (hashMap.get(c) + '0');

            result.append(c).append(hashMap.get(c));
        }
        return result.toString();
    }

    public static String compress(String str){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        ArrayList<Character> arrayList = new ArrayList<>();

        for(Character c: str.toCharArray()){
            if(!arrayList.contains(c)) arrayList.add(c);
            hashMap.merge(c, 1, Integer::sum);
        }

        Collections.sort(arrayList);

        StringBuilder stringBuilder = new StringBuilder();
        for(Character c : arrayList){
            stringBuilder.append(c).append(hashMap.get(c));
        }

        return stringBuilder.toString();
    }
}
