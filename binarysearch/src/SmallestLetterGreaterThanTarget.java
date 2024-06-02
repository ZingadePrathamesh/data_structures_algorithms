public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {

        char[] letters = {'a', 'b', 'c', 'f', 'g'};
        System.out.println(smallestCharacterGreater(letters, 'g'));
        System.out.println(smallestCharacterGreater(letters, 'z'));
        System.out.println(smallestCharacterGreater(letters, 'b'));
        System.out.println(smallestCharacterGreater(letters, 'f'));
        System.out.println(testingSmallestChar(letters, 'g'));
    }

    public static char smallestCharacterGreater(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;

            if(letters[mid] > target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return letters[start % letters.length];
    }

    public static char testingSmallestChar(char[] letters, char target){
        if(letters.length==0 || letters == null){
            char a = 'a';
            return a;
        }
        else{
            int start = 0;
            int end = letters.length-1;
            int mid = 0;
            while(start<end){
                mid = start+ (end-start)/2;
                if(letters[mid] < target) start = mid +1;
                else if(letters[mid]==target) start  = mid+1;
                else end = mid;
            }
            return letters[end];
        }
    }

}
