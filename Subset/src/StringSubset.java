import java.util.*;

public class StringSubset {
    public static void main(String[] args) {
        String str = "abcc";
        List<String> subsets = new ArrayList<>();

//        Long startTime = System.currentTimeMillis();
        System.out.println(subsetIterativeForDuplicates(str));
//        System.out.println("Time required: " + (System.currentTimeMillis() - startTime));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        startTime = System.currentTimeMillis();
        subsetRecursion(subsets, str, "");
        System.out.println(subsets);
//        System.out.println("Time required: " + (System.currentTimeMillis() - startTime));

    }

    public static void subsetRecursion(List<String> result, String unprocessed, String processed){
        if(unprocessed == null) return;

        if(unprocessed.isEmpty()){
            result.add(processed);
            return;
        }

        subsetRecursion(result, unprocessed.substring(1), processed);
        subsetRecursion(result, unprocessed.substring(1), processed + unprocessed.charAt(0));
    }

    public static ArrayList<String> subsetIterative(String s){
        ArrayList<String> result = new ArrayList<>();
        result.add("");
        for(int i = 0; i< s.length(); i++){
            ArrayList<String> temp = new ArrayList<>();
            for(int j = 0; j < result.size(); j++){
                temp.add(result.get(j) + s.charAt(i));
            }
            result.addAll(temp);
        }
        result.sort(Comparator.comparing(String::length));
        return result;
    }

    public static ArrayList<String> subsetIterativeForDuplicates(String s){
        ArrayList<String> result = new ArrayList<>();
        result.add("");
        for(int i = 0; i< s.length(); i++){
            ArrayList<String> temp = new ArrayList<>();
            if(i != 0 && s.charAt(i) == s.charAt(i-1)){
                for(int j = result.size()/2; j< result.size(); j++){
                    temp.add(result.get(j) + s.charAt(i));

                }
            }else{
                for(int j = 0; j < result.size(); j++){
                    temp.add(result.get(j) + s.charAt(i));
                }
            }
            result.addAll(temp);
        }
        result.sort(Comparator.comparing(String::length));
        return result;
    }
}
