public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
        System.out.println(optimizedReverseBit(43261596));
        System.out.println(bestReverseBit(43261596));
    }
    public static int reverseBits(int n) {
        StringBuilder str  = new StringBuilder(Integer.toBinaryString(n));
        StringBuilder remainingString = new StringBuilder();
        for(int  i = 0; i< (32-str.length()); i++){
            remainingString.append('0');
        }
        StringBuilder finalString = new StringBuilder(remainingString + "" +str);
        int revInteger =0;

        for(int i = 0; i<finalString.length(); i++){
            if(finalString.charAt(i) == '1'){
                int mask = 1<<i;
                revInteger |= mask;
            }
        }
        return revInteger;
    }

    public static int optimizedReverseBit(int num){
        int result = 0;
        for(int i = 0; i<32; i++){
            result <<= 1;
            result |= num & 1;
            num >>= 1;
        }
        return result;
    }

    public static int bestReverseBit(int num){
        return Integer.reverse(num);
    }

}
