import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Library {
    private String book = "Harry potter and goblin";
    private Lock lock = new ReentrantLock();

    public void readBook(){
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                System.out.println(Thread.currentThread().getName() + " is reading " + book);
                Thread.sleep(1000);
            }
            else{
                System.out.println("Book not available for " + Thread.currentThread().getName());
            }
        }catch (InterruptedException exception){
            System.out.println(exception.getLocalizedMessage());
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Runnable reading = new Runnable() {
            @Override
            public void run() {
                library.readBook();
            }
        };

        Thread rahul = new Thread(reading, "Rahul");
        Thread mohit = new Thread(reading, "Mohit");

        rahul.start();
        mohit.start();
    }


}
