package day04_WorkingWithObjects;

public class TestString {
    // 利用String类中的方法对字符串进行操作
    public static void main(String[] args) {
        String str = "Now is the winter of our discontent";
        // 输出字符串
        System.out.println("The string is: " + str);
        // 输出字符串长度
        System.out.println("Length of this string: "
                        + str.length());
        // 输出字符串第6个字符
        System.out.println("The character at position 5: "
                        + str.charAt(5));
        // 输出字符串第12-20个字符
        System.out.println("The substring from 11 to 19: "
                        + str.substring(11, 19));
        // 输出d的下标
        System.out.println("The index of the character d: "
                        + str.indexOf('d'));
        // 输出o的下标
        System.out.println("The index of the character o: "
                        + str.indexOf('o'));
        // 输出匹配字符串的下标位置
        System.out.print("The index of the begining of the ");
        System.out.println("substring \"winter\" : "
                        + str.indexOf("winter"));
        // 将字符串改为大写后进行输出
        System.out.println("The string in upper case: "
                        + str.toUpperCase());




    }
}
