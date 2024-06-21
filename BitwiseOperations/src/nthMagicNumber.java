public class nthMagicNumber {
    public static void main(String[] args) {
        for(int i  = 1; i< 10; i++){
            System.out.println(magicNumber(i));
            System.out.println(magicNumberByKunal(i));
        }
    }
    public static int magicNumber(int term){
        if(term == 1) return 5;
        if(term == 2) return 25;
        else{
            int magicNumber = 0;
            for(int i = 0; i<32; i++){
                if((term & (1<<i)) != 0) magicNumber += (int) Math.pow(5, i+1);
            }
            return magicNumber;
        }
    }
    public static int magicNumberByKunal(int term){
        int base = 5;
        int magicNumber = 0;
        if(term == 1) return 5;
        else{
            while(term>0){
                int last =  term & 1;
                term = term >> 1;
                magicNumber += last * base;
                base *= 5;
            }
            return magicNumber;
        }
    }
}
