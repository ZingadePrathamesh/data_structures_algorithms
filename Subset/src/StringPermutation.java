import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "abc";

        List<String> subsets = new ArrayList<>();
        permute(subsets, "", str);
        Collections.sort(subsets);
        System.out.println(subsets);
    }


    public static void subset(List<String> permuted, String processed, String unprocessed){
        if(unprocessed == null || unprocessed == " " || unprocessed.isEmpty()){
            permuted.add(processed);
            return ;
        }
        subset(permuted, processed + unprocessed.charAt(0), unprocessed.substring(1));
        subset(permuted, processed, unprocessed.substring(1));
    }

    public static void permute(List<String> permuted, String processed, String unprocessed){
        if(unprocessed == null || unprocessed.isEmpty()){
            permuted.add(processed);
            return;
        }

        char c = unprocessed.charAt(0);
        for(int i = 0; i <= processed.length(); i++){
            String first = processed.substring(0, i);
            String second = processed.substring(i);
            permute(permuted, first + c + second, unprocessed.substring(1));
        }
    }
}
