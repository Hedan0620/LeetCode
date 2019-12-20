package cvte;

public class TestIntType {
    public static String getType(Object o){
        return o.getClass().toString();
    }
    public static void main(String[] args) {
        Integer a = new Integer(128);
        int b = 128;
        Integer c = Integer.valueOf(128);
        Integer d = 128;
        System.out.println(getType(a));
        System.out.println(getType(b));
        System.out.println(getType(c));
        System.out.println(getType(d));
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a==d);
        System.out.println(b==d);
    }
}
