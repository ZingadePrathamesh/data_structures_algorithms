import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FactorialPrinterExecutor {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<?>> futures = new ArrayList<>();
            for (int i = 1; i < 11; i++){
                int finalI = i;
                futures.add(executorService.submit(() -> factorial(finalI)));
            }

            for (Future<?> future : futures){
                try {
                    System.out.println(future.get());
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        executorService.shutdown();

        System.out.println("Time passed: " + (System.currentTimeMillis() - startTime));
    }

    public static int factorial(int i ){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        int result = 1;
        while (i > 0){
            result *= i--;
        }
        return result;
    }
}
