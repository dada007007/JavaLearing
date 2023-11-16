package com.itheima.d4_byte_stream;

import java.io.*;

public class CopyTest5 {
    public static void main(String[] args) {
        // 目标：使用字节流完成文件的复制。
        // E:\resource\aaa.png  ===> D:\resource\aaaNew.png
        try {
            // 1、创建一个文件字节输入流与源文件接通
            InputStream is = new FileInputStream("E:\\resource\\aaa.png");
            // 2、创建一个文件字节输出流与目标文件接通
            OutputStream os =  new FileOutputStream("E:\\resource\\aaaNew.txt");
            // 3、开始定义字节数组转移数据
            byte[] buffer = new byte[1024]; // 1KB
            // 1024 + 1024 + 3
            // 4、开始转移字节到目标文件
            int len; // 记录每次读取的字节数。
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            os.close();
            is.close();
            System.out.println("复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
