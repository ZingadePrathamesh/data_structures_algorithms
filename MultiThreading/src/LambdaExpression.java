public class LambdaExpression {
    private static int a = 0;

    public static void main(String[] args) {
        Student biologyStudent = name -> name + " is a biology student";
        System.out.println(biologyStudent);

        Thread thread = operation("Rohan");
        thread.start();

    }

    public static Thread operation(String name){
        return new Thread(() -> System.out.println(name));
    }
}

interface Student{
    public String getBio(String name);
}

class Student1 implements Runnable{
    private static String name;

    public Student1(String nam){
        name = nam;
    }

    @Override
    public void run() {
        System.out.println(name);
    }
}
