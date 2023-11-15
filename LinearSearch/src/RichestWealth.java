public class RichestWealth {
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
