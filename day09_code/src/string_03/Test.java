package string_03;

public class Test {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2);
        char[] c = {1,2,3,4,5};
        StringBuilder s3 = new StringBuilder();
        s3.append('a');
        s3.append('b');
        s3.append('c');
        System.out.println(s3.reverse());

    }


}
