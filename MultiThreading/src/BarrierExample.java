import java.util.concurrent.*;

public class BarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(4, () ->
                System.out.println("All sub systems are initialised without any failure!"));

        Subsystem database = new Subsystem(2000, barrier);
        Subsystem server = new Subsystem(3000, barrier);
        Subsystem cloud = new Subsystem(2000, barrier);
        Subsystem streaming = new Subsystem(5000, barrier);


        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(database);
        executorService.submit(server);
        executorService.submit(cloud);
        executorService.submit(streaming);

        System.out.println("System up and running!");
        executorService.shutdown();
    }
}

class Subsystem implements Callable<String>{
    private final int initializingTime;
    private final CyclicBarrier barrier;

    public Subsystem(int initializingTime, CyclicBarrier barrier) {
        this.initializingTime = initializingTime;
        this.barrier = barrier;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " started initializing");
        Thread.sleep(initializingTime);
        System.out.println(Thread.currentThread().getName() + " initialised.");

        barrier.await();
        return "ok";
    }
}
