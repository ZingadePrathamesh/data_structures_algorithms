import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Notebook {
    private StringBuilder notebook = new StringBuilder();
    private Lock lock = new ReentrantLock();

    public void readNotebook(){
        System.out.println(notebook.toString());
    }

    public void writeNotebook(String text) {
        try {
            if (lock.tryLock(3000, TimeUnit.MILLISECONDS)) {
                try{
                    System.out.println(Thread.currentThread().getName() + " is writing");
                    notebook.append(text);
                    Thread.sleep(5000);
                    System.out.println("Writing done!");
                }catch (Exception e){
                    System.out.println(e.getLocalizedMessage());
                }finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Notebook not available for " + Thread.currentThread().getName());
            }
        } catch (InterruptedException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }

    public static void main(String[] args) {
        Notebook notebook1 = new Notebook();

        Runnable writing = new Runnable() {
            @Override
            public void run() {
                notebook1.writeNotebook("Hi myself, " + Thread.currentThread().getName() + "\n");
            }
        };

        Thread Monica = new Thread(writing, "Monica");
        Thread Soniya = new Thread(writing, "Soniya");

        Monica.start();
        Soniya.start();

        try{
            Monica.join();
            Soniya.join();
            notebook1.readNotebook();
        }catch (InterruptedException ex){
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
