import com.sun.security.jgss.GSSUtil;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(binaryGap(8));
        System.out.println(binaryGap(22));
        System.out.println(binaryGap(5));
    }
    public static int binaryGap(int n) {
      boolean flag = false;
      int maxGap = 0;
      int currentGap = 0;
      int num = n;
      while(num>0){
          num = num & num - 1;
          currentGap++;
      }
      if(currentGap <2) return 0;
      currentGap = 0;
      while(n > 0){
          if(flag && (n&1) == 0) currentGap++;
          else if((n&1) != 0){
              flag = true;
              maxGap = Math.max(currentGap+1, maxGap);
              currentGap = 0;
          }
          n>>=1;
      }
      return maxGap;
    }
}
