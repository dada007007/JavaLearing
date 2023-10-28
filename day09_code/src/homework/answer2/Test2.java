package homework.answer2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Answer2 a = new Answer2();
        System.out.println("请输入您想统计的字符串：");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("字符串中的英文字母有：" + a.sumNumber(s) + "个");
        System.out.println("字符串中的数字有：" + a.sumLetter(s) + "个");
    }
}
