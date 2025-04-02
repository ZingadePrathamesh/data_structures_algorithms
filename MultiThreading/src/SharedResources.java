public class SharedResources {
    private int data;
    private boolean hasData;

    public static void main(String[] args) {
        SharedResources resources = new SharedResources();

        Consumer consumer = new Consumer(resources);
        Producer producer = new Producer(resources);

        consumer.start();
        producer.start();
    }

    public synchronized void produce(int value){
        while(hasData){
            try{
                wait();
            }catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }

        hasData = true;
        data = value;
        System.out.println("Produce data: " + value);
        notify();
    }

    public synchronized int consume(){

        while (!hasData){
            try {
                wait();
            }catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }

        hasData = false;
        System.out.println("Consumed data: " + data);
        notify();
        return data;
    }
}

class Producer extends Thread{

    private SharedResources sharedResources;

    public Producer(SharedResources resources){
        this.sharedResources = resources;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            sharedResources.produce(i);
        }
    }
}

class Consumer extends Thread{
    private SharedResources sharedResources;

    public Consumer(SharedResources resources){
        this.sharedResources = resources;
    }
    @Override
    public void run() {
        for(int i = 0 ; i< 10; i++){
            sharedResources.consume();
        }
    }
}