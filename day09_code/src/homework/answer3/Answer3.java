package homework.answer3;
//敏感词替换 ，屏蔽特定敏感词
import java.util.Scanner;

public class Answer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s1 = sc.next();
        System.out.println("请输入需要屏蔽特定的字符串：");
        String s2 = sc.next();
        System.out.println(s1.replace(s2,"***"));
    }
}
