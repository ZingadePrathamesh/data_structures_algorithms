import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExperimentThreadNesting {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            ExecutorService executorService = Executors.newFixedThreadPool(5);
            List<Callable<Integer>> callables = new ArrayList<>();
            for (int i = 1; i < 10; i++) {
                int finalI = i;
                callables.add(() -> FactorialPrinter.factorial(finalI));
            }

            List<Future<Integer>> futures;
            try {
                futures = executorService.invokeAll(callables);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            for (Future<Integer> future : futures) {
                try {
                    System.out.println(future.get());
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }

            executorService.shutdown();
            System.out.println("First layer completed");
        });

        thread.start();
        System.out.println("Main thread completed.");
    }


}
