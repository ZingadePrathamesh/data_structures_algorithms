import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Football{
    private int goals = 0;
    private final Lock lock = new ReentrantLock();

    public int getGoals(){
        return this.goals;
    }

    public void incrementGoals() {
        System.out.println(Thread.currentThread().getName() + " trying to score a goal");
        try {
            if(lock.tryLock(2000, TimeUnit.MILLISECONDS)){
                Thread.sleep(500);
                System.out.println("GoooooaaaaaL!");
                this.goals++;
            }
        }catch (InterruptedException ie){
            System.out.println("Went Wrong!");
        }finally {
            StringBuilder name = new StringBuilder(new String("abc"));
            name.deleteCharAt(2);

            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Football football = new Football();

        Runnable ronaldo = football::incrementGoals;

        Thread messiThread = new Thread(ronaldo, "messi");
        Thread ronaldoThread = new Thread(ronaldo, "ronaldo");

        messiThread.start();
        ronaldoThread.start();

        messiThread.join();
        ronaldoThread.join();

        System.out.println(football.getGoals());
    }
}
