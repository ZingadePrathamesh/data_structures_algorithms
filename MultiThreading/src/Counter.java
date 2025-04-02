import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Counter {
    private int count = 0;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment(){
        try{
            if(writeLock.tryLock(1000, TimeUnit.MILLISECONDS)){
                System.out.println(Thread.currentThread().getName() + " is incrementing.");
                count++;
            }
        }catch (InterruptedException ex){
            System.out.println(ex.getLocalizedMessage());
        }finally {
            writeLock.unlock();
        }
    }
    public void decrement(){
        try{
            if(writeLock.tryLock(1000, TimeUnit.MILLISECONDS)){
                count++;
            }
        }catch (InterruptedException ex){
            System.out.println(ex.getLocalizedMessage());
        }finally {
            writeLock.unlock();
        }
    }

    public int getCount(){
        readLock.lock();
        try {
            Thread.sleep(5000);
            return this.count;
        }catch (InterruptedException ex){
            System.out.println(ex.getLocalizedMessage());
            return 0;
        }
        finally {
            readLock.unlock();
        }
    }


    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable write = new Runnable() {
            @Override
            public void run() {
                counter.increment();
            }
        };

        Runnable read = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " is reading " + counter.getCount());
            }
        };

        Thread mohan = new Thread(write, "Mohan");
        Thread rahul = new Thread(write, "Rahul");
        Thread sakshi = new Thread(read, "sakshi");
        Thread laxmi = new Thread(read, "laxmi");

        mohan.start();
        rahul.start();
        sakshi.start();
        laxmi.start();

    }
}
