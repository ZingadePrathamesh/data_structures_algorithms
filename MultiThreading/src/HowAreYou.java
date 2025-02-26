public class HowAreYou implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName() + ", How are you?");
        }
    }
}
