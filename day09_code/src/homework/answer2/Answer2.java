package homework.answer2;
/*
请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。
比如：Hello12345World中字母：10个，数字：5个。
提示 String 有个 char[] toCharArray() 方法可以将字符串转换成字符数组。
length()方法charAt()方法
*/
public class Answer2 {
    public static int sumNumber(String s) {
        char[] c = s.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] <= '9' && c[i] >= '0') {
                count++;
            }
        }
        return count;
    }

    public static int sumLetter(String s) {
        char[] c = s.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if ((c[i] <= 'z' && c[i] >= 'a') || (c[i] <= 'Z' && c[i] >= 'A')) {
                count++;
            }
        }
        return count;
    }


}
