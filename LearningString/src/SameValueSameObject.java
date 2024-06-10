public class SameValueSameObject {
    public static void main(String[] args) {
        String a = "Prathamesh";
        String b = "Prathamesh";

        // a and b are pointing to the same object
        System.out.println(a == b);

        String c = new String("Original");
        String d = new String("Original");
        String e = "Original";

        // c and d are not pointing to the same object. infact the value "Original" is not stored in String pool but outside in the heap.
        System.out.println(c == d);

        // e and d are also not same;

        String f = new String("This is same").intern();
        String g = "This is same";

        System.out.println(f == g);

    }
}
