package com.itheima.d4_byte_stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo3 {
    public static void main(String[] args) throws Exception {
        // 目标：学会如何使用文件字节输入流一次性读取完文本的全部字节，
        // 以此避免读取汉字乱码的问题。
        // 1、创建文件字节输入流管道与源文件接通。
        InputStream is =
                new FileInputStream("day08-stream-file-io\\src\\dlei05.txt");

//        // 2、定义一个字节数组与文件大小一样大
//        File file = new File("day08-stream-file-io\\src\\dlei05.txt");
//        byte[] buffer = new byte[(int) file.length()];
//
//        // 3、开始装字节到字节数组中去
//        int len = is.read(buffer);
//        System.out.println("文件大小：" + file.length());
//        System.out.println("读取字节数：" + len);
//
//        // 4、输出字节数组的内容
//        String rs = new String(buffer);
//        System.out.println(rs);

        // Java已经为我们提供了一次性读完文件的全部字节到一个字节数组中返回给我们
        byte[] buffer = is.readAllBytes();
        String rs = new String(buffer);
        System.out.println(rs);
    }
}
