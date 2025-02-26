public class MovingRobot {
    public static void main(String[] args) {

    }

    public boolean judgeCircle(String moves) {
        int[] arr = new int[2];
        for(int i = 0; i < moves.length(); i++){
            move(arr, moves.charAt(i));
        }
        if(arr[0] == 0 && arr[1] == 0) return true;
        else return false;
    }

    public void move(int[] nums, char c){
        switch (c){
            case 'L' -> nums[1]++;
            case 'R' -> nums[1]--;
            case 'U' -> nums[0]++;
            case 'D' -> nums[0]--;
        }
    }
}
