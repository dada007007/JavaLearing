package homework.answer5;

import java.util.Scanner;

/*
请编写程序，由键盘录入一个字符串，把字符串中的所有字母都变成大写后输出,再把字符串中的所有字母变成小写后输出。
比如：
键盘录入字符串:Hello12345World~!#$
控制台输出:
转换后的大写字符串: HELLO12345WORLD~!#$
转换后的小写字符串: hello12345world~!#$
方法提示
String toUpperCase()
String toLowerCase()
*/
public class Answer5 {
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        s = sc.next();
        System.out.println("变为大写字母后的字符串为：" + s.toUpperCase());
        System.out.println("变为小写字母后的字符串为：" + s.toLowerCase());
    }
}
