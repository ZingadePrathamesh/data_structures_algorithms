public class World extends Thread{

    @Override
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName() + " : World");
        }
    }
}
