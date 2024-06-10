import java.util.Arrays;

public class DefangedString {
    public static void main(String[] args) {
        String ipAddress = "1.2.3.4";
        System.out.println(defangIPaddr(ipAddress));
        System.out.println(defangIPAddress(ipAddress));
    }

    public static String defangIPaddr(String address) {
        char[] array = new char[address.length() + 6];
        int arrayCounter = 0;
        int stringCounter = 0;
        while(arrayCounter < array.length){
            if(address.charAt(stringCounter) == '.'){
                array[arrayCounter++] = '[';
                array[arrayCounter++] = '.';
                array[arrayCounter++] = ']';
            }
            else array[arrayCounter++]= address.charAt(stringCounter);
            stringCounter++;
        }
        StringBuilder str = new StringBuilder(Arrays.toString(array));
        str.deleteCharAt(0);
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }

    public static String defangIPAddress(String address){
        StringBuilder defangAddress = new StringBuilder();
        int stringCounter = 0;
        while(stringCounter<address.length()){
            if(address.charAt(stringCounter)=='.'){
                defangAddress.append("[.]");
            }
            else{
                defangAddress.append(address.charAt(stringCounter));
            }
            stringCounter++;
        }
        return defangAddress.toString();
    }
}
