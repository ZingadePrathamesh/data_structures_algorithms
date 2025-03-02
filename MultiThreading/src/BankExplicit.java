import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankExplicit {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    try {
                        System.out.println(Thread.currentThread().getName() + " withdrawing " + amount);
                        Thread.sleep(500);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " current balance " + balance);
                    }catch (Exception e){
                        Thread.currentThread().interrupt();
                    }
                }else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance.") ;
                }
            }else{
                System.out.println(Thread.currentThread().getName() + " unable to acquire lock. Will try again later");
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        BankExplicit bank = new BankExplicit();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                bank.withdraw(50);
            }
        };

        Thread t1 = new Thread(task, "Rahul");
        Thread t2 = new Thread(task, "Mohit");

        t1.start();
        t2.start();
    }
}
