package homework.answer1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入你想验证的字符串：");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Answer1 a = new Answer1();
        boolean b = a.checkString(s);
        if(b){
            System.out.println("您输入的字符串为回文字符串");
        }else {
            System.out.println("您输入的字符串不是回文字符串");
        }
    }
}
