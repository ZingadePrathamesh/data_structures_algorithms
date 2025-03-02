public class Counter {
    private int count = 0;

    public void increment(){
        synchronized (this){
            this.count++;
        }
    }

    public int getCount(){
        return this.count;
    }
}
