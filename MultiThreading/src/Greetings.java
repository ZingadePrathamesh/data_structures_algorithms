public class Greetings implements Runnable{

    public static void main(String[] args) throws InterruptedException {
        Greetings greetings = new Greetings();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": Started");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + ": completed.");
            }
        };
        Thread thread = new Thread(greetings, "Rahul");
        Thread thread2 = new Thread(runnable, "Mohit");
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();

        System.out.println("Done!");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Started");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + ": completed.");
    }
}
