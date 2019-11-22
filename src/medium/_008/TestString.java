package medium._008;

public class TestString {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = null;//空指针
        System.out.println(s1);
        System.out.println(s2);
        if(s1.isEmpty())
            System.out.println("s1 is Empty!");
        if(s1=="")
            System.out.println("s1是空字符串");
        if(s1==null)
            System.out.println("s1是null");
        if(s1.length()==0)
            System.out.println("s1长度是0");
        //注释的代码会报错
/*        if(s2=="")
            System.out.println("s2是空字符串");*/
/*        if(s2.isEmpty())
            System.out.println("s2 is Empty");*/
        if(s2==null)
            System.out.println("s2是null");
/*        if(s2.length()==0)
            System.out.println("s2长度是0");*/
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
