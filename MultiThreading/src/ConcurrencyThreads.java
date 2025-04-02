public class ConcurrencyThreads {

    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("My name is " + Thread.currentThread().getName());
            }
        };

        Thread thread1 = new Thread(task, "Vicky");
        Thread thread2 = new Thread(task, "Prathamesh");
        Thread thread3 = new Thread(task, "Sonu");

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.setPriority(1);
        thread2.setPriority(2);
        thread3.setPriority(3);
    }
}
