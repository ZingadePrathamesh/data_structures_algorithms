import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RentrantExample {
    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
//        lock.lock();
        if(lock.tryLock()){
            try{
                System.out.println("outer method locked.");
                innerMethod();
            }catch (Exception e){

            }finally {
                lock.unlock();
            }
        }
    }

    public void innerMethod(){
//        lock.lock();
        if (lock.tryLock()){
            try {
                System.out.println("Inner method locked.");
            }finally {
                lock.unlock();
            }
        }

    }

    public static void main(String[] args) {
        RentrantExample example = new RentrantExample();

        example.outerMethod();
    }

}
