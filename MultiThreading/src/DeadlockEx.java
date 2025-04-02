public class DeadlockEx {
    public static void main(String[] args) {
        Water water = new Water();
        Ice ice = new Ice();

        Process1 process1 = new Process1(water, ice);
        Process2 process2 = new Process2(water, ice);

        Thread thread1 = new Thread(process1, "ice");
        Thread thread2 = new Thread(process2, "water");

        thread1.start();
        thread2.start();
    }
}

class Water{
    public synchronized void turnIntoWaterFromIce(Ice ice){
        System.out.println(Thread.currentThread().getName() + "trying turn into water from ice");
        ice.turingIntoWater();
    }

    public synchronized void turningIntoIce(){
        System.out.println("turning into ice.");
    }
}

class Ice{
    public synchronized void turnIntoIceFromWater(Water water){
        System.out.println(Thread.currentThread().getName() + "trying turn into ice from water");
        water.turningIntoIce();
    }

    public synchronized void turingIntoWater(){
        System.out.println("turning into water.");
    }
}

class Process1 implements Runnable{
    Water water;
    Ice ice;

    public Process1(Water water, Ice ice){
        this.water = water;
        this.ice = ice;
    }

    @Override
    public void run() {
        water.turnIntoWaterFromIce(ice);
    }
}

class  Process2 implements Runnable{
    Water water;
    Ice ice;

    public Process2(Water water, Ice ice){
        this.water = water;
        this.ice = ice;
    }

    @Override
    public void run() {
        synchronized (water){ //used to avoid deadlock
            ice.turnIntoIceFromWater(water);
        }
    }
}
