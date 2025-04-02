public class DecrementCounter extends Thread{
    private Counter counter;

    public DecrementCounter(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName());
            counter.decrement();
        }
    }
}
