public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        IncrementCounter th1 = new IncrementCounter(counter);
        DecrementCounter th2 = new DecrementCounter(counter);

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        }catch (Exception e){
            throw new InterruptedException(e.getLocalizedMessage());
        }

        System.out.println(counter.getCount());
    }

    public static void printName(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}