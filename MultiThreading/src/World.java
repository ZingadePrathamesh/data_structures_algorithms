public class World extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("World sleeping");
            Thread.sleep(5000);
            System.out.println("World woke up");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
