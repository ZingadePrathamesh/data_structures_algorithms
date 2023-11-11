public class highestAltitude {
    public int largestAltitude(int[] gain) {
        int current =0;
        int maxHeight = 0;
        for(int i= 0 ; i<gain.length ; i++){
            current +=gain[i];
            if(current>maxHeight) maxHeight= current;
        }
        return maxHeight;
    }
}
