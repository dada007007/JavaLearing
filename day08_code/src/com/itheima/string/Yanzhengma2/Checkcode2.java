package com.itheima.string.Yanzhengma2;

import java.util.Random;

//生成验证码方法
public class Checkcode2 {
    public String code(int a){
        String code = "";
        Random rd = new Random();
        for (int i = 0; i < a; i++) {
            int choice = rd.nextInt(3);
            switch (choice){
                case 0:
                    code += rd.nextInt(10);
                    break;
                case 1:
                    code += (char)(rd.nextInt(26)+65);
                    break;
                case 2:
                    code += (char)(rd.nextInt(26)+97);
                    break;
            }
        }
        return code;
    }
}
