public class StringConstantPool {
    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        String c = a;
        String d = new String("a");

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a==d);
    }
}
