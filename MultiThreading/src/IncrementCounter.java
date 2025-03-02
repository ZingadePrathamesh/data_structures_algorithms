public class IncrementCounter extends Thread{
    private final Counter counter;

    public IncrementCounter(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName());
            counter.increment();
        }
    }
}
