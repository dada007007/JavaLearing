package homework.answer1;
//请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
//
//例如："abcba"、"上海自来水来自海上"均为对称字符串。
public class Answer1 {
    public boolean checkString(String s) {
        String s1 = "";
        for (int length = s.length() - 1; length >= 0; length--) {
            s1 += s.charAt(length);
        }
        System.out.println("回文后的字符串为：" + s1);
        return s1.equals(s);
    }
}
