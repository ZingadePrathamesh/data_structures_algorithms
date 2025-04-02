public class FactorialPrinter {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[10];
        for (int i = 1; i < 11; i++){
            int finalI = i;
            threads[i-1] = new Thread(() -> {
               int result = factorial(finalI);
                System.out.println(result);
            });
            threads[i-1].start();
        }

        for(Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Time required: " + (System.currentTimeMillis() - startTime));
    }

    public static int factorial(int i){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        int result = 1;
        while(i > 0){
            result *= i--;
        }
        return result;
    }
}
