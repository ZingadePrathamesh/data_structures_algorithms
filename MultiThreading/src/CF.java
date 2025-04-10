import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class CF {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Supplier<String> supplier = () -> {
            System.out.println("Started processing...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Done processing.");
            return "ok";
        };

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(supplier, executorService);
        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(supplier, executorService);
        CompletableFuture<String> completableFuture3 = CompletableFuture.supplyAsync(supplier, executorService);

        System.out.println(completableFuture2.thenApply(x -> x));

        System.out.println("main thread");
    }
}
