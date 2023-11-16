package com.itheima.d4_byte_stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        // 目标：掌握文件字节输入流每次读取多个字节。
        // 1、创建文件字节输入流管道与源文件接通。
        InputStream is = new FileInputStream("day08-stream-file-io\\src\\dlei04.txt");

        // 2、开始读取数据到字节数组,返回读取的字节数，如果没有数据可读，返回-1:
        // public int read(byte b[])
        byte[] buffer = new byte[3];

//        int len = is.read(buffer);
//        System.out.println("读取了" + len + "个字节~");
//        String rs = new String(buffer);
//        System.out.println(rs);
//
//        int len2 = is.read(buffer);
//        System.out.println("读取了" + len2 + "个字节~");
//        // 读取多少就应该倒出多少
//        String rs2 = new String(buffer, 0, len2);
//        System.out.println(rs2);
//
//        int len3 = is.read(buffer);
//        System.out.println(len3);

        // 3、循环改进
        int len; // 记录每次读取了多少个字节。
        while ((len = is.read(buffer)) != -1) {
            // 读取多少就应该倒出多少
            String rs = new String(buffer, 0 , len);
            System.out.print(rs);
        }
        is.close();

        // 拓展：这种方式读取的性能得到了优化！！ 但是依然无法避免读取汉字乱码的问题，
    }
}
