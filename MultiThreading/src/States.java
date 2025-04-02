public class States {

    public static void main(String[] args) {
        RestartThread thread = new RestartThread();
        thread.start();
        while (true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Stopping thread now.");
            thread.interrupt();
        }
    }
}

class RestartThread extends Thread{
    @Override
    public void run() {
        try{
            while(true){
                System.out.println("Thread is running");
                Thread.sleep(2000);
            }
        }catch (InterruptedException ex){
            System.out.println("Restarting the thread");
            RestartThread thread = this;
            thread.start();
        }
    }
}
