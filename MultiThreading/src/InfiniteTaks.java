import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InfiniteTaks {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Callable<Integer> task1 = () -> {
            Thread.sleep(2000);
            return 1;
        };

        Callable<Integer> task2 = () ->{
            Thread.sleep(5000);
            return 2;
        };

        try {
           List<Future<Integer>> futures = executorService.invokeAll( Arrays.asList(task1, task2), 3000, TimeUnit.MILLISECONDS);
           for(Future<Integer> future: futures){
               System.out.println("Waitiing...");
               System.out.println(future.get());
           }
        } catch (CancellationException | ExecutionException | InterruptedException e) {
            System.out.println(e.getLocalizedMessage());
        }

        executorService.shutdown();
    }
}
