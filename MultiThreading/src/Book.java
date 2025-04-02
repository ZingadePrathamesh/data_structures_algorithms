public class Book {
    private int pageNumber;


    public synchronized void turnPage(){
        while(true){
            try {
                Thread.sleep(2000);
                System.out.println("Page turned. Current page " + ++pageNumber);
                notifyAll();
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void writePage(){
        while(true){
            try {
                Thread.sleep(2000);
                System.out.println("Page " + pageNumber + " has been written.");
                notifyAll();
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Book book = new Book();
        Thread thread1 = new Thread(new PageWriter(book));
        Thread thread2 = new Thread(new PageTurner(book));

        thread1.start();
        thread2.start();
    }
}

class PageWriter extends Thread{
    private final Book book;
    public PageWriter(Book book){
        this.book = book;
    }
    @Override
    public void run() {
        book.writePage();
    }
}

class PageTurner extends Thread{
    private final Book book;
    public PageTurner(Book book){
        this.book = book;
    }
    @Override
    public void run() {
        book.turnPage();
    }
}
