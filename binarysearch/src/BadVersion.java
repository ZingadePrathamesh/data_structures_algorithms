public class BadVersion {
}

class Solution{
    public int firstBadVersion(int n) {
        if(n==1) return 1;
        else{
            int start   =   1;
            int end     =   n;
            int mid     =  start + (end - start)/2;
            while(start<=end){
                mid = start + (end - start)/2;
                if(isBadVersion(mid)) end = mid-1;
                else start = mid +1;
            }
            return start;
        }
    }

    public boolean isBadVersion(int num){
        int bad =  5;
        if(num > bad) return true;
        return false;
    }
}

