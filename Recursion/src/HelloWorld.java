public class HelloWorld {
    public static void main(String[] args) {
//        message();
        numbersPrinting(5);
        numbersPrintingAscending(5);
    }
    public static void message(){
        message1();
        System.out.println(0);
    }
    public static void message1(){
        message2();
        System.out.println(1);
    }
    public static void message2(){
        message3();
        System.out.println(2);
    }
    public static void message3(){
        message4();
        System.out.println(3);
    }
    public static void message4(){
        System.out.println(4);
    }

    public static int numbersPrinting(int n){
        if(n == 1){
            System.out.println(n);
            return 1;
        }
        else{
            int value = 2 *  numbersPrinting(n-1);
            System.out.println(value);
            return value;
        }
    }
    public static int numbersPrintingAscending(int n){
        if(n == 1){
            System.out.println(n);
            return n+1;
        }
        else{
            int value = numbersPrintingAscending(n-1);
            System.out.println(value);
            return value + 1;
        }
    }
}
