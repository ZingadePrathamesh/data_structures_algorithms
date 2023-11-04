class Students{
     int[] marks = new int[5];
}


public class exp1 {
    public static void main(String[] args) {
        Students s1 = new Students();

        s1.marks[1] = 90;
        s1.marks[0] = 100;
        Students s2 = new Students();

        System.out.println(s2.marks[1]);
    }
}
