public class DeadlockExample {

    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread task1 = new Thread(new Task1(pen, paper), "task 1");
        Thread task2 = new Thread(new Task2(pen, paper), "task 2");

        task1.start();
        task2.start();
    }
}

class Pen{
    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName() + " writing with pen and paper.");
        paper.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " Finished Writing.");
    }
}

class Paper{
    public synchronized void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName() + " writing with paper and pen.");
        pen.finishWriting();
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " Finished writing.");
    }
}

class Task1 implements Runnable{
    Paper paper;
    Pen pen;

    public Task1(Pen pen, Paper paper){
        this.paper = paper;
        this.pen = pen;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper);
    }
}

class Task2 implements Runnable{
    Paper paper;
    Pen pen;

    public Task2(Pen pen, Paper paper){
        this.paper = paper;
        this.pen = pen;
    }

    @Override
    public void run() {
        paper.writeWithPaperAndPen(pen);
    }
}
