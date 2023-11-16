package com.itheima.homework.answer2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String s = "黑马IT全国第一";
        // 编码
        byte[] bytes = s.getBytes();
        // 解码
        String s2 = new String(bytes,"utf-8");
        System.out.println(s2);
        FileInputStream f1 = new FileInputStream("D:\\abc.txt");
        int read = f1.read();
        System.out.println(f1.read());
        byte[] bytes1 = f1.readAllBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

        FileOutputStream f2 = new FileOutputStream("D:\\abcd.txt");
        f2.write(read);
        f2.write(bytes1);
        f2.flush();
    }
}
