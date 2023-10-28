package string_02;

public class StringMethodDemo02 {
    public static void main(String[] args) {
        //String subString(int beginIndex, int endIndex)
        //  截取字符串 的指定范围[]()
        String str = "又香又大新疆羊肉串哦";
        System.out.println(str.substring(4, 9));
        System.out.println(str.substring(4));

        //替换功能 String replace()
        String str2 = "你个垃圾，0杀0助攻20死...垃圾死了";
        System.out.println(str2.replaceAll("垃圾", "**"));
    }
}
