import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLock {
    private final Lock lock = new ReentrantLock();

    private int count = 0 ;

    public int getCount(){
        return this.count;
    }

    public void increment(int i){
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try{
                    System.out.println(Thread.currentThread().getName() + " is incrementing by " + i);
                    count += i;
                    System.out.println("Count = " + count);
                }finally {
                    System.out.println("Releasing lock by " + Thread.currentThread().getName());
                    lock.unlock();
                }
            }
        }catch (InterruptedException ex){
            System.out.println(ex.getLocalizedMessage());
            Thread.currentThread().interrupt();
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        UnfairLock unfairLock = new UnfairLock();

        Runnable task =  new Runnable() {
            @Override
            public void run() {
                unfairLock.increment(10);
            }
        };

        Thread one = new Thread(task, "one");
        Thread two = new Thread(task, "two");
        Thread three = new Thread(task, "three");

        one.start();
        two.start();
        three.start();
    }
}
