public class InfinitePrinter {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println("printing...");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException ex){
                        throw new RuntimeException(ex.getLocalizedMessage());
                    }
                }
            }
        };


        Thread printer = new Thread(task);
        printer.setDaemon(true);

        printer.start();
        printer.join();
//        Thread.sleep(5000);
//        Thread.currentThread().interrupt();

        Thread.sleep(5000);

        System.out.println("Main threads stopping");
    }


}
