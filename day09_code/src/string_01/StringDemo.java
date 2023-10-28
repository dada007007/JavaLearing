package string_01;

public class StringDemo {
    public static void main(String[] args) {
        String name1 = "abc";
        String name2 = "石破天";

        String s1 = new String();
        System.out.println(s1);
        System.out.println(s1.length());
        String s2 = new String("abc");
        System.out.println(s2);
        System.out.println(s2.length());
        //定义字符数组
        char[] chars = {'a','b','c'};
        String s3 = new String(chars);
        System.out.println(s3);
        //定义字节数组
        byte[] bytes = {100, 99, 98};
        String s4 = new String(bytes);
        System.out.println(s4);
    }
}
