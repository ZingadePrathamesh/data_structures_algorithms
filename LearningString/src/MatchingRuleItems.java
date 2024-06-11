import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]
public class MatchingRuleItems {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>(Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        ));
        System.out.println(Arrays.toString(items.toArray()));
        System.out.println(countMatches(items, "type", "phone"));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int countMatch = 0;
        int j = 0;
        if(ruleKey.equals("type")) j = 0;
        else if(ruleKey.equals("color")) j = 1;
        else j = 2;

        for(int i = 0; i<items.size(); i++){
            if(items.get(i).get(j).equals(ruleValue)) countMatch++;
        }
        return countMatch;
    }
}
