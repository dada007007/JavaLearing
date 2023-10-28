package com.itheima.ATM;

import javax.naming.BinaryRefAddr;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    ArrayList<Account> accounts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Random rc = new Random();

    public void start() {
        while (true) {
            System.out.println("=欢迎进入黑马银行ATM系统=");
            System.out.println("1.用户登录");
            System.out.println("2.用户开户");
            System.out.println("3.退出");
            System.out.println("请选择您要操作的命令：");
            int command = sc.nextInt();
            switch (command) {
                case 1://用户登录
                    loginAccount();
                    break;
                case 2://用户开户
                    createAccount();
                    break;
                case 3://用户退出

                    return;
                default:
                    System.out.println("请输入正确操作");
            }
        }
    }

    private void createAccount() {
        //1、创建一个账户对象，赋值给账户对象
        Account acc = new Account();
        //2、需要用户输入自己的用户信息，赋值给账户对象
        System.out.println("==系统开户操作==");
        System.out.println("请您输入账户用户名：");
        String name = sc.next();
        acc.setUserName(name);
        while (true) {
            System.out.println("请您输入您的性别：");
            char sex = sc.next().charAt(0);

            if (sex == '男' || sex == '女') {
                acc.setSex(sex);
                break;
            } else {
                System.out.println("您输入的性别有误，请重新输入");
            }
        }

        while (true) {
            System.out.println("请您输入账户密码：");
            String password = sc.next();

            System.out.println("请您确认账户密码：");
            String password2 = sc.next();
            if (password.equals(password2)) {
                acc.setPassWord(password);
                break;
            } else {
                System.out.println("您两次输入的密码不一样，请重试");
            }
        }
        System.out.println("请您输入您的取现额度：");
        double limit = sc.nextDouble();
        acc.setLimit(limit);

        // 重点：为账户生成一个随机卡号
        String newCardId = createCardId();
        acc.setCardId(newCardId);


        //3、把这个账户对象，存入到账户集合中
        accounts.add(acc);
        if (acc.getSex() == '男') {
            System.out.println("恭喜您" + acc.getUserName() + "先生,开户成功,您的卡号是：" + acc.getCardId());
        } else {
            System.out.println("恭喜您" + acc.getUserName() + "女士,开户成功，您的卡号是：" + acc.getCardId());
        }
    }

    private String createCardId() {
        while (true) {
            String cardId = "";

            for (int i = 0; i < 8; i++) {
                int data = rc.nextInt(10);
                cardId += data;
            }
            //cardId中记住的卡号是否与其他账户的卡号重复
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                //说明没有找到cardId，没重复；可以返回作为新卡号
                return cardId;
            }
        }

    }

    private Account getAccountByCardId(String cardId) {
        // 遍历全部的账户对象
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }

    private void loginAccount() {

    }

}
