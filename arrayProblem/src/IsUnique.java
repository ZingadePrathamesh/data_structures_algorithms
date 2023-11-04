import java.lang.reflect.Array;
import java.util.ArrayList;

public class IsUnique {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        customArrayList<Integer> lets = new customArrayList<Integer>();
        lets.nums.add(2);
        lets.nums.add(4);
        lets.nums.add(5);
        lets.nums.add(5);
        System.out.println(isUniqueObject(lets));


        customArrayList<String> letters = new customArrayList<String>();
        letters.nums.add("Prathamesh");
        letters.nums.add("Prathamesh1");
        letters.nums.add("Prathamesh2");
        letters.nums.add("Prathamesh3");
        System.out.println(isUniqueObject(letters));
    }
    static boolean isUniqueObject(customArrayList obj){
        int flag = 0;
        for (int i= 0; i<obj.nums.size(); i++){
            for (int j = i+1; j< obj.nums.size(); j++){
                if(obj.nums.get(i).equals(obj.nums.get(j))){flag =1; return false;}
            }
        }
        return true;

    }
}

class customArrayList<T>{
    ArrayList<T> nums = new ArrayList<T>();
}
