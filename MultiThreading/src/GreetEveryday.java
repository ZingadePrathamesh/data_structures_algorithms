import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class GreetEveryday {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<?> future = executorService.scheduleAtFixedRate(() -> System.out.println("Good Morning"),
        2, 2, TimeUnit.SECONDS);

        executorService.schedule(() -> future.cancel(true),5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        executorService.shutdown();

    }
}
