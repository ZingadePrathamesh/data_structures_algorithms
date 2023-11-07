public class RichestCustomerWealth {
    public static void main(String[] args) {
        System.out.println();
    }
}
class SolutionRCW {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] account: accounts){
            int wealth = 0;
            for(int w : account){
                wealth+= w;
            }
            if( maxWealth < wealth) maxWealth = wealth;
        }
        return maxWealth;
    }
}
