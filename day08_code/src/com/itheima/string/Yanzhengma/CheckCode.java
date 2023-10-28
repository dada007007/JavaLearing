package com.itheima.string.Yanzhengma;

import java.util.Random;

public class CheckCode {
    public String code(int a) {
        String code = "";
        String character = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int i = 0; i < a; i++) {
            int num = new Random().nextInt(character.length());
            code += character.charAt(num);
        }
        return code;
    }
}
