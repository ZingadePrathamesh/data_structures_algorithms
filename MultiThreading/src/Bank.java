public class Bank {
    private int balance = 100;

    public synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw.");
        if(balance >= amount){
            System.out.println(Thread.currentThread().getName() + " withdrawing " + amount);
            Thread.sleep(10000);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " remaining balance " + balance);
        }else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance");
        }
    }


    public static void main(String[] args) {
        Bank bank = new Bank();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    bank.withdraw(50);
                } catch (InterruptedException e) {
                }
            }
        };

        Thread t1 = new Thread(task, "Rahul");
        Thread t2 = new Thread(task, "Mohit");

        t1.start();
        t2.start();
    }
}
