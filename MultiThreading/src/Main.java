public class Main {
    public static void main(String[] args) {
        World world = new World();
        world.start();

        HowAreYou howAreYou = new HowAreYou();
        Thread thread = new Thread(howAreYou);
        thread.start();
        while (true){
            System.out.println(Thread.currentThread().getName() +  " : Hello");
        }
    }
}