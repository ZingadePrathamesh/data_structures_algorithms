import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SinglyLinkedList<Integer> nums = new SinglyLinkedList<>();
        System.out.println(nums.getSize());
        nums.addFirst(14);
        nums.addFirst(15);
        nums.addLast(36);
        nums.addLast(40);
        nums.display();
        System.out.println(nums.getSize());
        nums.addAtIndex(2, 54);
        nums.display();
        System.out.println(nums.getSize());
        nums.removeAtIndex(0);
        nums.display();

//        System.out.println(nums.getSize());
//        System.out.println(nums.getFirst());
//        System.out.println(nums.getAtIndex(2));
//        System.out.println(nums.getLast());

        System.out.println(nums.contains(40));
        System.out.println(nums.contains(401));

    }
}