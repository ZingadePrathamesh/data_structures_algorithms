public class HeightOrder {
    public int heightChecker(int[] heights) {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        for(int i : heights){
            expected.add(i);
        }
        expected.sort(null);
        int result = 0;
        for(int i = 0; i<heights.length; i++){
            if(expected.get(i) != heights[i]) result++;
        }
        return result;
    }
}


