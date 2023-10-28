package homework.answer4;
//接受11位手机号码，中间4位用*屏蔽

import java.util.Scanner;

public class Answer4 {
    public static void main(String[] args) {
        System.out.println("请输入11位手机号码：");
        while (true) {
            Scanner sc = new Scanner(System.in);
            String number = sc.next();
            if (number.length() == 11) {
                String number1 = number.substring(0, 3);
                String number2 = number.substring(7);
                String number3 = number1 + "****" + number2;
                System.out.println(number3);
                return;
            } else {
                System.out.println("您输入的电话号码尾数不为11位，请重新输入");
            }
        }
    }
}
